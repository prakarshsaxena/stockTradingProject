package com.stockApp.companyDetails.module;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Entity
@Data
public class Company {
	
	@Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "company_id")
    private String id;
    private String name;
    private Long turnover;
    private String ceo;
    private String boardOfDirs;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(
            name = "company_stockexchange",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "stockexchange_id")
    )
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
	public Company() {
		super();
	}
	public Company(String id, String name, Long turnover, String ceo, String boardOfDirs,
			List<StockExchange> stockExchangeList, String sector, String briefWriteup, String ticker) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirs = boardOfDirs;
		this.stockExchangeList = stockExchangeList;
		this.sector = sector;
		this.briefWriteup = briefWriteup;
		this.ticker = ticker;
	}
	
	
}
