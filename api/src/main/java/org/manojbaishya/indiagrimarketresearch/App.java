package org.manojbaishya.indiagrimarketresearch;

import org.manojbaishya.indiagrimarketresearch.ceda.Api;
import org.manojbaishya.indiagrimarketresearch.ceda.CedaApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		Api api = new CedaApi("");
		api.getCommodities();
		// SpringApplication.run(App.class, args);
	}
}
