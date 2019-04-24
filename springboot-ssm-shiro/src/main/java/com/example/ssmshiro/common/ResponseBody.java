package com.example.ssmshiro.common;

import lombok.Data;

@Data
public class ResponseBody<T> {

    private Integer code = 0;
    String msg = "请求成功";
    Object data;

    public static ResponseBody body(String msg){
        ResponseBody body = new ResponseBody();
        body.setMsg(msg);
        return body;
    }

    public static ResponseBody body(Object data){
        ResponseBody body = new ResponseBody();
        body.setData(data);
        return body;
    }

    public static ResponseBody body(Integer code,String msg){
        ResponseBody body = new ResponseBody();
        body.setCode(code);
        body.setMsg(msg);
        return body;
    }
    public static ResponseBody body(String msg,Object data){
        ResponseBody body = new ResponseBody();
        body.setMsg(msg);
        body.setData(data);
        return body;
    }
    public static ResponseBody body(Integer code,String msg,Object data){
        ResponseBody body = new ResponseBody();
        body.setCode(code);
        body.setMsg(msg);
        body.setData(data);
        return body;
    }

}
