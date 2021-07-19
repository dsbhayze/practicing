package com.cryptography.sha_256;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Vanilla {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String stringTest = "test";

        MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = msgDigest.digest(stringTest.getBytes(StandardCharsets.UTF_8));
        System.out.println(bytesToHex(encodedhash));
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte h : hash) {
            String hex = Integer.toHexString(0xff & h);
            if (hex.length() == 1) {
                hexString.append("0");
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}