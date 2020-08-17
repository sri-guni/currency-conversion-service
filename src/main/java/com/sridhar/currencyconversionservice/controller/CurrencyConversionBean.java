package com.sridhar.currencyconversionservice.controller;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal quanity;
	private BigDecimal totalCalculatedAmount;
	
	public CurrencyConversionBean() {
		
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal converstionFactor, BigDecimal quanity,
			BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = converstionFactor;
		this.quanity = quanity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}
	public void setConvertionFactor(BigDecimal converstionFactor) {
		this.conversionFactor = converstionFactor;
	}
	public BigDecimal getQuanity() {
		return quanity;
	}
	public void setQuanity(BigDecimal quanity) {
		this.quanity = quanity;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}	

}
