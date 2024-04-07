package com.subsection03;

import com.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceCollection")
public class AnimalService {

    // 하나의 Bean 만을 인스턴스하여 사용할수 밖에 없는 것인가?
    // 그렇지 않다 만일 동일한 인터페이스의 Bean 이 여러개 일경우
    // 필드값을 List로 한반에 받아 먹는 방법을 사용할 수 있다

    private List<Animal> animalList;
    @Autowired
    public AnimalService(List<Animal> animalList){
        this.animalList = animalList;
    }

    public void animalEat(){
        for(int i = 0 ; i< this.animalList.size();i++){
            animalList.get(i).eat();
        }
    }


}
