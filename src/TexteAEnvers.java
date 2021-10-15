import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class TexteAEnvers extends LecteurTexte {
	
	public TexteAEnvers(String chemin) {
		super(chemin);
	}

	/*
	 * Lecture du fichier texte à l'envers
	 */
	public void lire() {
		this.ouvrir(); // Ouverture du fichier
		
		ArrayList<String> texte = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(this.fileReader);
		String ligne = null;
		
		try {
			while ((ligne = bufferedReader.readLine()) != null) {
				texte.add(ligne); // Insertion des lignes du fichier pour le retourner
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Collections.reverse(texte); // Inversion du tableau (fichier texte)
		for (String texteLigne : texte) {
			System.out.println(texteLigne); // Affichage des lignes du fichier
		}
		
		this.fermer(); // Fermeture du fichier
	}

}
