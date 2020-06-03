package com.dismas.testHibernate;

import com.dismas.testHibernate.dto.BookRequest;
import com.dismas.testHibernate.entity.Book;
import com.dismas.testHibernate.entity.Price;
import com.dismas.testHibernate.service.BookService;
import com.dismas.testHibernate.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

@SpringBootApplication
public class TestHibernateApplication implements CommandLineRunner {

	@Autowired
	BookService bookService;

	@Autowired
	PriceService priceService;

	public static void main(String[] args) {
		SpringApplication.run(TestHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(bookService.getAll());
		//System.out.println(priceService.getAllPrices());
		//System.out.println(bookService.getAllBookInfo());

		//bookService.flush();
		//priceService.flush();

		String date = "2020-06-03 15:45:00";
		String date2 = "2020-06-03 16:43:30";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date parseDate = dateFormat.parse(date);
		Date parseDate2 = dateFormat.parse(date2);
		Timestamp timestamp = new Timestamp(parseDate.getTime());
		Timestamp timestamp2 = new Timestamp(parseDate2.getTime());

		Price price = new Price();
		price.setBookPrice(new BigDecimal(696));
		price.setPriceDate(timestamp);

		Price price1 = new Price();
		price1.setBookPrice(new BigDecimal(996));
		price1.setPriceDate(timestamp2);

		Book book = new Book();
		book.setName("Иидот");
		book.setPrices(Arrays.asList(price,price1));

		bookService.save(book);

		System.out.println(bookService.getAllBookInfo());
	}
}
