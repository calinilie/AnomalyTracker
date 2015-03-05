package com.calin.anomalytracker.businesslogic.restservices;

import com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactory;
import com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper;

public abstract class ServiceBase<T> implements Service<T>{

	protected AnomalyAutoBeanFactory anomalyAutoBeanFactory;
	protected DataAccess dal;
	
	public ServiceBase(DataAccess dal, AnomalyAutoBeanFactoryWrapper wrapper){
		this.anomalyAutoBeanFactory = wrapper.getExceptionAutoBeanFactory();
		this.dal = dal;
	}
	
}
