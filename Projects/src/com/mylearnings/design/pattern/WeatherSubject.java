package com.mylearnings.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The weather subject is responsible to update its observers(@link Observer) interface registered as
 * the possible interface
 * 
 * 
 * The only data {@link WeatherType} is moved and updated between the clients or listeners
 * @author enomoha
 *
 */
public class WeatherSubject 
{
    
    private WeatherType currentWeather;
    private List<Observer> Observers;
    
    
    public WeatherSubject()
    {
        Observers = new ArrayList<>();
        currentWeather = WeatherType.WINDY;
    }
    
    /**
     * Adds the observer
     * 
     * @param pObserver
     * @throws Exception
     */
    private void addObservers(Observer pObserver) throws Exception 
    {
        if(pObserver != null)
            Observers.add(pObserver);
        else
            throw new Exception("Object is not existing");
    }
    
    /**
     * Remove the Observer
     * @param pObserver
     */
    private void removeObserver(Observer pObserver)
    {
        Observers.remove(pObserver);
        
    }

    /**
     * Notify your observer in your update of change in weather
     */
    private void notifyObserver()
    {
        for (Observer myObserver: Observers)
        {
            myObserver.update(currentWeather);
        }
    }
    
    /**
     * Makes time pass for weather
     */
    public void timePasses() {
      WeatherType[] enumValues = WeatherType.values();
      currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
      System.out.println("The weather changed to " + currentWeather + ".");
      notifyObserver();
    }
    
}
