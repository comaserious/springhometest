package com.subsection03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext("com");

        AnimalService service = context.getBean("serviceCollection", AnimalService.class);

        service.animalEat();
    }
}
