package com.lp.mall.util;

import java.io.Serializable;

/**
 * @author lp
 * @date 2021-05-10 16:09
 */
public class Result<T>implements Serializable {
    /**
     * 响应数据结果集
     */
    private T data;
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;

    public Result() {
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public Result(T data, ResultCode resultCode) {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
    public static Result ok() {
        return new Result(null, ResultCode.SUCCESS);
    }

    public static Result ok(Object data) {
        return new Result(data, ResultCode.SUCCESS);
    }

    public static Result error() {
        return new Result(null, ResultCode.ERROR);
    }

    public static Result error(String message) {
        return secByError(ResultCode.ERROR.getCode(),message);
    }

    /**
     * 自定义异常
     * @param code
     * @param message
     * @return
     */
    public static Result secByError(Integer code,String message) {
        Result err = new Result();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }

    public static Result error(ResultCode resultCode) {
        return new Result(resultCode);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
