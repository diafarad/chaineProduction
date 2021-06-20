/**
 * @author diafara
 * Avion.java
 * 3 juin 2021
 * 18:40:39
 */
package composants;

import javax.swing.ImageIcon;		

import model.Composant;

// TODO: Auto-generated Javadoc
/**
 * The Class Avion.
 *
 * @author diafara
 * Avion.java
 * 3 juin 2021
 * 18:35:14
 */
public class Avion extends Composant {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1416531545203561855L;

	/**
	 * Instantiates a new avion.
	 */
	public Avion() {
		// TODO Auto-generated constructor stub
		this.icon = new ImageIcon("src/ressources/avion.png");
	}
	
	/**
	 * Instantiates a new avion.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Avion(int x, int y) {
		super(x, y);
		this.icon = new ImageIcon("src/ressources/avion.png");
		// TODO Auto-generated constructor stub
	}
	

}
