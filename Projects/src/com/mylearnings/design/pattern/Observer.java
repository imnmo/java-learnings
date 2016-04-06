package com.mylearnings.design.pattern;

/**
 * The interface which acts as the observer/listener to get the notification from
 * the subject({@link WeatherSubject})
 * @author enomoha
 *
 */
public interface Observer
{

    void update(WeatherType data);
}
