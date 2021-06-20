/**
 * @author diafara
 * Usine.java
 * 3 juin 2021
 * 18:41:26
 */
package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Usine.
 *
 * @author diafara
 * Usine.java
 * 3 juin 2021
 * 18:35:36
 */
public class Usine extends Point {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6931115483560006229L;
	
	/** The id. */
	protected int id;
	
	/** The indicator. */
	protected int indicateur = 0;
	
	/** Intervalle de production. */
	protected int intervalle;
	
	/** The icons. */
	protected final List<Icon> icons;
	
	/** The list composant entree. */
	protected List<Composant> listComposantEntree = new ArrayList<Composant>();
	
	/** The list composant sortie. */
	protected List<Composant> listComposantSortie = new ArrayList<Composant>();
	
	/** L'icon current affichée à un instant T de la production. */
	protected Icon cic;
	
	/**
	 * Instantiates a new usine.
	 */
	public Usine() {
		this.icons = new ArrayList<Icon>();
	}
	
	/**
	 * Instantiates a new usine.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Usine(int x, int y) {
		super.x = x;
		super.y = y;
		this.icons = new ArrayList<Icon>();
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the cic.
	 *
	 * @return the cic
	 */
	public Icon getCic() {
		return cic;
	}

	/**
	 * Sets the cic.
	 *
	 * @param cic the new cic
	 */
	public void setCic(Icon cic) {
		this.cic = cic;
	}
	
	/**
	 * Produire.
	 */
	public void produire() {
		//produire
	}

	/**
	 * Gets the list composant entree.
	 *
	 * @return the list composant entree
	 */
	public List<Composant> getListComposantEntree() {
		return listComposantEntree;
	}

	/**
	 * Sets the list composant entree.
	 *
	 * @param listComposant the new list composant entree
	 */
	public void setListComposantEntree(List<Composant> listComposant) {
		this.listComposantEntree = listComposant;
	}
	
	/**
	 * Gets the list composant sortie.
	 *
	 * @return the list composant sortie
	 */
	public List<Composant> getListComposantSortie() {
		return listComposantSortie;
	}

	/**
	 * Sets the list composant sortie.
	 *
	 * @param listComposantSortie the new list composant sortie
	 */
	public void setListComposantSortie(List<Composant> listComposantSortie) {
		this.listComposantSortie = listComposantSortie;
	}

	/**
	 * Gets the indicateur.
	 *
	 * @return the indicateur
	 */
	public int getIndicateur() {
		return indicateur;
	}

	/**
	 * Sets the indicateur.
	 *
	 * @param indicateur the new indicateur
	 */
	public void setIndicateur(int indicateur) {
		this.indicateur = indicateur;
	}

	/**
	 * Gets the intervalle.
	 *
	 * @return the intervalle
	 */
	public int getIntervalle() {
		return intervalle;
	}

	/**
	 * Sets the intervalle.
	 *
	 * @param intervalle the new intervalle
	 */
	public void setIntervalle(int intervalle) {
		this.intervalle = intervalle;
	}

	/**
	 * Gets the icons.
	 *
	 * @return the icons
	 */
	public List<Icon> getIcons() {
		return icons;
	}
	
	/**
	 * Load icon.
	 */
	public void loadIcon() {
		
	}
	
	
}
