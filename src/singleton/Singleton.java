/**
 * @author diafara
 * Singleton.java
 * 10 juin 2021
 * 14:26:29
 */
package singleton;

import model.Usine;
import simulation.Environnement;
import usines.Entrepot;
import usines.UAile;
import usines.UAssemblage;
import usines.UMatiere;
import usines.UMoteur;

// TODO: Auto-generated Javadoc
/**
 * The Class Singleton.
 *
 * @author diafara
 * Singleton.java
 * 8 juin 2021
 * 16:13:46
 */
public final class Singleton {
	
    /** The instance. */
    private static Singleton instance;
    
    /** Usine matiere 1. */
    private static Usine uMatiere1;
    
    /** Usine matiere 2. */
    private static Usine uMatiere2;
    
    /** Usine matiere 3. */
    private static Usine uMatiere3;
    
    /** Usine aile. */
    private static Usine uAile;
    
    /** Usine assemblage. */
    private static UAssemblage uAssemblage;
    
    /** The entrepot. */
    private static Entrepot entrepot;
    
    /** The u moteur. */
    private static Usine uMoteur;
    
    /** The environnement. */
    private static Environnement environnement;
   
    /**
     * Instantiates a new singleton.
     */
    private Singleton() {
    }

    /**
     * Gets the single instance of Singleton.
     *
     * @return single instance of Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            uMatiere1 = new UMatiere(32,32);
        	uMatiere2 = new UMatiere(96,352);
        	uMatiere3 = new UMatiere(544,576);
        	uAile = new UAile(320,32);	
        	uAssemblage = new UAssemblage(160,192);
        	entrepot = new Entrepot(640,192);
        	uMoteur = new UMoteur(320,352);
        	uMatiere1.setId(11);
    		uMatiere2.setId(12);
    		uMatiere3.setId(13);
    		environnement = new Environnement();
        }
        return instance;
    }

	/**
	 * Gets the u matiere 1.
	 *
	 * @return the u matiere 1
	 */
	public Usine getuMatiere1() {
		return uMatiere1;
	}

	/**
	 * Gets the u matiere 2.
	 *
	 * @return the u matiere 2
	 */
	public Usine getuMatiere2() {
		return uMatiere2;
	}

	/**
	 * Gets the u matiere 3.
	 *
	 * @return the u matiere 3
	 */
	public Usine getuMatiere3() {
		return uMatiere3;
	}	

	/**
	 * Gets the u aile.
	 *
	 * @return the u aile
	 */
	public Usine getuAile() {
		return uAile;
	}
	
	/**
	 * Gets the u assemblage.
	 *
	 * @return the u assemblage
	 */
	public UAssemblage getuAssemblage() {
		return uAssemblage;
	}

	/**
	 * Gets the entrepot.
	 *
	 * @return the entrepot
	 */
	public Entrepot getEntrepot() {
		return entrepot;
	}

	/**
	 * Gets the u moteur.
	 *
	 * @return the u moteur
	 */
	public Usine getuMoteur() {
		return uMoteur;
	}

	public void setuMatiere1(Usine uMatiere1) {
		Singleton.uMatiere1 = uMatiere1;
	}

	public void setuMatiere2(Usine uMatiere2) {
		Singleton.uMatiere2 = uMatiere2;
	}

	public void setuMatiere3(Usine uMatiere3) {
		Singleton.uMatiere3 = uMatiere3;
	}

	public void setuAile(Usine uAile) {
		Singleton.uAile = uAile;
	}

	public void setuAssemblage(UAssemblage uAssemblage) {
		Singleton.uAssemblage = uAssemblage;
	}

	public void setEntrepot(Entrepot entrepot) {
		Singleton.entrepot = entrepot;
	}

	public void setuMoteur(Usine uMoteur) {
		Singleton.uMoteur = uMoteur;
	}

	/**
	 * Gets the environnement.
	 *
	 * @return the environnement
	 */
	public Environnement getEnvironnement() {
		return environnement;
	}

}
