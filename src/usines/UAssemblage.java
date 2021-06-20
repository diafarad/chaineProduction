/**
 * @author diafara
 * UAssemblage.java
 * 10 juin 2021
 * 14:29:56
 */
package usines;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import composants.Aile;
import composants.Avion;
import composants.Moteur;
import model.Composant;
import model.Icon;
import model.Usine;

// TODO: Auto-generated Javadoc
/**
 * The Class UAssemblage.
 */
public class UAssemblage extends Usine {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2814241311582040594L;
	
	/** The indicator of production. */
	private int i = 0;
	
	/** The list aile entree. */
	private List<Aile> listAileEntree = new ArrayList<Aile>();
	
	/** The list moteur entree. */
	private List<Moteur> listMoteurEntree = new ArrayList<Moteur>();
	
	/**
	 * Instantiates a new u assemblage.
	 */
	public UAssemblage() {
		super();
		this.intervalle = 110;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new u assemblage.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public UAssemblage(int x, int y) {
		super(x, y);
		this.intervalle = 110;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Produire.
	 */
	@Override
	public void produire() {
		if (listAileEntree.size() >= 2 && listMoteurEntree.size() >= 4) {
			if(i >= 1 && i <= 36) {
				this.setCic(this.getIcons().get(1));
			}
			if(i >= 37 && i <= 72) {
				this.setCic(this.getIcons().get(2));
			}
			if(i >= 73 && i < 109) {
				this.setCic(this.getIcons().get(3));
			}
			
			i=i+5;	
			
			if(i >= intervalle) {
				this.listComposantSortie.add(new Avion(160,192));		
				//System.out.println("TERMINE!!!");
				this.listComposantEntree = new ArrayList<Composant>();
				this.listAileEntree = new ArrayList<Aile>();
				this.listMoteurEntree = new ArrayList<Moteur>();
				ImageIcon i0 = new ImageIcon("src/ressources/UA0%.png");
				this.cic = new Icon("vide", i0);
				i=0;
			}
		}
	}
	
	/**
	 * Load icon.
	 */
	@Override
	public void loadIcon() {
		// TODO Auto-generated method stub
		ImageIcon i0 = new ImageIcon("src/ressources/UA0%.png");
		ImageIcon i1 = new ImageIcon("src/ressources/UA33%.png");
		ImageIcon i2 = new ImageIcon("src/ressources/UA66%.png");
		ImageIcon i3 = new ImageIcon("src/ressources/UA100%.png");
		this.cic = new Icon("vide", i0);
		this.icons.add(new Icon("vide", i0));
		this.icons.add(new Icon("un", i1));
		this.icons.add(new Icon("tier", i2));
		this.icons.add(new Icon("plein", i3));
	}

	/**
	 * Gets the list aile entree.
	 *
	 * @return the list aile entree
	 */
	public List<Aile> getListAileEntree() {
		return listAileEntree;
	}

	/**
	 * Sets the list aile entree.
	 *
	 * @param listAileEntree the new list aile entree
	 */
	public void setListAileEntree(List<Aile> listAileEntree) {
		this.listAileEntree = listAileEntree;
	}

	/**
	 * Gets the list moteur entree.
	 *
	 * @return the list moteur entree
	 */
	public List<Moteur> getListMoteurEntree() {
		return listMoteurEntree;
	}

	/**
	 * Sets the list moteur entree.
	 *
	 * @param listMoteurEntree the new list moteur entree
	 */
	public void setListMoteurEntree(List<Moteur> listMoteurEntree) {
		this.listMoteurEntree = listMoteurEntree;
	}


}
