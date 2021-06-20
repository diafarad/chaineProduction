/**
 * @author diafara
 * VenteFixe.java
 * 10 juin 2021
 * 14:28:32
 */
package strategy;

import javax.swing.SwingWorker;

import singleton.Singleton;

// TODO: Auto-generated Javadoc
/**
 * The Class VenteFixe.
 *
 * @author diafara
 * VenteFixe.java
 * 3 juin 2021
 * 18:51:15
 */
public class VenteFixe extends SwingWorker<Void, Void> implements IVenteStrategy {
	
	/** The singleton. */
	Singleton singleton = Singleton.getInstance();

	/**
	 * Vendre.
	 */
	@Override
	public void vendre() {
		// TODO Auto-generated method stub
		try {
			execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Do in background.
	 *
	 * @return the void
	 * @throws Exception the exception
	 */
	@Override
	protected Void doInBackground() throws Exception {
		// TODO Auto-generated method stub
		while (singleton.getEnvironnement().isActif()) {
			System.out.println("Production...");
			if (!singleton.getEntrepot().getListComposantEntree().isEmpty()) {
				if (singleton.getEntrepot().getQte() == singleton.getEntrepot().getCapacite()) {
					System.out.println("NOMBRE AVION "+singleton.getEntrepot().getListComposantEntree().size());
					singleton.getEntrepot().getListComposantEntree().remove(singleton.getEntrepot().getListComposantEntree().get(0));
					singleton.getEntrepot().setQte(singleton.getEntrepot().getListComposantEntree().size());
					singleton.getEntrepot().setEtat(true);
					System.out.println("Vente fixe effectuée");
					singleton.getEnvironnement().setActif(true);
				}
			}
		}
		return null;
	}


}
