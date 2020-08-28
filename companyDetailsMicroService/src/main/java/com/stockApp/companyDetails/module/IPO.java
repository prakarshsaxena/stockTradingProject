package com.stockApp.companyDetails.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class IPO {
	 @Id
	 @GeneratedValue(generator="system-uuid")
	 @GenericGenerator(name="system-uuid", strategy = "uuid")
	 private String id;
	 private String companyName;
	 private String stockExchange;
	 private String price;
	 private Long numOfShares;
	 private String dateTime;
	 private String remarks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Long getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(Long numOfShares) {
		this.numOfShares = numOfShares;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public IPO(String id, String companyName, String stockExchange, String price, Long numOfShares, String dateTime,
			String remarks) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.stockExchange = stockExchange;
		this.price = price;
		this.numOfShares = numOfShares;
		this.dateTime = dateTime;
		this.remarks = remarks;
	}
	public IPO() {
		super();
	}
	 

}
