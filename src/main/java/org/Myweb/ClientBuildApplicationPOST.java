package org.Myweb;

import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.Myweb.model.Brand;

public class ClientBuildApplicationPOST {

	static Client client=ClientBuilder.newClient();
	static WebTarget baseBrandsURL=client.target("http://localhost:8080/restAPI/showroom/brands/");
	static WebTarget brandURL=baseBrandsURL.path("{brandId}");
	
	public static void main(String[] args) {
		Response response=baseBrandsURL
				.request()
				.post(Entity.json(new Brand("New updated Brand2")));
		System.out.println(response.readEntity(Brand.class).displayBrand());
		//System.out.println(response.toString()); 
		
	}
	
}
