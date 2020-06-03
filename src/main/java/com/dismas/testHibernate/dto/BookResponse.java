package com.dismas.testHibernate.dto;

import lombok.*;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;

import java.util.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookResponse {


    private String name;
    private BigDecimal bookPrice;

    @Temporal(TemporalType.TIMESTAMP)
    private Date priceDate;

    /*
    public BookResponse (String name,BigDecimal bookPrice, String priceDate) {
        this.name = name;
        this.bookPrice = bookPrice;
        this.priceDate = priceDate;
    }
    */

}
