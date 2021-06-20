/**
 * @author diafara
 * Entrepot.java
 * 3 juin 2021
 * 19:05:43
 */
package usines;

import javax.swing.ImageIcon;
import model.Icon;
import model.Usine;
import simulation.Environnement;
import strategy.Vente;

// TODO: Auto-generated Javadoc
/**
 * The Class Entrepot.
 *
 * @author diafara
 * Entrepot.java
 * 3 juin 2021
 * 18:36:01
 */
public class Entrepot extends Usine {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7696157168889099100L;
	
	/** The capacite. */
	private int capacite = 5;
	
	/** The state. */
	private boolean etat = true;
	
	/** The quantity. */
	private int qte;
	
	/** The observer. */
	private observateur.Observable observateur = new observateur.Observable();
	
	/** L'objet vente du patron strategy. */
	private Vente vente = new Vente();
	
	/**
	 * Instantiates a new entrepot.
	 */
	public Entrepot() {
		super();
		this.loadIcon();
		this.observateur.addObserver(new Environnement());
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new entrepot.
	 *
	 * @param x the x
	 * @param y the y
	 */
	/**
	 * @param x
	 * @param y
	 */
	/**
	 * @param x
	 * @param y
	 */
	public Entrepot(int x, int y) {
		super(x, y);
		this.loadIcon();
		this.observateur.addObserver(new Environnement());
		// TODO Auto-generated constructor stub
	}	
	
	/**
	 * Gets the capacite.
	 *
	 * @return the capacite
	 */
	public int getCapacite() {
		return capacite;
	}
	
	/**
	 * Sets the capacite.
	 *
	 * @param capacite the new capacite
	 */
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	/**
	 * Checks if is etat.
	 *
	 * @return true, if is etat
	 */
	public boolean isEtat() {
		return etat;
	}
	
	/**
	 * Sets the etat.
	 *
	 * @param etat the new etat
	 */
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQte() {
		return qte;
	}
	
	/**
	 * Sets the quantity.
	 *
	 * @param qte the new qte
	 */
	public void setQte(int qte) {
		this.qte = qte;
		if (this.qte == 0) {
			this.setCic(this.getIcons().get(0));
		}else {
			if(this.qte>= 1 && this.qte <= 2) {
				this.setCic(this.getIcons().get(1));
			}
			if(this.qte >= 3 && this.qte <= 4) {
				this.setCic(this.getIcons().get(2));
			}
			if(qte == capacite ) {
				this.setCic(this.getIcons().get(3));
				this.etat = false;
				//this.observateur.notifyObservers();
			}	
		}
	}
		
	public observateur.Observable getObservateur() {
		return observateur;
	}

	public void setObservateur(observateur.Observable observateur) {
		this.observateur = observateur;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	/**
	 * Load icons.
	 */
	@Override
	public void loadIcon() {
		// TODO Auto-generated method stub
		ImageIcon i0 = new ImageIcon("src/ressources/E0%.png");
		ImageIcon i1 = new ImageIcon("src/ressources/E33%.png");
		ImageIcon i2 = new ImageIcon("src/ressources/E66%.png");
		ImageIcon i3 = new ImageIcon("src/ressources/E100%.png");
		this.cic = new Icon("vide", i0);
		this.icons.add(new Icon("vide", i0));
		this.icons.add(new Icon("un", i1));
		this.icons.add(new Icon("tier", i2));
		this.icons.add(new Icon("plein", i3));
	}
		
}
