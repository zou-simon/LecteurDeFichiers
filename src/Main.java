
public class Main {

	public static void main(String[] args) {
		// Lecture du fichier texte à l'endroit
		TexteAEndroit l1 = new TexteAEndroit("src/texte.txt");
		l1.lire();
		
		// Lecture du fichier texte à l'envers
		TexteAEnvers l2 = new TexteAEnvers("src/texte.txt");
		l2.lire();
		
		// Lecture du fichier texte de manière palindromique
		Palindromique l3 = new Palindromique("src/texte.txt");
		l3.lire();
		
		// Comparaison des deux fichiers textes
		Comparateur c = new Comparateur("src/texte.txt", "src/texte2.txt");
		c.comparer();
	}

}
