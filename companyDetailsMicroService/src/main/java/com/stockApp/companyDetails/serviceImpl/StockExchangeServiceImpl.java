package com.stockApp.companyDetails.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.reflect.Type;
import org.modelmapper.TypeToken;

import com.stockApp.companyDetails.dao.StockExchangeRepo;
import com.stockApp.companyDetails.dtos.StockExchangeDTO;
import com.stockApp.companyDetails.module.StockExchange;

@Service
@Transactional
public class StockExchangeServiceImpl {
	@Autowired
	private StockExchangeRepo stockExchangeRepo;
	@Autowired
    private ModelMapper modelMapper;
    
    public StockExchangeDTO createStockExchange(StockExchangeDTO stockExchangeDTO) {
        String str = UUID.randomUUID().toString();
        stockExchangeDTO.setId(str);
        stockExchangeRepo.save(modelMapper.map(stockExchangeDTO, StockExchange.class));
        return stockExchangeDTO;
    }

    
    public List<StockExchangeDTO> findAllStockExchanges() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Type listType = new TypeToken<List<StockExchangeDTO>>(){}.getType();
        return modelMapper.map(stockExchangeRepo.findAll(),listType);
    }

    
    public StockExchangeDTO findStockExchangeByName(String name) {
        StockExchange stockExchange = stockExchangeRepo.findByName(name);
        return modelMapper.map(stockExchange,StockExchangeDTO.class);
    }

    
    public StockExchangeDTO findStockExchangeById(String id) {
        Optional<StockExchange> optionalStockExchange = stockExchangeRepo.findById(id);
        if (optionalStockExchange.isPresent()) {
            StockExchange stockExchange = optionalStockExchange.get();
            return modelMapper.map(stockExchange,StockExchangeDTO.class);
        }
        return null;
    }

}
