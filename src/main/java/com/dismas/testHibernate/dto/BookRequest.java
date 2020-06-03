package com.dismas.testHibernate.dto;


import com.dismas.testHibernate.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookRequest {
    private Book book;
}
