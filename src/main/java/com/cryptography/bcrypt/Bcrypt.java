package com.cryptography.bcrypt;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Bcrypt {

    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder(11);
        System.out.println(encoder);

        //INFO - Or Better
        String salt = BCrypt.gensalt(10);
        String bCryptHash = BCrypt.hashpw("Test", salt);
        System.out.println(salt);
        System.out.println(bCryptHash);
    }
}
