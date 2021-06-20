/**
 * 
 */
package simpleTest;

/**
 * @author diafara
 * Fabrique.java
 * 17 juin 2021
 * 16:48:17
 */
public abstract class Fabrique {
	
	public void initialize() {
		System.out.println("Initialize");
		creeJoueur();
		creeDe();
	}
	
	public Element createElement(String param) {
		if(param.equalsIgnoreCase("De")){
	         return new De();
	         
	      } else if(param.equalsIgnoreCase("Joueur")){
	         return new Joueur();
	         
	      } else if(param.equalsIgnoreCase("Jeu")){
	         return new Jeu();
	      }
	      
	      return null;
	}
	
	public abstract void creeDe();
	public abstract void creeJoueur();

}
