package com.lp.mall.util;

/**
 * @author lp
 * @date 2021-05-10 16:14
 */
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    SYSTEM_ERROR(501, "系统错误");
    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    ResultCode() {
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
