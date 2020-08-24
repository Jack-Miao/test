package com.mzy.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @Author: XHF
 * @Date: 2019/11/25 10:46
 */
public class JwtUtil {

    private static String SALT = "$5A8F@OB";


    public static String genJwtToken(String userId) {
        // 生成jwt访问令牌
        String jwt = Jwts.builder()
                // 用户角色
                //.claim(Constants.ROLE_LOGIN, roleCodes)
                // 主题 - 存用户名
                .setSubject(userId)
                // 过期时间 - 30分钟
//                .setExpiration(new Date(System.currentTimeMillis() +365* 24*2*30 * 60 * 1000))
                .setExpiration(new Date(System.currentTimeMillis() +30 * 60 * 1000))
                // 加密算法和密钥
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS512, SALT)
                .compact();
        return jwt;
    }

    public static String getUserId(String jwtToken) {
        try {
            // 获取jwt中的信息
            Claims claims = Jwts.parser().setSigningKey(SALT).parseClaimsJws(jwtToken).getBody();
            // 获取当前登录用户名
            System.out.println("获取当前登录用户名: " + claims.getSubject());
            return claims.getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String jwt=genJwtToken("1013");
        System.out.println("管理员："+jwt);

        String userJwt=genJwtToken("1224533183589089281");
        System.out.println("用户： "+userJwt);
//        getUserId("");
    }
    public static Date getIssuedAt(String jwtToken) {
        Claims claims = Jwts.parser().setSigningKey(SALT).parseClaimsJws(jwtToken).getBody();
        return claims.getIssuedAt();
    }
}
