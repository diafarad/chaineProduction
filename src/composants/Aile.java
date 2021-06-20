/**
 * @author diafara
 * Aile.java
 * 3 juin 2021
 * 18:40:48
 */
package composants;

import javax.swing.ImageIcon;

import model.Composant;

// TODO: Auto-generated Javadoc
/**
 * The Class Aile.
 *
 * @author diafara
 * Aile.java
 * 3 juin 2021
 * 18:29:58
 */
public class Aile extends Composant {
										
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3209675896210632053L;

	/**
	 * Instantiates a new aile.
	 */
	public Aile() {
		// TODO Auto-generated constructor stub
		this.icon = new ImageIcon("src/ressources/aile.png");
	}
	
	/**
	 * Instantiates a new aile.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Aile(int x, int y) {
		super(x, y);
		this.icon = new ImageIcon("src/ressources/aile.png");
		// TODO Auto-generated constructor stub
	}
	

}
