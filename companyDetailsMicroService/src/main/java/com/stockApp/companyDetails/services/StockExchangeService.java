package com.stockApp.companyDetails.services;

import java.util.List;

import com.stockApp.companyDetails.dtos.StockExchangeDTO;

public interface StockExchangeService {
	public StockExchangeDTO createStockExchange(StockExchangeDTO stockExchangeDTO);
    public List<StockExchangeDTO> findAllStockExchanges();
    public StockExchangeDTO findStockExchangeByName(String name);
    public StockExchangeDTO findStockExchangeById(String id);

}
