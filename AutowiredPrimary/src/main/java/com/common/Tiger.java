package com.common;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 먹는다");
    }
}
