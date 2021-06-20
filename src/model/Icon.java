/**
 * @author diafara
 * Icon.java
 * 3 juin 2021
 * 18:41:12
 */
package model;

import javax.swing.ImageIcon;

// TODO: Auto-generated Javadoc
/**
 * The Class Icon.
 *
 * @author diafara
 * Icon.java
 * 3 juin 2021
 * 18:35:32
 */
public class Icon {
	
	/** The type. */
	protected String type;
	
	/** The icon. */
	protected ImageIcon icon;
	
	/**
	 * Instantiates a new icon.
	 *
	 * @param type the type
	 * @param icon the icon
	 */
	public Icon(String type, ImageIcon icon) {
		super();
		this.type = type;
		this.icon = icon;
	}
	
	/**
	 * Instantiates a new icon.
	 */
	public Icon() {
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
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
