package com.itjiangfeng.exception;

/**
 * @Author 江峰
 * @Date 2023/11/28 16:14
 * @packageName:com.itjiangfeng.exception
 * @ClassName:SystemException
 */
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
