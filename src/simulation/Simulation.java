package simulation;

import singleton.Singleton;

public class Simulation {

	/**
	 * Cette classe représente l'application dans son ensemble.
	 */

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		FenetrePrincipale fenetre = new FenetrePrincipale();		
		
		singleton.getEnvironnement().addPropertyChangeListener(fenetre);
		singleton.getEnvironnement().execute();
	}
}
