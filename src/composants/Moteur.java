/**
 * @author diafara
 * Moteur.java
 * 3 juin 2021
 * 18:40:58
 */
package composants;

import javax.swing.ImageIcon;

import model.Composant;

// TODO: Auto-generated Javadoc
/**
 * The Class Moteur.
 *
 * @author diafara
 * Moteur.java
 * 3 juin 2021
 * 18:35:24
 */
public class Moteur extends Composant {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8469371033344005783L;

	/**
	 * Instantiates a new moteur.
	 */
	public Moteur() {
		// TODO Auto-generated constructor stub
		this.icon = new ImageIcon("src/ressources/moteur.png");
	}
	
	/**
	 * Instantiates a new moteur.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Moteur(int x, int y) {
		super(x, y);
		this.icon = new ImageIcon("src/ressources/moteur.png");
		// TODO Auto-generated constructor stub
	}
	
}
