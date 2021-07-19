package com.cryptography.sha_256;

import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BouncyCastle {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest("test".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(Hex.encode(hash)));
    }
}
