package com.calin.anomalytracker.businesslogic.restservices;

import java.util.List;

import javax.inject.Inject;

import com.calin.anomalytracker.businesslogic.facade.AnomalyAsyncRequestHandler;
import com.calin.anomalytracker.businesslogic.models.AnomalyListModel;
import com.calin.anomalytracker.businesslogic.models.AnomalyModel;
import com.calin.anomalytracker.businesslogic.models.factories.AnomalyAutoBeanFactoryWrapper;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;

public class AnomalyService extends ServiceBase<AnomalyModel>{
	
	private static final String GET_ANOMALIES_ENDPOINT = "http://www.json-generator.com/api/json/get/cgaYsDEULC";
	//private static final String GET_ANOMALIES_ENDPOINT = "http://www.json-generator.com/api/json/get/bLUXdMQwSW";
	//private static final String GET_ANOMALIES_ENDPOINT = "http://www.json-generator.com/api/json/get/coRacTRoAy";
	//private static final String GET_ANOMALIES_ENDPOINT = "http://www.json-generator.com/api/json/get/bMSHfnAaGa";
	//private static final String GET_ANOMALIES_ENDPOINT = "http://www.json-generator.com/api/json/get/cbqvSchYSW";
	
	@Inject
	public AnomalyService(DataAccess dataAccess, AnomalyAutoBeanFactoryWrapper wrapper){
		super(dataAccess, wrapper);
	}
	
	private AnomalyAsyncRequestHandler handler;
	
	public void getAnomalies(AnomalyAsyncRequestHandler handler){
		this.handler = handler;
		dal.getJsonList(GET_ANOMALIES_ENDPOINT, this);
	}
	
	@Override
	public AnomalyModel deserialize(String json) {
		AutoBean<AnomalyModel> anomalyAutoBean = AutoBeanCodex.decode(this.anomalyAutoBeanFactory, AnomalyModel.class, json);
		return anomalyAutoBean.as();
	}

	@Override
	public void onRequestCompleted(AnomalyModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AnomalyModel> deserializeList(String json) {
		AutoBean<AnomalyListModel> anomalyListAutoBean = AutoBeanCodex.decode(this.anomalyAutoBeanFactory, AnomalyListModel.class, json);
		return anomalyListAutoBean.as().getExceptionList();
	}

	@Override
	public void onRequestCompleted(List<AnomalyModel> model) {
		handler.exceptionListsRetrieved(model);
	}

}
