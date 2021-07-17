package com.tcc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SysUtils {
    //����true��ʾΪ��
    public static boolean isEmpty(Object item) {
        boolean flag=true;
        if(item!=null) {
            flag=false;
        }
        if(item instanceof String) {
            String item2=(String) item;
            if(item2.length()!=0) {
                flag=false;
            }else {
                flag=true;
            }
        }

        return flag;
    }
    public static String d2s(Date date) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result=simpleDateFormat.format(date);
        return result;
    }
    public static Date s2d(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=simpleDateFormat.parse(dateString);
        return date;
    }


}
