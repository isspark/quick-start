package com.isspark.quickstart.common;

/**
 * @author Desperado
 */

public enum  ResultCodeEnum {

    SUCCESS("10001","成功"),
    FAILURE("10002","失败");


    private String code;

    private String msg;

    ResultCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
