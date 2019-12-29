package com.hutaotao.webdemo.config.utis;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @description:
 * @author:
 * @time: 2019/12/29 13:06
 **/
public class KeyUtils {

    private static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static  Random rm = new Random();

    public static synchronized String getUserNo(){
        long pre =  System.currentTimeMillis();

        double after = (1 + rm.nextDouble()) * Math.pow(10, 8);

        return String.valueOf(pre)+String.valueOf(after);
    }

    public static synchronized String getProductNo(){
        StringBuffer productNo = new StringBuffer();
        for (int i = 0; i < 20; i++) {
            productNo.append(ALLCHAR.charAt(rm.nextInt(ALLCHAR.length())));
        }
        return String.valueOf(productNo);
    }

    public static synchronized String getOrderNo(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmSSsss");
        String pre = dateFormat.format(new Date());
        StringBuffer after = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            after.append(ALLCHAR.charAt(rm.nextInt(ALLCHAR.length())));
        }
        return pre+after;
    }

}
