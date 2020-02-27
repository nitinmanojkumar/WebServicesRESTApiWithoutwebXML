package org.Myweb.converters;

import javax.ws.rs.ext.ParamConverter;

public class CurrencyParamConverter {

	// THis business logic is not required since we are providing business logic in Currency Param Path Converter class directly
	
//implements ParamConverter<Currency>{

	/*@Override
	public Currency fromString(String code) {
		System.out.println("inside from string");
		Currency currency=null;
		switch(code.toUpperCase()) {
		case "EUR": currency=new Currency(code,"EUR");break;
		case "USD": currency=new Currency(code,"US Dollar");break;
		case "INR": currency=new Currency(code,"Rupees");break;
		}
		
		return currency;
	}

	@Override
	public String toString(Currency currency) {
		System.out.println("inside tostring in Currency param Converter");
		return currency.toString();
	}*/

}
