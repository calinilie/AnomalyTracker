package com.calin.anomalytracker.businesslogic.facade;

import java.util.List;

import com.calin.anomalytracker.businesslogic.models.AnomalyModel;

public interface AnomalyAsyncRequestHandler {

	public void exceptionListsRetrieved(List<AnomalyModel> list);
	
	public void requestFailed();
	
}
