package com.subsection01;

import com.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servicePrimary")
public class AnimalService {

    private Animal animal;
    @Autowired
    public AnimalService(Animal animal){
        this.animal = animal;
        // @Autowired 를 통해서 의존성을 부여하고 인스턴스를 생성하였는데
        // Animal 인터페이스를 상속받은 클래스가 3개가 존재하여
        // Animal 인터페이스를 상속받은 클래스중 어떤 클래스를 지정하였는지 확인이 불가능하다
        // 따라서 이를 해결 하기 위해서는 2가지 방법이 존재한다
        //1. Primary
        //2. @Qualifier 방식
    }

    public void animalEat(){
        animal.eat();
    }
}
