/**
 * @author diafara
 * UAile.java
 * 10 juin 2021
 * 14:29:45
 */
package usines;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import composants.Aile;
import model.Composant;
import model.Icon;
import model.Usine;

// TODO: Auto-generated Javadoc
/**
 * The Class UAile.
 *
 * @author diafara
 * UAile.java
 * 3 juin 2021
 * 18:36:06
 */
public class UAile extends Usine {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5198873097771556275L;
	
	/** The indicator of production. */
	private int i = 0;
	
	/** Liste des composants sorties. */
	List<Composant> listComposantsSortie = new ArrayList<>();

	/**
	 * Instantiates a new u aile.
	 */
	public UAile() {
		super();
		this.intervalle = 50;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new u aile.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public UAile(int x, int y) {
		super(x, y);
		this.intervalle = 50;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Produire.
	 */
	@Override
	public void produire() {
		if (listComposantEntree.size() >= 2) {
			if(i >= 1 && i <= 16) {
				this.setCic(this.getIcons().get(1));
			}
			if(i >= 17 && i <= 35) {
				this.setCic(this.getIcons().get(2));
			}
			if(i >= 36 && i < 49) {
				this.setCic(this.getIcons().get(3));
			}
			i=i+4;	
			
			if(i >= intervalle) {
				this.listComposantSortie.add(new Aile(320,32));		
				//System.out.println("TERMINE!!!");
				this.listComposantEntree = new ArrayList<Composant>();
				ImageIcon i0 = new ImageIcon("src/ressources/UT0%.png");
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
		ImageIcon i0 = new ImageIcon("src/ressources/UT0%.png");
		ImageIcon i1 = new ImageIcon("src/ressources/UT33%.png");
		ImageIcon i2 = new ImageIcon("src/ressources/UT66%.png");
		ImageIcon i3 = new ImageIcon("src/ressources/UT100%.png");
		this.cic = new Icon("vide", i0);
		this.icons.add(new Icon("vide", i0));
		this.icons.add(new Icon("un", i1));
		this.icons.add(new Icon("tier", i2));
		this.icons.add(new Icon("plein", i3));
	}

	/**
	 * Gets the list composants sortie.
	 *
	 * @return the list composants sortie
	 */
	public List<Composant> getListComposantsSortie() {
		return listComposantsSortie;
	}

	/**
	 * Sets the list composants sortie.
	 *
	 * @param listComposantsSortie the new lis composants sortie
	 */
	public void setListComposantsSortie(List<Composant> listComposantsSortie) {
		this.listComposantsSortie = listComposantsSortie;
	}
	
	
}
