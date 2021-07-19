package com.cryptography.sha_256;


import org.apache.commons.codec.digest.DigestUtils;

public class ApacheCC {

    public static void main(String[] args) {
        String sha256hex = DigestUtils.sha256Hex("test");
        System.out.println(sha256hex);
    }
}
