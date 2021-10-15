import java.io.BufferedReader;
import java.io.IOException;

public class TexteAEndroit extends LecteurTexte {
	
	public TexteAEndroit(String chemin) {
		super(chemin);
	}

	/*
	 * Lecture du fichier texte
	 */
	public void lire() {
		this.ouvrir(); // Ouverture du fichier
		
		BufferedReader bufferedReader = new BufferedReader(this.fileReader);
		String ligne = null;
		
		try {
			while ((ligne = bufferedReader.readLine()) != null) {
				System.out.println(ligne); // Affichage des lignes du fichier
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.fermer(); // Fermeture du fichier
	}

}

