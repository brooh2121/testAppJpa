package com.dismas.testHibernate.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    @Id
    @SequenceGenerator(name="book_id_seq", initialValue=1,allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "book_id_seq")
    @Column(name = "book_id")
    private Long id;
    @Column(name = "book_name")
    private String name;

    @OneToMany(targetEntity = Price.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id",referencedColumnName = "book_id")
    private List<Price> prices;

    //@OneToMany(targetEntity = Price.class,cascade = CascadeType.ALL,orphanRemoval = true/*,mappedBy = "book"/*,fetch = FetchType.EAGER*//*,mappedBy = "book"*/)
    //@JoinColumn(name = "price_id",referencedColumnName = "price_id")
    //@JoinTable(name = "book_price", joinColumns = @JoinColumn(name = "price_id",referencedColumnName = "price_id"), inverseJoinColumns = @JoinColumn(name = "id",referencedColumnName = "id"))//@JoinColumn(name = "price_id",referencedColumnName = "price_id")
    //private List<Price> prices;

}
