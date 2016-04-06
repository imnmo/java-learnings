package com.mylearnings.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The weather subject is responsible to update its observers(@link Observer) interface registered as
 * the possible interface
 * 
 * @author enomoha
 *
 */
public class WeatherSubject 
{
    
    private WeatherType currentWeather;
    private List<Observer> Observers;
    
    
    //Private constructor no need for initialization
    private WeatherSubject()
    {
        currentWeather = WeatherType.WINDY;
    }
    private void addObservers(Observer pObserver) throws Exception 
    {
        if(pObserver != null)
            Observers.add(pObserver);
        else
            throw new Exception("Object is not existing");
    }
    
    private void removeObserver(Observer pObserver)
    {
        
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
