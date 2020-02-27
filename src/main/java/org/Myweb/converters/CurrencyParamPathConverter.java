package org.Myweb.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import org.Myweb.POJO.Currency;

@Provider
public class CurrencyParamPathConverter implements ParamConverterProvider{

	// Business logic is provided directly here instead of using seperate middlemen class
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		return new ParamConverter<T>(){

			@Override
			public T fromString(String code) {
				System.out.println("inside from string");
				Currency currency=null;
				switch(code.toUpperCase()) {
				case "EUR": currency=new Currency(code,"EUR");break;
				case "USD": currency=new Currency(code,"US Dollar");break;
				case "INR": currency=new Currency(code,"Rupees");break;
				}
				
				return (T) currency;
			}

			@Override
			public String toString(T currency) {
				System.out.println("inside to string");
				return currency.toString();
			}
			
		};
	}

	// Instead of directly providing busniness login in this class we are provding business logic in CurrencyParamConverter class 
	/*@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		System.out.println("inside param converter provider");
		return (ParamConverter<T>) new CurrencyParamConverter();
	}*/

}
