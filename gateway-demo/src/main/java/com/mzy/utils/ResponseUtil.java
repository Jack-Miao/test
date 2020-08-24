package com.mzy.utils;

import com.mzy.constant.ResponseMsg;
import com.mzy.constant.ResponseSubMsg;
import com.mzy.response.CommResponse;

public class ResponseUtil {
    public static CommResponse success() {
        return new CommResponse(ResponseMsg.SUCCESS, "");
    }

    public static CommResponse success(Object result) {
        return new CommResponse(ResponseMsg.SUCCESS, ResponseSubMsg.SUCCESS, result);
    }

    public static CommResponse success(String subCode, String subMsg, Object result) {
        return new CommResponse(ResponseMsg.SUCCESS, subCode, subMsg + "(" + subCode + ")", result);
    }

    public static CommResponse failed(String subCode, String subMsg, Object result) {
        return new CommResponse(ResponseMsg.BIZ_FAILED, subCode, subMsg + "(" + subCode + ")", result);
    }

    public static CommResponse failed(ResponseSubMsg responseSubMsg, Object result) {
        return new CommResponse(ResponseMsg.BIZ_FAILED, responseSubMsg, result);
    }

}
