/**
 * @author diafara
 * Observable.java
 * 10 juin 2021
 * 14:25:37
 */
package observateur;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Observable.
 *
 * @author diafara
 * Observable.java
 * 2 juin 2021
 * 01:21:36
 */
public class Observable {
		
	/** The list observers. */
	private List<Observer> listObservers = new ArrayList<Observer>();
	
	/**
	 * Adds the observer.
	 *
	 * @param o the Observer
	 */
	public void addObserver(Observer o) {
		if (!this.listObservers.contains(o)) {
			this.listObservers.add(o);
		}
	}
	
	/**
	 * Removes the observer.
	 *
	 * @param o the Obserser
	 */
	public void removeObserver(Observer o) {
		if (this.listObservers.contains(o)) {
			this.listObservers.remove(o);
		}
	}

	/**
	 * Notify observers.
	 */
	public void notifyObservers() {
		for (int i = 0; i < this.listObservers.size(); i++) {
			this.listObservers.get(i).update();
		}
	}
	
}
