package model;

import view.TextArea;

public interface Subject {
	
	public void addSubscriber(TextArea t);
	
	/**
	 * Notify subscribers.
	 *
	 * @param tweet the tweet
	 */
	public void notifySubscribers(String tweet);

}
