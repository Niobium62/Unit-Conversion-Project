package model;

import view.TextArea;

/**
 * 
 * @author Lab 6 Group 13
 * Subject interface knows its observers and proposes operations to attach and detach them
 */
public interface Subject {
	
	/**
	 * add new Subscriber to the Subject
	 * @param TextArea t
	 */
	public void addSubscriber(TextArea t);
	
	/**
	 * Notify subscribers.
	 *
	 * @param tweet the tweet
	 */
	public void notifySubscribers(String tweet);

}
