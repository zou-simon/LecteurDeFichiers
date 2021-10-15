import java.io.BufferedReader;
import java.io.IOException;

public class Palindromique extends LecteurTexte {

	public Palindromique(String chemin) {
		super(chemin);
	}
	
	/*
	 * Lecture du fichier texte de manière palindromique
	 */
	public void lire() {
		this.ouvrir(); // Ouverture du fichier
		
		BufferedReader bufferedReader = new BufferedReader(this.fileReader);
		String ligne = null;
        
        try {
			while ((ligne = bufferedReader.readLine()) != null) {			
				System.out.println(new StringBuilder(ligne).reverse()); // Affichage des lignes du fichier à l'envers
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		this.fermer(); // Fermeture du fichier
	}

}
