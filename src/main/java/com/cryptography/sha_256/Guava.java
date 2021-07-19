package com.cryptography.sha_256;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class Guava {

    public static void main(String[] args) {
        String sha256hex = Hashing.sha256().hashString("test", StandardCharsets.UTF_8).toString();
        System.out.println(sha256hex);
    }
}
