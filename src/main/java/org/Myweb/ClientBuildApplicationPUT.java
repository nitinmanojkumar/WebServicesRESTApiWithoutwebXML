package org.Myweb;

import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.Myweb.model.Brand;

public class ClientBuildApplicationPUT {

	static Client client=ClientBuilder.newClient();
	static WebTarget baseBrandsURL=client.target("http://localhost:8080/restAPI/showroom/brands/");
	static WebTarget brandURL=baseBrandsURL.path("{brandId}");
	
	public static void main(String[] args) {
		Response response=brandURL
				.resolveTemplate("brandId", "1")
				.request()
				.put(Entity.json(new Brand("TVS updated")));
		System.out.println(response.getStatus());
		//System.out.println(response.toString()); 
		
	}
	
}
