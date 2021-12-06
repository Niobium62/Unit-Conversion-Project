package model;

import view.TextArea;

public interface Subject {
	
	public void addSubscriber(TextArea t);
	public void notifySubscribers(String tweet);
	//public void removeSubscriber(Observer observer);

}
