package controller;

import java.util.ArrayList;
import java.util.List;

import model.TextArea;

public class ValueController {
	private List<TextArea> subscribers;
	
	public ValueController() {
		subscribers = new ArrayList<TextArea>();
	}
	
	public void add(TextArea t) {
		subscribers.add(t);
	}
	
	public void notifySubscribers(String text) {
		for (TextArea t : subscribers) {
			t.updateSquare(text);
		}
	}
	
}
