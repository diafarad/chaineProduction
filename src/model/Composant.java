/**
 * @author diafara
 * Composant.java
 * 3 juin 2021
 * 18:39:10
 */
package model;

import java.awt.Point;

import javax.swing.ImageIcon;

// TODO: Auto-generated Javadoc
/**
 * The Class Composant.
 *
 * @author diafara
 * Composant.java
 * 3 juin 2021
 * 18:35:29
 */
public class Composant extends Point {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6296823537816926460L;

	/** The icon. */
	protected ImageIcon icon;

	
	/**
	 * Instantiates a new composant.
	 */
	public Composant() {	
	}
	
	/**
	 * Instantiates a new composant.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Composant(int x, int y) {
		super.x = x;
		super.y = y;	
	}
	
	/**
	 * Gets the icon.
	 *
	 * @return the icon
	 */
	public ImageIcon getIcon() {
		return icon;
	}

	/**
	 * Sets the icon.
	 *
	 * @param icon the new icon
	 */
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
}
