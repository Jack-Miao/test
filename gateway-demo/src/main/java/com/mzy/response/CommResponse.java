package com.mzy.response;

import com.mzy.constant.ResponseMsg;
import com.mzy.constant.ResponseSubMsg;

import java.io.Serializable;

/**
 * @Author: XHF
 * @Date: 2019/11/23 13:10
 */
public class CommResponse<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 5889342082181589794L;

    private String code; // 网关code
    private String msg; // 网关msg
    private String subCode; // 业务返回码
    private String subMsg; // 业务返回码描述
    private T data;

    public CommResponse() {
        super();
    }

    //没有业务返回码，必须是成功的
    public CommResponse(final T data) {
        this.code = ResponseMsg.SUCCESS.getCode();
        this.msg = ResponseMsg.SUCCESS.getMsg();
        this.data = data;
    }

    //没有业务返回码，必须是成功的
    public CommResponse(final ResponseMsg responseMsg, final T data) {
        super();
        this.code = ResponseMsg.SUCCESS.getCode();
        this.msg = ResponseMsg.SUCCESS.getMsg();
        this.data = data;
    }

    public CommResponse(final ResponseMsg responseMsg, String subCode, String subMsg, final T data) {
        super();
        this.code = responseMsg.getCode();
        this.msg = responseMsg.getMsg();
        this.subCode = subCode;
        this.subMsg = subMsg;
        this.data = data;
    }

    public CommResponse(final ResponseMsg responseMsg, final ResponseSubMsg responseSubMsg, final T data) {
        super();
        this.code = responseMsg.getCode();
        this.msg = responseMsg.getMsg();
        this.subCode = responseSubMsg.getSubCode();
        this.subMsg = responseSubMsg.getSubMsg();
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(final String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(final String subMsg) {
        this.subMsg = subMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void setResponseMsg(final ResponseMsg responseMsg) {
        this.code = responseMsg.getCode();
        this.msg = responseMsg.getMsg();
    }

    public void setResponseSubMsg(final ResponseSubMsg responseSubMsg) {
        this.subCode = responseSubMsg.getSubCode();
        this.subMsg = responseSubMsg.getSubMsg();
    }
}
