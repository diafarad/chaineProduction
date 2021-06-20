package simulation;

import javax.swing.SwingWorker;

import singleton.Singleton;

public class Environnement extends SwingWorker<Object, String> implements observateur.Observer {
	private boolean actif = true;
	private static final int DELAI = 5;
	
	Singleton singleton = Singleton.getInstance();
	
	@Override
	protected Object doInBackground() throws Exception {
		if (!actif) {
			System.out.println("Production arr�t�e!");
		}
		while(actif) {
			Thread.sleep(DELAI);
			/**
			 * C'est ici que vous aurez � faire la gestion de la notion de tour.
			 */
			firePropertyChange("TEST", null, "Production...");
			update();
		}
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (!singleton.getEntrepot().isEtat()) {
			this.actif = false;
			//singleton.getEntrepot().setEtat(actif);
		}
		
		//firePropertyChange("ARRET", null, "Production arr�t�e!");
	}


	
	public boolean isActif() {
		return actif;
	}
	
	public void setActif(boolean a) {
		this.actif = a;
	}

}