package com.dismas.testHibernate.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_price")
public class Price {

    @Id
    @SequenceGenerator(name="price_id_seq", initialValue=1,allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "price_id_seq")
    @Column(name = "price_id")
    Long id;
    @Column(name = "book_price")
    BigDecimal bookPrice;
    @Column(name = "price_date")
    Timestamp priceDate;

    @ManyToOne(targetEntity = Book.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id",referencedColumnName = "book_id"/*,nullable = false*/)
    private Book book;

    //@ManyToOne(targetEntity = Book.class,cascade = CascadeType.ALL/*,fetch = FetchType.EAGER*/)
    //@JoinColumn(name = "price_id",referencedColumnName = "price_id",insertable = false, updatable = false)





}
