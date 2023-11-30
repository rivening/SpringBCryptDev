package com.bcrypt.springbcryptdev;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringBCryptDevApplication {

    public static void main(String[] args) {
        // BCryptPasswordEncoder 인스턴스 생성
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // 패스워드 해싱
        String rawPassword = "user123";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // 결과 출력
        System.out.println("Original Password: " + rawPassword);
        System.out.println("Encoded Password: " + encodedPassword);

        // 패스워드 일치 여부 확인
        boolean isMatch = passwordEncoder.matches(rawPassword, encodedPassword);
        System.out.println("Password Matches: " + isMatch);

    }

}
