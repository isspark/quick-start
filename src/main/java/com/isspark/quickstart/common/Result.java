package com.isspark.quickstart.common;

import lombok.Data;

/**
 * @author Desperado
 */
@Data
public class Result {

    private String code;

    private String msg;

    private Object data;

    public static Result SUCCESS = SUCCESS();

    public static Result FAILURE = FAILURE();

    public Result() {
    }

    public Result(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
    }

    public Result(ResultCodeEnum resultCodeEnum, Object data) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
        this.data = data;
    }


    public static Result SUCCESS() {
        return new Result(ResultCodeEnum.SUCCESS);
    }

    public static Result SUCCESS(String data) {
        return new Result(ResultCodeEnum.SUCCESS, data);
    }

    public static Result FAILURE() {
        return new Result(ResultCodeEnum.FAILURE);
    }

}
