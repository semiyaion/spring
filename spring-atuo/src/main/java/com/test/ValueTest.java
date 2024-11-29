package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueTest {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "ValueTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
