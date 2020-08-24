package com.mzy.constant;

    /**
     * @Author: XHF
     * @Date: 2019/11/25 21:03
     */
    public enum ResponseSubMsg {
        SUCCESS("000000", "成功"),
        //-------------通用异常-----------------
        EXCEPTION("-99999", "系统异常"),
        TIME_OUT("-99998", "请求超时，请稍后重试"),
        DATABASE_EXCEPTION("-99997", "数据库执行异常"),
        ERROR("-100000", "失败"),
        BIZ_EXCEPTION("-100001", "渠道异常"),
        DATA_EXCEPTION("-100002", "数据缺失"),
        PARAMERS_ERROR("-100003","参数错误"),
        EXPORT_ERROR("-100004","文件导出失败"),
        //-------------login-----------------
        NOT_LOGIN("-200001", "未查询到登录信息，请重新登录"),
        INVALID_PASSWORD("-200002", "用户名或密码错误"),
        GEN_JWT_FAILED("-200003", "jwt访问令牌生成失败"),
        MODIFY_FLAG("-200004", "操作标志上送错误"),
        DOC_ID_NOT_NULL("-200005", "主键ID不能为空"),
        DATA_NOT_FOUND("-200006", "数据不存在"),
        PARENT_ID_NOT_EXISTS("-200007", "父级ID记录不存在"),
        DOC_ID_NOT_EXISTS("-200008", "文档ID记录不存在"),
        PARENT_ID_EXISTS("-200009", "ID被关联作为父级ID,不允许删除"),
        FILE_NOT_FOUND("-200010", "文件不存在"),
        PASSWORD_DEC_ERROR("-200011", "密码解密失败"),
        //-------------user-----------------
        USER_NOT_FOUND("-300001", "用户不存在"),
        USER_AlREADY_EXISTS("-300002", "该用户角色已分配"),
        USER_COMPANY_AlREADY_EXISTS("-300003", "该用户已绑定其他企业"),
        USER_INACTIVE("-300004", "该账号尚未激活，请前往邮箱激活"),
        USER_NOT_BOUND_COMPANY("-300005", "该用户未绑定企业"),
        USER_HAS_NO_PERMISSION("-300006", "该用户权限不足"),
        USER_INVALID_SMSCODE("-300007", "验证码不正确"),
        USER_PHONE_NOT_FOUND("-300008", "用户手机号未找到"),
        USER_PHONE_MULTI_BINDED("-300009", "该手机号下绑定了多个账户");


        private String subCode;
        private String subMsg;

    /**
     */
    ResponseSubMsg(String subCode, String subMsg) {
        this.subCode = subCode;
        this.subMsg = subMsg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }
}
