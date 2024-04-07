package com.run;

import com.common.BookDAO;
import com.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceField")
public class BookService {

    /*Autowired 어노테이션으로 의존성을 부여하는 방식에는 3가지가 존재한다
    * 1. 필드값위에 Autowired
    * 2. 생성자에 Autowired
    * 3. setter 에 Autowired */

    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> getAllBookList(){
        return bookDAO.getAllBook();
    }

    public BookDTO selectBookBySequence(int sequence){
        return bookDAO.selectOne(sequence);
    }

    public int averagePrice(){
        List<BookDTO> books = getAllBookList();
        int sum = 0 ;
        for(int i  =0 ; i<books.size();i++){
            sum+=books.get(i).getPrice();
        }
        return sum/books.size();
    }
}
