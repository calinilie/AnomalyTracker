package com.calin.anomalytracker.client;

import java.util.List;

import com.calin.anomalytracker.businesslogic.facade.AnomalyAsyncRequestHandler;
import com.calin.anomalytracker.businesslogic.facade.AnomalyFacade_Web;
import com.calin.anomalytracker.businesslogic.models.AnomalyModel;
import com.google.gwt.core.client.EntryPoint;

public class AnomalyTrackerWeb implements EntryPoint {
	
	public void onModuleLoad() {
		AnomalyFacade_Web.getInstance().getAnomalies(new AnomalyAsyncRequestHandler() {
			
			@Override
			public void exceptionListsRetrieved(List<AnomalyModel> list) {
				for(AnomalyModel m: list){
					System.out.println(m.getId() + " " +m.getExceptionName() + " " + m.getServerName() + " " + m.getTimeStamp());
				}
			}

			@Override
			public void requestFailed() {
				System.out.println("this is fucked!");
			}
			
		});
	}
}
