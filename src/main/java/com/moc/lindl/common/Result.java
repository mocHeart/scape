package com.moc.lindl.common;

import lombok.Data;

@Data
public class Result {

    private int code;

    private String msg;

    private Object data;

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(ReturnCode.SUCCESS.getCode());
        result.setMsg(ReturnCode.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static Result fail(Object data) {
        Result result = new Result();
        result.setCode(ReturnCode.FAIL.getCode());
        result.setMsg(ReturnCode.FAIL.getMsg());
        result.setData(data);
        return result;
    }

    public static Result success(ReturnCode returnCode) {
        Result result = new Result();
        result.setCode(returnCode.getCode());
        result.setMsg(returnCode.getMsg());
        return result;
    }

}
