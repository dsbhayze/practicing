package com.cryptography.keccak_256;

import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;

public class BouncyCastle {
/*
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Security.addProvider(new BouncyCastleProvider());
        final MessageDigest digest = MessageDigest.getInstance("Keccak-256");
        final byte[] encodedhash = digest.digest("test".getBytes(StandardCharsets.UTF_8));
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

*/

    public static void main(String[] args) {
        System.out.println(usingBouncyCastleToDoHashing());
    }

    private static String usingBouncyCastleToDoHashing() {
        Keccak.Digest256 digest256 = new Keccak.Digest256();
        byte[] hashbytes = digest256.digest("test".getBytes(StandardCharsets.UTF_8));
        return new String(Hex.encode(hashbytes));
    }
}
