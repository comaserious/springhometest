package com.common;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookDAOImpl implements BookDAO{

    private final Map<Integer,BookDTO> bookList;
    public BookDAOImpl(){
        bookList = new HashMap<>();
        bookList.put(1,new BookDTO(1,"홍길동전","허균","미상",12000,new Date()));
        bookList.put(2, new BookDTO(2,"해커스토익","유수연","stalker",25000,new Date()));

    }

    @Override
    public List<BookDTO> getAllBook() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOne(int sequence) {
        return bookList.get(sequence);
    }
}
