package com.calin.anomalytracker.businesslogic.restservices;

import java.util.List;

public interface Service<T> {
	
	public T deserialize(String json);

	public void onRequestCompleted(T model);
	
	public List<T> deserializeList(String json);
	
	public void onRequestCompleted(List<T> model);
}
