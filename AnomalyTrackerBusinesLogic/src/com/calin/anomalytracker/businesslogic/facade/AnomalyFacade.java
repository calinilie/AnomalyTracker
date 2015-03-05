package com.calin.anomalytracker.businesslogic.facade;

import com.calin.anomalytracker.businesslogic.AnomalyTrackerModule;
import com.calin.anomalytracker.businesslogic.restservices.AnomalyService;

import dagger.ObjectGraph;

public class AnomalyFacade{

	public static AnomalyFacade instance;
	
	private ObjectGraph graph;
	
	private AnomalyFacade() {
		graph = ObjectGraph.create(new AnomalyTrackerModule());
	}

	public static AnomalyFacade getInstance() {
		if (instance == null)
			instance = new AnomalyFacade();

		return instance;
	}

	public void getAnomalies(AnomalyAsyncRequestHandler handler){
		AnomalyService service = graph.get(AnomalyService.class);
		service.getAnomalies(handler);
	}
}
