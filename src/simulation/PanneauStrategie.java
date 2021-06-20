package simulation;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import singleton.Singleton;
import strategy.Vente;
import strategy.VenteProba;

public class PanneauStrategie extends JPanel {
	Singleton singleton = Singleton.getInstance();
	private static final long serialVersionUID = 1L;

	public PanneauStrategie() {

		ButtonGroup groupeBoutons = new ButtonGroup();
		JRadioButton strategie1 = new JRadioButton("Stratégie 1");
		JRadioButton strategie2 = new JRadioButton("Stratégie 2");
		
		Vente vente = new Vente();
		
		JButton boutonConfirmer = new JButton("Confirmer");

		boutonConfirmer.addActionListener((ActionEvent e) -> {
			// TODO - Appeler la bonne stratégie
			if (getSelectedButtonText(groupeBoutons).equals("Stratégie 1")) {
				//APPLY STRATEGY VENTE FIXE (STRATEGIE PAR DEFAUT)
				vente.applyVente();
			}
			if(getSelectedButtonText(groupeBoutons).equals("Stratégie 2")) {
				//CHANGE STRATEGY TO VENTE PROBA AND APPLY STRATEGY
				vente.setIVenteStrategy(new VenteProba());
				vente.applyVente();
			}
			//System.out.println(getSelectedButtonText(groupeBoutons));
			// Fermer la fenêtre du composant
			SwingUtilities.getWindowAncestor((Component) e.getSource()).dispose();
		});

		JButton boutonAnnuler = new JButton("Annuler");

		boutonAnnuler.addActionListener((ActionEvent e) -> {
			// Fermer la fenêtre du composant
			SwingUtilities.getWindowAncestor((Component) e.getSource()).dispose();
		});

		groupeBoutons.add(strategie1);
		groupeBoutons.add(strategie2);		
		add(strategie1);
		add(strategie2);		
		add(boutonConfirmer);
		add(boutonAnnuler);

	}

	/**
	 * Retourne le bouton sélectionné dans un groupe de boutons.
	 * @param groupeBoutons
	 * @return
	 */
	public String getSelectedButtonText(ButtonGroup groupeBoutons) {
		for (Enumeration<AbstractButton> boutons = groupeBoutons.getElements(); boutons.hasMoreElements();) {
			AbstractButton bouton = boutons.nextElement();
			if (bouton.isSelected()) {
				return bouton.getText();
			}
		}

		return null;
	}

}
