package org.Myweb.POJO;

public class Currency {

	private String code;
	private String currency;
	public Currency(String code, String currency) {
		System.out.println("Inside currency constructor");
		this.code = code;
		this.currency = currency;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		System.out.println("inside toString in currency");
		return "Currency [code=" + code + ", currency=" + currency + "]";
	}
	
	
	
}
