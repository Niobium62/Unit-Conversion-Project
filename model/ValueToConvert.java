package model;

import java.util.ArrayList;
import java.util.List;
import view.TextArea;

/**
 * The Class ValueToConvert, that notifies a list of subscribers when changes have been made to the CentimetersArea
 */
public class ValueToConvert implements Subject {
	
	/** The subscribers. */
	public List<TextArea> subscribers;

	/** The value. */
	String value = "";

	/**
	 * Instantiates a new ValueToConvert.
	 */
	public ValueToConvert() {
		subscribers = new ArrayList<TextArea>();
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param tweet the new value
	 */
	public void setValue(String tweet) {
		notifySubscribers(tweet);
	}

	/**
	 * Adds the subscriber.
	 *
	 * @param t the TextArea
	 */
	@Override
	public synchronized void addSubscriber(TextArea t) {
		subscribers.add(t);
	}

	/**
	 * Notify subscribers.
	 *
	 * @param tweet, the new string to be updated
	 */
	@Override
	public void notifySubscribers(String tweet) {
		for (TextArea t : subscribers) {
			t.updateSquare(tweet);
		}
	}

}
