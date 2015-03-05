package com.calin.anomalytracker.businesslogic.facade;

import com.calin.anomalytracker.businesslogic.WebGinjector;
import com.calin.anomalytracker.businesslogic.restservices.AnomalyService;
import com.google.gwt.core.client.GWT;

public class AnomalyFacade_Web {

	private static AnomalyFacade_Web instance;
	
	private final WebGinjector injector = GWT.create(WebGinjector.class);
	private final AnomalyService service;
	
	private AnomalyFacade_Web(){
		service = injector.getAnomalyService();
	}
	
	public static AnomalyFacade_Web getInstance(){
		if (instance==null)
			instance = new AnomalyFacade_Web();
		
		return instance;
	}
	
	public void getAnomalies(AnomalyAsyncRequestHandler handler){
		service.getAnomalies(handler);
	}
	
}
