package simulation;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Icon;
import singleton.Singleton;
import usines.UMatiere;

public class MenuFenetre extends JMenuBar {

	private static final long serialVersionUID = 1L;
	private static final String MENU_FICHIER_TITRE = "Fichier";
	private static final String MENU_FICHIER_CHARGER = "Charger";
	private static final String MENU_FICHIER_QUITTER = "Quitter";
	private static final String MENU_SIMULATION_TITRE = "Simulation";
	private static final String MENU_SIMULATION_CHOISIR = "Choisir";
	private static final String MENU_AIDE_TITRE = "Aide";
	private static final String MENU_AIDE_PROPOS = "À propos de...";
	
	private Singleton singleton = Singleton.getInstance();

	public MenuFenetre() {
		ajouterMenuFichier();
		ajouterMenuSimulation();
		ajouterMenuAide();
	}

	/**
	 * Créer le menu de Fichier
	 */
	private void ajouterMenuFichier() {
		JMenu menuFichier = new JMenu(MENU_FICHIER_TITRE);
		JMenuItem menuCharger = new JMenuItem(MENU_FICHIER_CHARGER);
		JMenuItem menuQuitter = new JMenuItem(MENU_FICHIER_QUITTER);
	

		menuCharger.addActionListener((ActionEvent e) -> {
			JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			fileChooser.setDialogTitle("Sélectionnez un fichier de configuration");
			fileChooser.setAcceptAllFileFilterUsed(false);
			// Créer un filtre
			FileNameExtensionFilter filtre = new FileNameExtensionFilter(".xml", "xml");
			fileChooser.addChoosableFileFilter(filtre);

			int returnValue = fileChooser.showOpenDialog(null);

			if (returnValue == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				//Instancier la Factory qui permet d'accéder à un parser (appelé DocumentBuilder)
			    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				try {				
				//Récupérer le parser
		        DocumentBuilder db = dbf.newDocumentBuilder();
				//Parser le fichier XML
		        Document doc = db.parse(selectedFile);
		        doc.getDocumentElement().normalize();
		        
		      //accès à la racine du document
		        doc.getDocumentElement();
		        //Récupération d'un ensemble d'éléments ayant le même nom
		        NodeList list = doc.getElementsByTagName("usine");
		        
		        for(int x=0; x<list.getLength(); x++)
		        {
		            Node nd = list.item(x);
		            Element element = (Element) nd;
		            if (nd.getNodeType() == Node.ELEMENT_NODE) {
		                NodeList nList = element.getElementsByTagName("usine");
		                for(int i=0; i<nList.getLength(); i++)
		                {
		                    Node node = nList.item(i);
		                    if (node.getNodeType() == Node.ELEMENT_NODE) {

		                        Element elment = (Element) node;
		                        // recuperer les types d'usine
		                        String type = elment.getAttribute("type");
		                        
		                        if (type.equals("usine-matiere")) {
		                        	singleton.setuMatiere1(new UMatiere());
		                            NodeList listIcon = elment.getElementsByTagName("icone");
		                            for(int j=0; j<listIcon.getLength(); j++)
		                            {
		                                Node n = listIcon.item(j);
		                                if (n.getNodeType() == Node.ELEMENT_NODE) {
		                                    Element el = (Element) n;
		                                    String t =  el.getAttribute("type");
		                                    //System.out.println("Type "+ t);
		                                    String path = el.getAttribute("path");
		                                    //System.out.println("Path "+ path);
		                                    ImageIcon ic = new ImageIcon(path);
		                                    singleton.getuMatiere1().setCic(new Icon("vide", ic));
		                                    if (t.equals("vide")) {
		                                    	singleton.getuMatiere1().getIcons().add(new Icon("vide", ic));
		                                    }
		                                    if (t.equals("un-tiers")) {
		                                        ImageIcon i1 = new ImageIcon(path);
		                                        singleton.getuMatiere1().getIcons().add(new Icon("un-tiers", i1));
		                                    }
		                                    if (t.equals("deux-tiers")) {
		                                        ImageIcon i2 = new ImageIcon(path);
		                                        singleton.getuMatiere1().getIcons().add(new Icon("deux-tiers", i2));
		                                    }
		                                    if (t.equals("plein")) {
		                                        ImageIcon i3 = new ImageIcon(path);
		                                        singleton.getuMatiere1().getIcons().add(new Icon("plein", i3));
		                                    }
		                                }
		                            }
		                        }
		                    }
		                }
		            }
		        }
			        
				} catch (ParserConfigurationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
				//System.out.println(selectedFile.getAbsolutePath());
			}
		});
		
		menuQuitter.addActionListener((ActionEvent e) -> {
			System.exit(0);
		});

		menuFichier.add(menuCharger);
		menuFichier.add(menuQuitter);

		add(menuFichier);

	}

	/**
	 * Créer le menu de Simulation
	 */
	private void ajouterMenuSimulation() {
		JMenu menuSimulation = new JMenu(MENU_SIMULATION_TITRE);
		JMenuItem menuChoisir = new JMenuItem(MENU_SIMULATION_CHOISIR);
		menuSimulation.add(menuChoisir);

		menuChoisir.addActionListener((ActionEvent e) -> {
			// Ouvrir la fenêtre de sélection
			// TODO - Récupérer la bonne stratégie de vente
			new FenetreStrategie();
		});
		add(menuSimulation);

	}

	/**
	 * Créer le menu Aide
	 */
	private void ajouterMenuAide() {
		JMenu menuAide = new JMenu(MENU_AIDE_TITRE);
		JMenuItem menuPropos = new JMenuItem(MENU_AIDE_PROPOS);
		menuAide.add(menuPropos);

		menuPropos.addActionListener((ActionEvent e) -> {
			JOptionPane.showMessageDialog(null,
					"<html><p>Application simulant une chaine de production d'avions.</p>" + "<br>"
							+ "<p>&copy; &nbsp; 2017 &nbsp; Ghizlane El Boussaidi</p>"
							+ "<p>&copy; &nbsp; 2017 &nbsp; Dany Boisvert</p>"
							+ "<p>&copy; &nbsp; 2017 &nbsp; Vincent Mattard</p>" + "<br>"
							+ "<p>&Eacute;cole de technologie sup&eacute;rieure</p></html>");
		});
		add(menuAide);
	}

}
