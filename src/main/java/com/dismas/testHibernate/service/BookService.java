package com.dismas.testHibernate.service;

import com.dismas.testHibernate.dto.BookRequest;
import com.dismas.testHibernate.dto.BookResponse;
import com.dismas.testHibernate.entity.Book;
import com.dismas.testHibernate.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll () {
        return bookRepository.findAll();
    }

    public List<BookResponse> getAllBookInfo() {return bookRepository.getAllBooksWithPrices();}

    public Book save(Book book) {return bookRepository.save(book);}

    public void flush () {bookRepository.deleteAllInBatch();}
}
