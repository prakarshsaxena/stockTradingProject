package com.stockApp.companyDetails.dtos;

import java.util.List;

import com.stockApp.companyDetails.module.StockExchange;

public class CompanyDTO {
	
	private String id;
    private String name;
    private Long turnover;
    private String ceo;
    private String boardOfDirs;
    private List<StockExchange> stockExchangeList;
    private String sector;
    private String briefWriteup;
    private String ticker;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getTurnover() {
		return turnover;
	}
	public void setTurnover(Long turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirs() {
		return boardOfDirs;
	}
	public void setBoardOfDirs(String boardOfDirs) {
		this.boardOfDirs = boardOfDirs;
	}
	public List<StockExchange> getStockExchangeList() {
		return stockExchangeList;
	}
	public void setStockExchangeList(List<StockExchange> stockExchangeList) {
		this.stockExchangeList = stockExchangeList;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

}
