package org.Myweb;

import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.Myweb.model.Brand;

public class ClientBuildJavaApplication {

	static Client client=ClientBuilder.newClient();
	static WebTarget baseBrandsURL=client.target("http://localhost:8080/restAPI/showroom/brands/");
	
	public static void main(String[] args) {
		Brand[] response=baseBrandsURL
				.request(MediaType.APPLICATION_JSON)
				.get(Brand[].class);
		for(Brand brand:response) {
			System.out.println(brand.displayBrand());
		}
	}
	
}
