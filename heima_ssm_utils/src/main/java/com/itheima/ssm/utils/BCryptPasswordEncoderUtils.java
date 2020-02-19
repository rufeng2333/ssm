package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "123";
        System.out.println(encodePassword(password));//$2a$10$Qhv8edBz367Xl3zbcpmbheeBkIl0j9R5p6okkaR817MuxuS8nsx8W
    }
}
