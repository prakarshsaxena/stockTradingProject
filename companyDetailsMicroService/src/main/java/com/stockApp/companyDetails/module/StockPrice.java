package com.stockApp.companyDetails.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@DynamicUpdate
public class StockPrice {
	@Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String ticker;
    private float currentPrice;
    private String stockExchange;
    private String currentDate;
    private String timeStamp;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public StockPrice() {
		super();
	}
	public StockPrice(String id, String ticker, float currentPrice, String stockExchange, String currentDate,
			String timeStamp) {
		super();
		this.id = id;
		this.ticker = ticker;
		this.currentPrice = currentPrice;
		this.stockExchange = stockExchange;
		this.currentDate = currentDate;
		this.timeStamp = timeStamp;
	}
    
}
