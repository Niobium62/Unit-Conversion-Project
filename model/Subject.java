package model;

import view.TextArea;

/**
 * 
 * @author Lab 6 Group 13
 * Subject interface knows its observers and proposes operations to attach and detach them
 */
public interface Subject {
	
	public void addSubscriber(TextArea t);
	public void notifySubscribers(String tweet);
	//public void removeSubscriber(Observer observer);

}
