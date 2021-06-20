/**
 * @author diafara
 * VenteProba.java
 * 10 juin 2021
 * 14:28:47
 */
package strategy;

import java.util.Random;

import javax.swing.SwingWorker;

import singleton.Singleton;

// TODO: Auto-generated Javadoc
/**
 * The Class VenteProba.
 *
 * @author diafara
 * VenteProba.java
 * 3 juin 2021
 * 18:45:33
 */
public class VenteProba extends SwingWorker<Void, Void> implements IVenteStrategy {
	
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
			Random r = new Random();
	        int res = r.nextInt(101-1) + 1;
	        System.out.println("RANDOOOOOOOOMMMMMM : "+res);
	        	//Si la capacité de l'entrepot est atteint, on fait automatiquement une vente
				if ((singleton.getEntrepot().getQte() == singleton.getEntrepot().getCapacite())) {
					singleton.getEntrepot().getListComposantEntree().remove(singleton.getEntrepot().getListComposantEntree().get(0));
					singleton.getEntrepot().setQte(singleton.getEntrepot().getListComposantEntree().size());
					System.out.println("Vente proba effectuée 1");
				}
				//Sinon
				else {
					//Si res est compris entre 90 et 100, on fait une vente
					if (res >=90 && res <= 100) {
						singleton.getEntrepot().getListComposantEntree().remove(singleton.getEntrepot().getListComposantEntree().get(0));
						singleton.getEntrepot().setQte(singleton.getEntrepot().getListComposantEntree().size());
						System.out.println("Vente proba effectuée 2");
					}
				}
			
		}
		return null;
	}

}
