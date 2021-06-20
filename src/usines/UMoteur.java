/**
 * @author diafara
 * UMoteur.java
 * 10 juin 2021
 * 14:30:36
 */
package usines;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import composants.Moteur;
import model.Composant;
import model.Icon;
import model.Usine;

// TODO: Auto-generated Javadoc
/**
 * The Class UMoteur.
 */
public class UMoteur extends Usine {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5139920843985245874L;
	
	/** The indicator of production. */
	private int i = 0;

	/**
	 * Instantiates a new u moteur.
	 */
	public UMoteur() {
		super();
		this.intervalle = 75;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new u moteur.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public UMoteur(int x, int y) {
		super(x, y);
		this.intervalle = 75;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Produire.
	 */
	@Override
	public void produire() {
		if (listComposantEntree.size() >= 4) {
			if(i >= 1 && i <= 20) {
				this.setCic(this.getIcons().get(1));
			}
			if(i >= 21 && i <= 49) {
				this.setCic(this.getIcons().get(2));
			}
			if(i >= 50 && i < 74) {
				this.setCic(this.getIcons().get(3));
			}
			//System.out.println("PRODUCTION!!!");
			i=i+5;	
			
			if(i >= intervalle) {
				this.listComposantSortie.add(new Moteur(320,352));		
				//System.out.println("TERMINE!!!");
				this.listComposantEntree = new ArrayList<Composant>();
				ImageIcon i0 = new ImageIcon("src/ressources/UM0%.png");
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
		ImageIcon i0 = new ImageIcon("src/ressources/UM0%.png");
		ImageIcon i1 = new ImageIcon("src/ressources/UM33%.png");
		ImageIcon i2 = new ImageIcon("src/ressources/UM66%.png");
		ImageIcon i3 = new ImageIcon("src/ressources/UM100%.png");
		this.cic = new Icon("vide", i0);
		this.icons.add(new Icon("vide", i0));
		this.icons.add(new Icon("un", i1));
		this.icons.add(new Icon("tier", i2));
		this.icons.add(new Icon("plein", i3));
	}
}
