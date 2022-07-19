package com.moc.lindl.common;

import lombok.Data;

public enum ReturnCode {

    SUCCESS(1000, "success"),
    FAIL(1001, "fail");

    ReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
