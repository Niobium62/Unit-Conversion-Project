package model;

import java.util.ArrayList;
import java.util.List;
import view.TextArea;

public class ValueToConvert implements Subject {
	public List<TextArea> subscribers;

	String value = "";

	public ValueToConvert() {
		subscribers = new ArrayList<TextArea>();

	}

	public String getValue() {
		return value;
	}

	public void setValue(String tweet) {
		notifySubscribers(tweet);
	}

	@Override
	public synchronized void addSubscriber(TextArea t) {
		// TODO Auto-generated method stub
		subscribers.add(t);
	}

	@Override
	public void notifySubscribers(String tweet) {
		// TODO Auto-generated method stub
		for (TextArea t : subscribers) {
			t.updateSquare(tweet);
		}
	}

}
