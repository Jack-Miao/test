package com.mzy.constant;

/**
 * @Author: XHF
 * @Date: 2019/11/25 21:03
 */
public enum  ResponseMsg {
    SUCCESS("10000", "接口调用成功"),
    SERVICE_UNAVAILABLE("20000", "服务不可用"),
    NO_AUTH_PERMISSION("20001", "授权权限不足"),
    PARAM_NOT_MATCH("40001", "缺少必选参数"),
    PARAM_INVALID("40002", "非法的参数"),
    BIZ_FAILED("40004", "业务处理失败"),
    NO_PERMISSION("40005", "权限不足");


    private String code;
    private String msg;

    /**
     * @param code
     * @param msg
     */
    ResponseMsg(String code, String msg) {
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
