package com.calin.anomalytracker.businesslogic.models.factories;
/***
 * Creates ExceptionsAutoBeanFactories, so it is in fact a factory of factories
 * "Mill" seems to be a good synonym to "Factory" in this scenario.
 * 
 * A consideration would have been to name this ExceptionAutoBeanFactoryFactory
 * but i believe that would be even more confusing.
 * 
 * @author calin
 *
 */
public interface AnomalyAutoBeanFactoryWrapper {
	
	public AnomalyAutoBeanFactory getExceptionAutoBeanFactory();

}
