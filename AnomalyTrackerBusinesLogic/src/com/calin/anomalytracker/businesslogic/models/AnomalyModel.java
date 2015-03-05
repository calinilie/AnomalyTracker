package com.calin.anomalytracker.businesslogic.models;

public interface AnomalyModel {

	public String getId();

	public void setId(String id);

	public String getTimeStamp();

	public void setTimeStamp(String timeStamp);

	public String getArea();

	public void setArea(String area);

	public String getServerName();

	public void setServerName(String serverName);

	public String getExceptionName();

	public void setExceptionName(String exceptionName);

	public String getMessage();

	public void setMessage(String message);

	public String getSource();

	public void setSource(String source);

	public String getStackTrace();

	public void setStackTrace(String stackTrace);

	public Integer getThreadId();

	public void setThreadId(Integer threadId);

	public Integer getBinId();

	public void setBinId(Integer binId);

	public String getHttps();

	public void setHttps(String https);

	public String getDns();

	public void setDns(String dns);

	public String getPath();

	public void setPath(String path);

	public String getQueryString();

	public void setQueryString(String queryString);

	public String getController();

	public void setController(String controller);

	public String getAction();

	public void setAction(String action);

	public String getUrl();

	public void setUrl(String url);

	public String getOriginalUrl();

	public void setOriginalUrl(String originalUrl);

	public String getClientIPAddress();

	public void setClientIPAddress(String clientIPAddress);
	
	//public Date fetchTimeStampAsDate();

}
