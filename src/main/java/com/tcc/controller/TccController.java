package com.tcc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.tcc.pojo.*;
import com.tcc.service.TccService;
import com.tcc.utils.DateUtil;
import com.tcc.utils.ImgId;
import com.tcc.utils.SysUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.unbescape.html.HtmlEscape;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class TccController {
    @Autowired
    TccService service;
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("plinsert")
    public String plinsert(){ return  "plinsert";}
    @RequestMapping("userindex")
    public String userindex(){ return  "userindex";}
    @RequestMapping("carin")
    public String carin(){ return  "carin";}
    @RequestMapping("carout")
    public String carout(){ return  "carout";}
    @RequestMapping("Sysset")
    public String Sysset(){ return  "Sysset";}
    @RequestMapping("Sysset2")
    public String Sysset2(){ return  "Sysset2";}
    @RequestMapping("hdyear")
    public String hdyear(){ return  "hdyear";}
    @RequestMapping("hdyear1")
    public String hdyear1(){ return  "hdyear1";}
    //管理员登录
    @RequestMapping("userlogin")
    public String userlogin(AdmTable admTable,Model model){
        AdmTable adm=service.userlogin(admTable);
        if (adm==null){
            model.addAttribute("msg","账号或密码错误");
            return "login";

        }else  if (adm.getPow().equals("管理员")){

                return  "redirect:PlFindAll";

        }else{
            return "login";
        }

    }

    //查询所有车位
    //查看所有车辆记录
    @RequestMapping("PlFindAll")
    public String  PlFindAll(Model model,PlTable plTable,YearTable yearTable){
        List<PlTable> list= service.PlFindAll();
        List<CarTable> list1=service.carfindall();
        List<PlTable> pllist=service.PlFindAll1(plTable);
        List<PlTable> pllist2=service.PlFindAll2(plTable);
        model.addAttribute("list1",list1);
        model.addAttribute("list",list);
        int result=list.size();
        int result1=pllist.size();
        int result2=pllist2.size();
        int f=service.selectYearSum();
        int w=service.selectCarSum();
        int a=f+w;
        int yearnum=service.selectYearNum();
        model.addAttribute("f",f);
        model.addAttribute("a",a);
        model.addAttribute("num",result);
        model.addAttribute("num1",result1);
        model.addAttribute("num2",result2);
        model.addAttribute("num3",yearnum);
        return "index";
    }

    //注销车位
    @RequestMapping("PlDelete")
    public String PlDelete(int id,CarTable carTable){
        CarTable car=service.CarJiaoYan1(carTable);
        if (car==null){
            service.PlDelete(id);
            return "redirect:PlFindAll";
        }else{
            return "redirect:PlFindAll";
        }

    }
    //添加车位
    @RequestMapping("PlJiaoYan")
    public String PlJiaoYan(PlTable plTable, Model model, HttpSession session){
        PlTable pl= service.PlJiaoYan(plTable);
        System.out.println(pl);
        if (pl==null){
            plTable.setPlState("空闲");
            service.PlInsert(plTable);
            return "redirect:PlFindAll";
        }else{
            model.addAttribute("jiaoyan","车位已存在，请重新添加");
            return "plinsert";
        }
    }
    //停车校验
    @RequestMapping("/CarJiaoYan")
    public String CarJiaoYan(@RequestParam(value = "file", required = false) MultipartFile file, PlTable plTable, Model model, CarTable carTable) throws IOException {
        //图片上传成功后，将图片的地址写到数据库
        String filePath= "D:\\image";
        //获取原始图片的拓展名
        String originalFilename = file.getOriginalFilename();
        //新的文件名字
        String newFileName= UUID.randomUUID()+ originalFilename;
        //封装上传文件位置的全路径
        File targetFile = new File(filePath,newFileName);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        ImgId imgId= new ImgId();
        String res = imgId.licensePlate(targetFile.getAbsolutePath());
        carTable.setCarPl(res);
        PlTable pl=service.CarJiaoYan(plTable);
        CarTable car=service.CarJiaoYan1(carTable);
        FreeTable free= service.FreeJiaoYan2(carTable);
        YearTable year=service.yearJiaoYan1(carTable);
        if (pl==null){
            model.addAttribute("carjioayan","目前没有车位");
            return "carin";
        }else{
            if (car==null){
                pl.setPlState("占用");
                service.PlUpdate(pl);
                carTable.setCarBrand(pl.getPlParking());
                carTable.setCarUtime(SysUtils.d2s(new Date()));
                carTable.setCarMoney(0);
                carTable.setCarState("正在停车");
                carTable.setCarPl(res);

                if (free!=null){
                    carTable.setCarType("免费车辆");
                }else if(year!=null){
                    carTable.setCarType("年卡车辆");
                }else{
                    carTable.setCarType("普通车辆");
                }
                service.CarInsert(carTable);
                return "userindex";
            }else{
                model.addAttribute("mag","您正在停车");
                return "carin";
            }

        }
    }
    //取车校验
    @RequestMapping("upcar")
    public String upcar(@RequestParam(value = "file", required = false) MultipartFile file,CarTable carTable,Model model,PlTable plTable,HttpSession session) throws Exception {
        //图片上传成功后，将图片的地址写到数据库
        String filePath= "D:\\image";
        //获取原始图片的拓展名
        String originalFilename = file.getOriginalFilename();
        //新的文件名字
        String newFileName= UUID.randomUUID()+ originalFilename;
        //封装上传文件位置的全路径
        File targetFile = new File(filePath,newFileName);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        ImgId imgId= new ImgId();
        String res = imgId.licensePlate(targetFile.getAbsolutePath());
        carTable.setCarPl(res);
        CarTable car=service.CarJiaoYan1(carTable);
        StTable st=service.SfBz(1);
        session.setAttribute("ur",car);

        if (car==null){
            model.addAttribute("quche","您尚未停车");
            return "carout";
        }else{
            PlTable pl=service.selectPl(car);
            car.setCarOtime(SysUtils.d2s(new Date()));
            car.setCarState("已离开");
            long hour= DateUtil.dateDiff(car.getCarUtime(),car.getCarOtime(),"yyyy-MM-dd HH:mm:ss");
            System.out.println(hour);
            if (hour<=st.getStBt() || car.getCarType().equals("免费车辆")){
                car.setCarMoney(0);
            }else if(car.getCarType().equals("年卡车辆")){

                car.setCarMoney((int) ((hour-st.getStBt())*st.getStSf()*0.8));

            }else{
                car.setCarMoney((int) ((hour-st.getStBt())*st.getStSf()));
            }
            service.upcarupdate(car);

            pl.setPlState("空闲");
            service.PlUpdate(pl);
            return "userindex";

        }
    }
    //查询设置
    @RequestMapping("selectSf")
    public String selectSf(Model model,HttpSession session){
        StTable st=service.SfBz(1);
        model.addAttribute("st",st);
        session.getAttribute("msg");
        return "Sysset";
    }
//    //查询开关
//    @RequestMapping("upupup")
//    public String upupup(Model model){
//        AdmTable admTable=service.upupup(1);
//        model.addAttribute("up",admTable);
//        return "Sysset2";
//
//    }

    //更改设置
    @RequestMapping("SetSfBz")
    public String SetSfBz(StTable stTable,HttpSession session){
        service.SetSfBz(stTable);
        session.setAttribute("msg","保存成功");
        return "redirect:selectSf";
    }
    //开启停车场
    @RequestMapping("uptc")
    public String uptc(AdmTable admTable,HttpSession session){
        AdmTable adm=service.upupup(1);
        adm.setPow("1");
        service.ououou(adm);

        return "Sysset2";
    }
    //关闭停车场
    @RequestMapping("otc")
    public String otc(AdmTable admTable,HttpSession session){
        AdmTable adm=service.upupup(1);
        adm.setPow("0");
        service.ououou(adm);

        return "Sysset2";
    }
    //用户主页
    @RequestMapping("index1")
    public String indexindex(HttpSession session){
        StTable st=service.SfBz(1);
        AdmTable adm=service.upupup(1);
        if (adm.getPow().equals("1")){
            session.setAttribute("up","1");
            session.setAttribute("sfbz",st);
            return "userindex";
        }else if (adm.getPow().equals("0")){
            session.setAttribute("up","0");
            return "userindex";
        }else{
            return "userindex";
        }

    }
    //添加免费车辆
    @RequestMapping("FreeInsert")
    public String FreeInsert(FreeTable freeTable,Model model,CarTable carTable){
        FreeTable freeTable1=service.FreeJiaoYan(freeTable);
        CarTable car=service.CarJiaoYan2(freeTable);
        System.out.println(car);
        if (freeTable1==null){
            if (car==null){
                freeTable.setFreeType("免费车辆");
                service.FreeInsert(freeTable);
                return "redirect:selectSf";
            }else{

                freeTable.setFreeType("免费车辆");
                service.FreeInsert(freeTable);
                car.setCarType("免费车辆");
                service.upcarupdate(car);
                return "redirect:selectSf";
            }

        }else{
            model.addAttribute("frjiaoyan","免费车辆已存在");
            return  "redirect:selectSf";
        }


    }
    //移除免费车辆
    @RequestMapping("FreeDelete")
    public String FreeDelete(FreeTable freeTable,Model model){
        FreeTable free= service.FreeJiaoYan(freeTable);
        CarTable car=service.CarJiaoYan2(freeTable);
        if (free==null){
            model.addAttribute("frjy","该车不是免费车辆");
            return "redirect:selectSf";
        }else{
            service.FreeDelete(free);
            car.setCarType("普通车辆");
            service.upcarupdate(car);
            return "redirect:selectSf";
        }
    }
    //查看所有年卡用户
    @RequestMapping("Yfindall")
    public String Yfindall (Model model){
        List<YearTable> list=service.Yfindall();
        model.addAttribute("list",list);

        return "yearall";
    }


    //添加年卡用户
    @RequestMapping("yearInsert")
    public String yearInsert(YearTable yearTable,Model model){
        YearTable year=service.yearJiaoYan(yearTable);
        CarTable car=service.caryearJiaoYan(yearTable);
        StTable st=service.SfBz(1);
        if (year==null){
            if (car==null){
                yearTable.setYearType("年卡车辆");
                //Calendat类 date加减
                Calendar calendar=Calendar.getInstance();
                yearTable.setYearStime(calendar.getTime());
                int day=calendar.get(Calendar.DAY_OF_YEAR);
                calendar.set(Calendar.DAY_OF_YEAR,day+365);
                yearTable.setYearOtime(calendar.getTime());
                yearTable.setYearMoney(st.getStYear());
                service.yearInsert(yearTable);
                model.addAttribute("yes","办理成功");
                return "hdyear";
            }else{
                yearTable.setYearType("年卡车辆");
                //Calendat类 date加减
                Calendar calendar=Calendar.getInstance();
                yearTable.setYearStime(calendar.getTime());
                int day=calendar.get(Calendar.DAY_OF_YEAR);
                calendar.set(Calendar.DAY_OF_YEAR,day+365);
                yearTable.setYearOtime(calendar.getTime());
                yearTable.setYearMoney(st.getStYear());
                service.yearInsert(yearTable);
                car.setCarType("年卡车辆");
                service.upcarupdate(car);
                System.out.println(car);
                model.addAttribute("yes","办理成功");
                return "hdyear";
            }

        }else{
            model.addAttribute("year","您已经是年卡用户了");
            return "hdyear";
        }

    }
    //年卡续费
    @RequestMapping("yearupdate")
    public String yearupdate(YearTable yearTable,Model model){
       YearTable year= service.yearJiaoYan(yearTable);
        StTable st=service.SfBz(1);
       if (year==null){
           model.addAttribute("year","您还不是年卡用户");
           return "hdyear1";
       }else{
           Calendar calendar=Calendar.getInstance();
           calendar.setTime(year.getYearOtime());
           int day=calendar.get(Calendar.DAY_OF_YEAR);
           calendar.set(Calendar.DAY_OF_YEAR,day+365);
           year.setYearOtime(calendar.getTime());
           year.setYearMoney(year.getYearMoney()+st.getStYear());
           service.yearupdate(year);
           model.addAttribute("yes","续费成功");
           return "hdyear1";
       }
    }

}
