import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class LecteurTexte implements LecteurFichier {
	
	private String chemin;
	protected FileReader fileReader;
	
	public LecteurTexte(String chemin) {
		this.chemin = chemin;
	}

	/*
	 * Ouverture du fichier texte
	 */
	public void ouvrir() {
		if (this.chemin.endsWith(".txt")) { // Vérification du type de fichier
			File fichier = new File(this.chemin);
			try {
				this.fileReader = new FileReader(fichier);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * Fermeture du fichier texte
	 */
	public void fermer() {
		try {
			this.fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
