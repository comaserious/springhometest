package com.subsection01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


    public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext("com");

    AnimalService service = context.getBean("servicePrimary",AnimalService.class);

    // 에러가 발생하는 이유는 @Service 의 Bean 을 확이해보면 이해 할 수 있다
        service.animalEat();


    }




}
