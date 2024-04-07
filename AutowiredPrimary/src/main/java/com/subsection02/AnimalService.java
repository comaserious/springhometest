package com.subsection02;

import com.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviceQualifier")
public class AnimalService {

    private Animal animal;
    @Autowired
    public AnimalService(@Qualifier("rabbit") Animal animal){
        this.animal = animal;
        // 생성자를 통한 @Autowired 인 경우 @Qualifier 의 위치는
        // 매개변수선언부 앞에 이다

    }

    public void animalEat(){
        animal.eat();
    }


}
