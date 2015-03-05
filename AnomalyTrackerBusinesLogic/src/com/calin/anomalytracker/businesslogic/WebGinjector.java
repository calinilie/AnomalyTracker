package com.calin.anomalytracker.businesslogic;

import com.calin.anomalytracker.businesslogic.restservices.AnomalyService;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;


@GinModules(AnomalyTrackerModule_Web.class)
public interface WebGinjector extends Ginjector{

	public AnomalyService getAnomalyService();
	
}
