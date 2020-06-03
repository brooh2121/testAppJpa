package com.dismas.testHibernate.repository;

import com.dismas.testHibernate.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Long> {
}
