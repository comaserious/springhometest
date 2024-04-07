package com.common;

import lombok.*;

import java.util.Date;

@NoArgsConstructor@AllArgsConstructor@Getter@Setter
@ToString
public class BookDTO {

    private int sequence;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private Date currentDate;
}
