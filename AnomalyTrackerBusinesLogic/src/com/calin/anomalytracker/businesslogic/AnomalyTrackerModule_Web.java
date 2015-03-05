package com.calin.anomalytracker.businesslogic;

import javax.inject.Singleton;

import com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper;
import com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapperImpl_Web;
import com.calin.anomalytracker.businesslogic.restservices.AnomalyService;
import com.calin.anomalytracker.businesslogic.restservices.DataAccess;
import com.calin.anomalytracker.businesslogic.restservices.DataAccessImpl_Web;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;


public class AnomalyTrackerModule_Web extends AbstractGinModule{

	@Override
	protected void configure() {
		bind(AnomalyAutoBeanFactoryWrapper.class).to(AnomalyAutoBeanFactoryWrapperImpl_Web.class);
		bind(DataAccess.class).to(DataAccessImpl_Web.class).in(Singleton.class);
	}
	
	@Provides 
	AnomalyService provideAnomalyService(DataAccess dataAccess, AnomalyAutoBeanFactoryWrapper wrapper){
		return new AnomalyService(dataAccess, wrapper);
	}

}
