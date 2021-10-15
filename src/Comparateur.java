import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Comparateur {
	
	private File fichier;
	private File fichier2;

	public Comparateur(String chemin, String chemin2) {
		this.fichier = new File(chemin);
		this.fichier2 = new File(chemin2);
	}
	
	/*
	 * Comparaison ligne par ligne de deux fichiers textes
	 */
	public void comparer() {
		if (this.fichier.getPath().endsWith(".txt") && this.fichier2.getPath().endsWith(".txt")) { // Vérification du type de fichier
			BufferedReader bufferedReader = null, bufferedReader2 = null;
			String ligne, ligne2;
			boolean identique = true;
			int nbLignes = 1;
			
			try {
				bufferedReader = new BufferedReader(new FileReader(this.fichier)); // Ouverture et lecture du premier fichier
				bufferedReader2 = new BufferedReader(new FileReader(this.fichier2)); // Ouverture et lecture du deuxième fichier
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println("Comparaison entre " + fichier.getPath() + " et " + fichier2.getPath()); // Message visuel
			
			try {
				while ((ligne = bufferedReader.readLine()) != null) {
					if (!ligne.equals(ligne2 = bufferedReader2.readLine())) { // Comparaison des lignes entre les deux fichiers
						System.out.println("-----");
						System.out.println("Ligne n°" + nbLignes);
						System.out.println(fichier.getPath() + " : " + ligne);
						System.out.println(fichier2.getPath() + " : " + ligne2);
						System.out.println("-----");
						identique = false; // Fichiers différents
					}
					nbLignes++; // Comptage des lignes
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (identique) System.out.println("Les fichiers sont identiques !"); // Fichiers identiques
		} else {
			System.out.println("Un fichier ou les deux ne sont pas des fichiers textes.");
		}
	}
	
}
