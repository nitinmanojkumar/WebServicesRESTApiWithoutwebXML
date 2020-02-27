package org.Myweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("noSingleton") // while using Annotation at the class level we should not use @Singleton
public class NoSingleton {
	@QueryParam("x")
	String x;
	@PathParam("demo")
	String demo;

	// using Query Param and Path Param
	@GET
	@Path("/{demo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		return "The value of Query Param and path param is :" + x + " and " + demo;

	}

}
