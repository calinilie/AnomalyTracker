package com.calin.anomalytracker.businesslogic.models;

import java.util.List;

public interface AnomalyListModel {

	List<AnomalyModel> getExceptionList();
	
	void setExceptionList(List<AnomalyModel> list);
	
}
