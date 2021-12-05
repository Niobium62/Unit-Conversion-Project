package controller;

import java.util.ArrayList;
import java.util.List;

import model.TextArea;

/**
 * @author Feng Lian
 *
 */
public class ValueController {
	private List<TextArea> subscribers;
	
	
	public ValueController() {
		subscribers = new ArrayList<TextArea>();
	}
	
	/**
	 * 
	 * @param t
	 */
	public void add(TextArea t) {
		subscribers.add(t);
	}
	
	/**
	 * 
	 * @param text
	 */
	public void notifySubscribers(String text) {
		for (TextArea t : subscribers) {
			t.updateSquare(text);
		}
	}
	
}
