package com.tcc.service;

import com.tcc.mapper.*;
import com.tcc.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.Year;
import java.util.List;

@Service
public class TccService {
    @Autowired
    CarTableMapper carTableMapper;
    @Autowired
    PlTableMapper plTableMapper;
    @Autowired
    AdmTableMapper admTableMapper;
    @Autowired
    StTableMapper stTableMapper;
    @Autowired
    FreeTableMapper freeTableMapper;
    @Autowired
    YearTableMapper yearTableMapper;
    //根据账号密码登录
    public AdmTable userlogin(AdmTable admTable){
        AdmTableExample example=new AdmTableExample();
        example.createCriteria().andIdEqualTo(admTable.getId()).andPwdEqualTo(admTable.getPwd());
        List<AdmTable> list=admTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return  null;
        }else{
            return list.get(0);
        }
    }
    //年卡++
    public int selectYearSum(){
        return yearTableMapper.selectSum();
    }
    //年卡数量
    public int selectYearNum(){ return  yearTableMapper.countByExample(null);}
    //停车费
    public int selectCarSum(){
        return carTableMapper.selectSum();
    }
    //查看所有车位
    public List<PlTable> PlFindAll(){
        return plTableMapper.selectByExample(null);
    }
    public List<PlTable> PlFindAll1(PlTable plTable){
        PlTableExample example=new PlTableExample();
        example.createCriteria().andPlStateEqualTo("空闲");
        List<PlTable> list=plTableMapper.selectByExample(example);
        return list;
    }
    public List<PlTable> PlFindAll2(PlTable plTable){
        PlTableExample example=new PlTableExample();
        example.createCriteria().andPlStateEqualTo("占用");
        List<PlTable> list=plTableMapper.selectByExample(example);
        return list;
    }
    //注销车位
    public int PlDelete(int id){
        return plTableMapper.deleteByPrimaryKey(id);
    }
    //添加车位校验
    public PlTable PlJiaoYan(PlTable plTable){
        PlTableExample example=new PlTableExample();
        example.createCriteria().andPlParkingEqualTo(plTable.getPlParking());
        List<PlTable> list= plTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    //添加车位
    public int PlInsert(PlTable plTable){ return  plTableMapper.insertSelective(plTable);}
    //停车校验
    public PlTable CarJiaoYan(PlTable plTable){
        PlTableExample example=new PlTableExample();
        example.createCriteria().andPlStateEqualTo("空闲");
        List<PlTable> list=plTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    public CarTable CarJiaoYan1(CarTable car){
        CarTableExample example=new CarTableExample();
        example.createCriteria().andCarPlEqualTo(car.getCarPl()).andCarStateEqualTo("正在停车");
        List<CarTable> list=carTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    //停车
    public  int CarInsert(CarTable carTable){ return  carTableMapper.insertSelective(carTable);}
    public int PlUpdate(PlTable pl){
        return  plTableMapper.updateByPrimaryKey(pl);
    }
    //取车
    public  int upcarupdate(CarTable carTable){
        return carTableMapper.updateByPrimaryKey(carTable);
    }

    //查询收费标准
    public StTable SfBz(int stId){
        return stTableMapper.selectByPrimaryKey(stId);
    }
    //更新收费标准
    public int SetSfBz(StTable stTable){ return  stTableMapper.updateByPrimaryKeySelective(stTable);}
    //取车改车位状态
    public PlTable selectPl(CarTable carTable){
        PlTableExample example=new PlTableExample();
        example.createCriteria().andPlParkingEqualTo(carTable.getCarBrand());
        List<PlTable> list=plTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    //添加免费车辆
    public int FreeInsert(FreeTable freeTable){
        return freeTableMapper.insertSelective(freeTable);

    }
    //移除免费车辆
    public int FreeDelete(FreeTable freeTable){
        FreeTableExample example=new FreeTableExample();
        example.createCriteria().andFreeCarEqualTo(freeTable.getFreeCar());
        return freeTableMapper.deleteByExample(example);
    }
    //添加免费车辆校验
    public FreeTable FreeJiaoYan(FreeTable freeTable){
        FreeTableExample example=new FreeTableExample();
        example.createCriteria().andFreeCarEqualTo(freeTable.getFreeCar());
        List<FreeTable> list= freeTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    public FreeTable FreeJiaoYan2(CarTable carTable){
        FreeTableExample example=new FreeTableExample();
        example.createCriteria().andFreeCarEqualTo(carTable.getCarPl());
        List<FreeTable> list= freeTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    public CarTable CarJiaoYan2(FreeTable freeTable){
        CarTableExample example=new CarTableExample();
        example.createCriteria().andCarPlEqualTo(freeTable.getFreeCar());
        List<CarTable> list=carTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    //查询开关
    public AdmTable upupup(int id){
        return admTableMapper.selectByPrimaryKey(id);
    }
    //开关
    public int ououou(AdmTable admTable){ return  admTableMapper.updateByPrimaryKeySelective(admTable);}
    //查看所有年卡用户
    public List<YearTable> Yfindall(){
        return yearTableMapper.selectByExample(null);
    }
    //添加年卡用户
    public int yearInsert(YearTable yearTable){
        return  yearTableMapper.insertSelective(yearTable);
    }
    //修改年卡
    public int yearupdate(YearTable yearTable){  return  yearTableMapper.updateByPrimaryKeySelective(yearTable);}
    //添加年卡车辆校验
    public YearTable yearJiaoYan(YearTable yearTable){
        YearTableExample example=new YearTableExample();
        example.createCriteria().andYearCarEqualTo(yearTable.getYearCar());
        List<YearTable> list= yearTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    //停车年卡
    public YearTable yearJiaoYan1(CarTable carTable){
        YearTableExample example=new YearTableExample();
        example.createCriteria().andYearCarEqualTo(carTable.getCarPl());
        List<YearTable> list= yearTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    public CarTable caryearJiaoYan(YearTable yearTable){
        CarTableExample example=new CarTableExample();
        example.createCriteria().andCarPlEqualTo(yearTable.getYearCar()).andCarStateEqualTo("正在停车");
        List<CarTable> list=carTableMapper.selectByExample(example);
        if (list==null || list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
    //查看所有车辆记录
    public List<CarTable> carfindall(){
        return carTableMapper.selectByExample(null);
    }

}
