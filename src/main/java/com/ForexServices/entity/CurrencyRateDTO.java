package com.ForexServices.entity;

import java.time.LocalDate;

public class CurrencyRateDTO {
	private Integer CurrencyId;
	private Integer Amount;
	private String DDLFrom;
	private String PreExchange;
	private String CurExchange;
	private LocalDate Date;
	private String DDLTo;
	public CurrencyRateDTO() {
		super();
	}
	public CurrencyRateDTO(Integer currencyId, Integer amount, String dDLFrom, String preExchange, String curExchange,
			LocalDate date, String dDLTo) {
		super();
		CurrencyId = currencyId;
		Amount = amount;
		DDLFrom = dDLFrom;
		PreExchange = preExchange;
		CurExchange = curExchange;
		Date = date;
		DDLTo = dDLTo;
	}
	public Integer getCurrencyId() {
		return CurrencyId;
	}
	public void setCurrencyId(Integer currencyId) {
		CurrencyId = currencyId;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	public String getDDLFrom() {
		return DDLFrom;
	}
	public void setDDLFrom(String dDLFrom) {
		DDLFrom = dDLFrom;
	}
	public String getPreExchange() {
		return PreExchange;
	}
	public void setPreExchange(String preExchange) {
		PreExchange = preExchange;
	}
	public String getCurExchange() {
		return CurExchange;
	}
	public void setCurExchange(String curExchange) {
		CurExchange = curExchange;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public String getDDLTo() {
		return DDLTo;
	}
	public void setDDLTo(String dDLTo) {
		DDLTo = dDLTo;
	}

	
}
