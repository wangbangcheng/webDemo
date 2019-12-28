package com.hutaotao.webdemo.config.utis;


import java.io.Serializable;

/**
 * @description: 前后交互的统一模板
 * @author:ha
 * @time: 2019/12/28 18:03
 **/

public class MyJson implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String result_succeed = "SUCCEED";
    private static final String result_failed = "FAILED";
    private static final boolean FLAG_TRUE = true;
    private static final boolean FLAG_FALSE = false;

    private String result;
    private boolean flag;
    private String msg;
    private Object object;

    public static MyJson defaultJson(){
        MyJson json = new MyJson();
        json.flag = FLAG_TRUE;
        json.result = result_succeed;
        return json;
    }
    public void setFail(String msg){
        this.flag = FLAG_FALSE;
        this.result = result_succeed;
        this.msg = msg;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
