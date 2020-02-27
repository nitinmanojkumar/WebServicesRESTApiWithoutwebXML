package org.Myweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// Building the Client by calling the API from another project
@Path("newapp")
public class ClientBuild {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		Client client=ClientBuilder.newClient();
		Response response=client.target("http://localhost:8080/restAPI/showroom/brands/1").request().get();
		return response.toString();
	}
	
	@GET
	@Path("/asString")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo1() {
		Client client=ClientBuilder.newClient();
		String response=client.target("http://localhost:8080/restAPI/showroom/brands/1")
				.request(MediaType.APPLICATION_JSON)
				.get(String.class);
		return response;
	}
	
	@GET
	@Path("/asString1")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo2() {
		Client client=ClientBuilder.newClient();
		WebTarget baseBrandsURL=client.target("http://localhost:8080/restAPI/showroom/brands");
		WebTarget brandURL=baseBrandsURL.path("{brandId}");
		
		Builder request = brandURL
				.resolveTemplate("brandId", "1")
				.request(MediaType.APPLICATION_JSON);
		
		Response response = request.get();
		return response.readEntity(String.class);
		
		//String response=request.get(String.class);
		//return response;
	}
	
	@GET
	@Path("/asString2")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo3() {
		Client client=ClientBuilder.newClient();
		WebTarget baseBrandsURL=client.target("http://localhost:8080/restAPI/showroom/brands");
		WebTarget brandURL=baseBrandsURL.path("{brandId}");
		
		String response = brandURL
				.resolveTemplate("brandId", "2")
				.request(MediaType.APPLICATION_JSON).get(String.class);
		return response;
	}
}
