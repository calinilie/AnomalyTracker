package com.calin.anomalytracker.businesslogic;

import javax.inject.Singleton;

import com.calin.anomalytracker.businesslogic.models.factories.*;
import com.calin.anomalytracker.businesslogic.restservices.AnomalyService;
import com.calin.anomalytracker.businesslogic.restservices.DataAccess;
import com.calin.anomalytracker.businesslogic.restservices.DataAccessImpl;

import dagger.Module;
import dagger.Provides;

@Module(
	library = true,
	injects = AnomalyService.class
)
public class AnomalyTrackerModule {
	
	@Provides AnomalyAutoBeanFactoryWrapper provideAnomalyAutoBeanFactoryWrapper(){
		return new AnomalyAutoBeanFactoryWrapperImpl();
	}
	
	@Provides @Singleton DataAccess provideDataAccess(){
		return new DataAccessImpl();
	}
	
	@Provides @Singleton AnomalyService provideAnomalyService(DataAccess dataAccess, AnomalyAutoBeanFactoryWrapper wrapper){
		return new AnomalyService(dataAccess, wrapper);
	}
	
}
