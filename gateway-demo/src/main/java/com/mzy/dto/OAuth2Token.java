package com.mzy.dto;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * create by MiaoZhuoayang on 2020/8/23 20:40
 */
public class OAuth2Token implements AuthenticationToken {

    private static final long serialVersionUID = 1L;

    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }
}
