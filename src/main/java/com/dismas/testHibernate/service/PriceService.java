package com.dismas.testHibernate.service;

import com.dismas.testHibernate.entity.Price;
import com.dismas.testHibernate.repository.PriceRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    PriceRepository priceRepository;

    public List<Price> getAllPrices() {return priceRepository.findAll();}

    public void flush() {priceRepository.deleteAllInBatch();}
}
