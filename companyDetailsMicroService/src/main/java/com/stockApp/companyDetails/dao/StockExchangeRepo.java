package com.stockApp.companyDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockApp.companyDetails.module.StockExchange;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchange, String>{

	public StockExchange findByName(String name);
}
