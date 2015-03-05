package com.calin.anomalytracker.businesslogic.models.factories;

import com.google.web.bindery.autobean.vm.AutoBeanFactorySource;

public class AnomalyAutoBeanFactoryWrapperImpl implements AnomalyAutoBeanFactoryWrapper{

	@Override
	public AnomalyAutoBeanFactory getExceptionAutoBeanFactory() {
		return  AutoBeanFactorySource.create(AnomalyAutoBeanFactory.class);
	}
	
}
