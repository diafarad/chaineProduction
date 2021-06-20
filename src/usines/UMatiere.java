/**
 * @author diafara
 * UMatiere.java
 * 10 juin 2021
 * 14:30:28
 */
package usines;


import javax.swing.ImageIcon;

import composants.Metal;
import model.Icon;
import model.Usine;

// TODO: Auto-generated Javadoc
/**
 * The Class UMatiere.
 */
public class UMatiere extends Usine {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8887686458181384241L;
	
	/** The indicator of production. */
	private int i = 0;

	/**
	 * Instantiates a new u matiere.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public UMatiere(int x, int y) {
		super(x, y);
		this.intervalle = 100;
		this.loadIcon();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new u matiere.
	 */
	public UMatiere() {
		super();
		this.intervalle = 100;
		this.loadIcon();
		
	}

	/**
	 * Produire.
	 */
	@Override
	public void produire() {
		// TODO Auto-generated method stub
		
		if(i >= 1 && i <= 33) {
			this.setCic(this.getIcons().get(1));
		}
		if(i >= 34 && i <= 66) {
			this.setCic(this.getIcons().get(2));
		}
		if(i >= 67 && i < 100) {
			this.setCic(this.getIcons().get(3));
		}
		i=i+2;	
		
		if(i >= intervalle) {
			if(this.id == 11) {
				this.listComposantSortie.add(new Metal(32,32));
			}
			if(this.id == 12) {
				this.listComposantSortie.add(new Metal(96,352));
			}
			if(this.id == 13) {
				this.listComposantSortie.add(new Metal(544,576));
			}			
			//System.out.println("TERMINE!!!");
			i=0;
		}
	}
	
	/**
	 * Load icon.
	 */
	@Override
	public void loadIcon() {
		// TODO Auto-generated method stub
		ImageIcon i0 = new ImageIcon("src/ressources/UMP0%.png");
		ImageIcon i1 = new ImageIcon("src/ressources/UMP33%.png");
		ImageIcon i2 = new ImageIcon("src/ressources/UMP66%.png");
		ImageIcon i3 = new ImageIcon("src/ressources/UMP100%.png");
		this.cic = new Icon("vide", i0);
		this.icons.add(new Icon("vide", i0));
		this.icons.add(new Icon("un", i1));
		this.icons.add(new Icon("tier", i2));
		this.icons.add(new Icon("plein", i3));
	}

}
