package com.common;

import org.springframework.stereotype.Component;

@Component
public class Rabbit implements Animal{
    @Override
    public void eat() {
        System.out.println("토끼가 당근을 먹는다");
    }
}
