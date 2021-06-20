/**
 * @author diafara
 * Metal.java
 * 3 juin 2021
 * 18:40:53
 */
package composants;

import javax.swing.ImageIcon;

import model.Composant;

// TODO: Auto-generated Javadoc
/**
 * The Class Metal.
 *
 * @author diafara
 * Metal.java
 * 3 juin 2021
 * 18:35:19
 */
public class Metal extends Composant {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3288667271214769760L;

	/**
	 * Instantiates a new metal.
	 */
	public Metal() {
		// TODO Auto-generated constructor stub
		this.icon = new ImageIcon("src/ressources/metal.png");
	}
	
	/**
	 * Instantiates a new metal.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Metal(int x, int y) {
		super(x, y);
		this.icon = new ImageIcon("src/ressources/metal.png");
		// TODO Auto-generated constructor stub
	}
	
}
