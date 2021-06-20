/**
 * @author diafara
 * Vente.java
 * 10 juin 2021
 * 14:28:21
 */
package strategy;


// TODO: Auto-generated Javadoc
/**
 * The Class Vente.
 *
 * @author diafara
 * Vente.java
 * 3 juin 2021
 * 18:51:40
 */
public class Vente {
	
	/** The i vente strategy. */
	private IVenteStrategy iVenteStrategy;

	/**
	 * Instantiates a new vente.
	 */
	public Vente() {
		//default strategy of sale
		this.iVenteStrategy = new VenteFixe();
	}
	
	
	/**
	 * Apply vente.
	 */
	public void applyVente() {
		iVenteStrategy.vendre();
	}
	
	
	/**
	 * Sets the vente strategy.
	 *
	 * @param iVenteStrategy the new i vente strategy
	 */
	public void setIVenteStrategy(IVenteStrategy iVenteStrategy) {
        this.iVenteStrategy = iVenteStrategy;
    }

	/**
	 * Gets the i vente strategy.
	 *
	 * @return the i vente strategy
	 */
	public IVenteStrategy getiVenteStrategy() {
		return iVenteStrategy;
	}
	
}
