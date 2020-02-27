package org.Myweb;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.Myweb.POJO.Currency;
import org.Myweb.POJO.name;

@Path("app")
@Singleton // ideally the object will be destroyed once the request/response is served to
			// the client
			// but using @Singleton, the object will stay as long as the server is up and
			// running
public class App {

	// We need message body writer or reader to display the string in web page
	@GET
	@Path("/name")
	@Produces(MediaType.TEXT_PLAIN)
	public name demo() {
		return new name("manoj", "kumar");
	}
	
	@GET
	@Path("/currency")
	@Produces(MediaType.TEXT_PLAIN)
	public Currency demo1() {
		return new Currency("code", "currency");
	}

	private int x = 0;

	// ideally the object will be destroyed once the response is served to the
	// client
	// but using @Singleton, the object will stay as long as the server is up and
	// running
	@GET
	@Path("/printvalue")
	@Produces(MediaType.TEXT_PLAIN)
	public String printValue() {
		return "The value of x is " + (++x);
	}

	// using Query Param and Path Param
	@GET
	@Path("/{demo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(
			@QueryParam("x") String x
			,@PathParam("demo") String demo) 
	{
		return "The value of Query Param and path param is :" + x + " and " + demo;

	}

	// using Query Param only
	@GET
	@Path("/queryalone")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(
			@QueryParam("code") Currency currency) 
	{
		System.out.println("inside business logic");
		return "The value of Query Param  is :" + currency;

	}

}
