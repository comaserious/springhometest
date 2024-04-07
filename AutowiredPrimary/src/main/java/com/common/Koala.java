package com.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Koala implements Animal{
    @Override
    public void eat() {
        System.out.println("코알라는 유칼립투스를 씹어먹는다");
    }
}
