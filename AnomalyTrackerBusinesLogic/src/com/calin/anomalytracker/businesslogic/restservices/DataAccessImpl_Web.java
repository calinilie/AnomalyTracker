package com.calin.anomalytracker.businesslogic.restservices;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;

public class DataAccessImpl_Web implements DataAccess{
	
	
	public DataAccessImpl_Web() {
		
	}
	
	@Override
	public <T> void getJson(String endpoint, final Service<T> s) {
		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, endpoint);
		try {
			requestBuilder.sendRequest(null, new RequestCallback() {
				
				@Override
				public void onResponseReceived(Request request, Response response) {
					s.onRequestCompleted(s.deserialize(response.getText()));
				}
				
				@Override
				public void onError(Request request, Throwable exception) {
					// TODO Auto-generated method stub
					
				}
			});
		} catch (RequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void getJsonList(String endpoint, final Service<T> service) {
		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, endpoint);
		try {
			requestBuilder.sendRequest(null, new RequestCallback() {
				
				@Override
				public void onResponseReceived(Request request, Response response) {
					service.onRequestCompleted(service.deserializeList(response.getText()));
					
				}
				
				@Override
				public void onError(Request request, Throwable exception) {
					// TODO Auto-generated method stub
					
				}
			});
		} catch (RequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
