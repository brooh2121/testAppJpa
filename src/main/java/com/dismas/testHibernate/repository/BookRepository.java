package com.dismas.testHibernate.repository;


import com.dismas.testHibernate.dto.BookResponse;
import com.dismas.testHibernate.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

   @Query(value = "select new com.dismas.testHibernate.dto.BookResponse (b.name,bp.bookPrice,bp.priceDate) from Book b join b.prices bp")
   List<BookResponse> getAllBooksWithPrices();
}
