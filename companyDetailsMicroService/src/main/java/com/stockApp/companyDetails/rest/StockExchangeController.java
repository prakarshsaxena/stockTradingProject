package com.stockApp.companyDetails.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockApp.companyDetails.dtos.StockExchangeDTO;
import com.stockApp.companyDetails.serviceImpl.StockExchangeServiceImpl;


@RestController
@RequestMapping("/stockExchange")
public class StockExchangeController {

	@Autowired
	private StockExchangeServiceImpl stockExchangeService;

    @GetMapping("/test")
    public String test() {
        return "stock exchange service is working";
    }

    @GetMapping("/all")
    public ResponseEntity<List> getAllStockExchanges() {
        List<StockExchangeDTO> list = stockExchangeService.findAllStockExchanges();
        return ResponseEntity.status(HttpStatus.FOUND).body(list);
    }

    @PostMapping("/addStockExchange")
    public ResponseEntity<StockExchangeDTO> addStockExchange(@RequestBody StockExchangeDTO stockExchangeDTO) {
        StockExchangeDTO stockExchangeDTO1 = stockExchangeService.createStockExchange(stockExchangeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockExchangeDTO1);
    }

    @GetMapping("/{name}")
    public ResponseEntity<StockExchangeDTO> getStockExchangeByName(@PathVariable String name) {
        StockExchangeDTO stockExchangeDTO = stockExchangeService.findStockExchangeByName(name);
        return ResponseEntity.status(HttpStatus.FOUND).body(stockExchangeDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockExchangeDTO> getStockExchangeById(@PathVariable String id) {
        StockExchangeDTO stockExchangeDTO = stockExchangeService.findStockExchangeById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(stockExchangeDTO);
    }
}