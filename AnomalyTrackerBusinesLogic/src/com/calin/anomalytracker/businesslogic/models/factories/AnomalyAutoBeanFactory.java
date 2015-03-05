package com.calin.anomalytracker.businesslogic.models.factories;

import com.calin.anomalytracker.businesslogic.models.*;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;

/* @Category(AnomalyCategory.class) */
public interface AnomalyAutoBeanFactory extends AutoBeanFactory{

	AutoBean<AnomalyModel> exception();
	
	AutoBean<AnomalyListModel> exceptionList();

}
