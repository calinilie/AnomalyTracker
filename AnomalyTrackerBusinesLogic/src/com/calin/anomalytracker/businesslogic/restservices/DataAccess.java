package com.calin.anomalytracker.businesslogic.restservices;

public interface DataAccess {

	public <T> void getJson(String endpoint, Service<T> service);
	
	public <T> void getJsonList(String endpoint, Service<T> service);
	
	public void post();
	
}
