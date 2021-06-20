package simulation;

import java.awt.Graphics;
import javax.swing.JPanel;
import composants.Aile;
import composants.Moteur;
import singleton.Singleton;

public class PanneauPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	
	Singleton singleton = Singleton.getInstance();
	
			
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// On ajoute à la position le delta x et y de la vitesse
		//position.translate(vitesse.x, vitesse.y);
		//g.fillRect(position.x,position.y, taille, taille);
		
		
        //Dessin des chemins
		g.drawLine((int)singleton.getuMatiere1().getX()+15, (int)singleton.getuMatiere1().getY()+15, (int)singleton.getuAile().getX()+15,(int)singleton.getuAile().getY()+15);
		g.drawLine((int)singleton.getuAile().getX()+15, (int)singleton.getuAile().getY()+15, (int)singleton.getuAssemblage().getX()+15,(int)singleton.getuAssemblage().getY()+15);
		g.drawLine((int)singleton.getuAssemblage().getX()+15, (int)singleton.getuAssemblage().getY()+15, (int)singleton.getEntrepot().getX()+15,(int)singleton.getEntrepot().getY()+15);
		g.drawLine((int)singleton.getuMatiere2().getX()+15, (int)singleton.getuMatiere2().getY()+15, (int)singleton.getuMoteur().getX()+15,(int)singleton.getuMoteur().getY()+15);
		g.drawLine((int)singleton.getuAssemblage().getX()+15, (int)singleton.getuAssemblage().getY()+15, (int)singleton.getuMatiere3().getX()+15,(int)singleton.getuMatiere3().getY()+15);
        	
		//Production
		singleton.getuMatiere1().produire();
		singleton.getuMatiere2().produire();
		singleton.getuMatiere3().produire();
		singleton.getuAile().produire();
		singleton.getuMoteur().produire();
		singleton.getuAssemblage().produire();
		
		//Deplacement des Composants
		for(int i = 0; i < singleton.getuMatiere1().getListComposantSortie().size(); i++)
		{
			singleton.getuMatiere1().getListComposantSortie().get(i).translate(3, 0);
			singleton.getuMatiere1().getListComposantSortie().get(i).getIcon().paintIcon(this, g, (int)singleton.getuMatiere1().getListComposantSortie().get(i).getX(), (int)singleton.getuMatiere1().getListComposantSortie().get(i).getY());
		}
		for(int i = 0; i < singleton.getuMatiere2().getListComposantSortie().size(); i++)
		{
			singleton.getuMatiere2().getListComposantSortie().get(i).translate(4, 0);
			singleton.getuMatiere2().getListComposantSortie().get(i).getIcon().paintIcon(this, g, (int)singleton.getuMatiere2().getListComposantSortie().get(i).getX(), (int)singleton.getuMatiere2().getListComposantSortie().get(i).getY());
		}
		for(int i = 0; i < singleton.getuMatiere3().getListComposantSortie().size(); i++)
		{
			singleton.getuMatiere3().getListComposantSortie().get(i).translate(-4, -4);
			singleton.getuMatiere3().getListComposantSortie().get(i).getIcon().paintIcon(this, g, (int)singleton.getuMatiere3().getListComposantSortie().get(i).getX(), (int)singleton.getuMatiere3().getListComposantSortie().get(i).getY());
		}
		for(int i = 0; i < singleton.getuAile().getListComposantSortie().size(); i++)
		{
			singleton.getuAile().getListComposantSortie().get(i).translate(-1, 1);
			singleton.getuAile().getListComposantSortie().get(i).getIcon().paintIcon(this, g, (int)singleton.getuAile().getListComposantSortie().get(i).getX(), (int)singleton.getuAile().getListComposantSortie().get(i).getY());
		}
		for(int i = 0; i < singleton.getuMoteur().getListComposantSortie().size(); i++)
		{
			singleton.getuMoteur().getListComposantSortie().get(i).translate(-4, -4);
			singleton.getuMoteur().getListComposantSortie().get(i).getIcon().paintIcon(this, g, (int)singleton.getuMoteur().getListComposantSortie().get(i).getX(), (int)singleton.getuMoteur().getListComposantSortie().get(i).getY());
		}
		for(int i = 0; i < singleton.getuAssemblage().getListComposantSortie().size(); i++)
		{
			singleton.getuAssemblage().getListComposantSortie().get(i).translate(3, 0);
			singleton.getuAssemblage().getListComposantSortie().get(i).getIcon().paintIcon(this, g, (int)singleton.getuAssemblage().getListComposantSortie().get(i).getX(), (int)singleton.getuAssemblage().getListComposantSortie().get(i).getY());
		}
		
		
		//Faire disparaitre le composant du réseau
		for(int i = 0; i < singleton.getuMatiere1().getListComposantSortie().size(); i++)
		{
			if(singleton.getuMatiere1().getListComposantSortie().get(i).getX() == singleton.getuAile().getX()) {
				//Ajouter composant à l'usine de reception
				singleton.getuAile().getListComposantEntree().add(singleton.getuMatiere1().getListComposantSortie().get(i));
				//Faire disparaitre le composant du réseau
				singleton.getuMatiere1().getListComposantSortie().remove(i);
			}
		}
		for(int i = 0; i < singleton.getuMatiere2().getListComposantSortie().size(); i++)
		{
			if(singleton.getuMatiere2().getListComposantSortie().get(i).getX() == singleton.getuMoteur().getX()) {
				//Ajouter composant à l'usine de reception
				singleton.getuMoteur().getListComposantEntree().add(singleton.getuMatiere2().getListComposantSortie().get(i));
				//Faire disparaitre le composant du réseau
				singleton.getuMatiere2().getListComposantSortie().remove(i);
			}
		}
		for(int i = 0; i < singleton.getuMatiere3().getListComposantSortie().size(); i++)
		{
			if(singleton.getuMatiere3().getListComposantSortie().get(i).getY() == singleton.getuMoteur().getY()) {
				//Ajouter composant à l'usine de reception
				singleton.getuMoteur().getListComposantEntree().add(singleton.getuMatiere3().getListComposantSortie().get(i));
				//Faire disparaitre le composant du réseau
				singleton.getuMatiere3().getListComposantSortie().remove(i);
			}
		}
		for(int i = 0; i < singleton.getuAile().getListComposantSortie().size(); i++)
		{
			if(singleton.getuAile().getListComposantSortie().get(i).getY() == singleton.getuAssemblage().getY()) {
				//Ajouter composant à l'usine de reception
				singleton.getuAssemblage().getListAileEntree().add((Aile)singleton.getuAile().getListComposantSortie().get(i));
				//Faire disparaitre le composant du réseau
				singleton.getuAile().getListComposantSortie().remove(i);
			}
		}
		for(int i = 0; i < singleton.getuMoteur().getListComposantSortie().size(); i++)
		{
			if(singleton.getuMoteur().getListComposantSortie().get(i).getY() == singleton.getuAssemblage().getY()) {
				//Ajouter composant à l'usine de reception
				singleton.getuAssemblage().getListMoteurEntree().add((Moteur)singleton.getuMoteur().getListComposantSortie().get(i));
				//Faire disparaitre le composant du réseau
				singleton.getuMoteur().getListComposantSortie().remove(i);
			}
		}
		for(int i = 0; i < singleton.getuAssemblage().getListComposantSortie().size(); i++)
		{
			if(singleton.getuAssemblage().getListComposantSortie().get(i).getX() == singleton.getEntrepot().getX()) {
				//Ajouter composant à l'usine de reception
				singleton.getEntrepot().getListComposantEntree().add(singleton.getuAssemblage().getListComposantSortie().get(i));
				singleton.getEntrepot().setQte(singleton.getEntrepot().getListComposantEntree().size());
				//Faire disparaitre le composant du réseau
				singleton.getuAssemblage().getListComposantSortie().remove(i);
			}
		}
		
		if (singleton.getEntrepot().getQte() == singleton.getEntrepot().getCapacite()) {
			singleton.getEntrepot().getObservateur().notifyObservers();				
		}				
		
		singleton.getuMatiere1().getCic().getIcon().paintIcon(this, g, (int)singleton.getuMatiere1().getX(), (int)singleton.getuMatiere1().getY());
		singleton.getuAile().getCic().getIcon().paintIcon(this, g, (int)singleton.getuAile().getX(), (int)singleton.getuAile().getY());
		singleton.getuAssemblage().getCic().getIcon().paintIcon(this, g, (int)singleton.getuAssemblage().getX(), (int)singleton.getuAssemblage().getY());
		singleton.getEntrepot().getCic().getIcon().paintIcon(this, g, (int)singleton.getEntrepot().getX(), (int)singleton.getEntrepot().getY());
		singleton.getuMatiere2().getCic().getIcon().paintIcon(this, g, (int)singleton.getuMatiere2().getX(), (int)singleton.getuMatiere2().getY());
		singleton.getuMoteur().getCic().getIcon().paintIcon(this, g, (int)singleton.getuMoteur().getX(), (int)singleton.getuMoteur().getY());        
		singleton.getuMatiere3().getCic().getIcon().paintIcon(this, g, (int)singleton.getuMatiere3().getX(), (int)singleton.getuMatiere3().getY());
       
	}

}