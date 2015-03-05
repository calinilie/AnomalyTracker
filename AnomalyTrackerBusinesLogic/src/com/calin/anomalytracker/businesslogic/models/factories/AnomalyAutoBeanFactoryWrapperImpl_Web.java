package com.calin.anomalytracker.businesslogic.models.factories;

import com.google.gwt.core.shared.GWT;

public class AnomalyAutoBeanFactoryWrapperImpl_Web implements AnomalyAutoBeanFactoryWrapper{

	@Override
	public AnomalyAutoBeanFactory getExceptionAutoBeanFactory() {
		
		return GWT.create(AnomalyAutoBeanFactory.class);
		
	}

}
