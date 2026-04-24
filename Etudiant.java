// Creation class Etudiant
public class Etudiant {
    private String nom;
    private double[] notes;
    private double moyenne;

// Constructeur: initialise le nom et les notes
// Calcul de ma moyenne    
    public Etudiant(String nom, double[] notes) {
        this.nom = nom;
        this.notes = notes;
        calculerMoyenne();
    }

// Methode pour Calcluc de la moyenne    
    public void calculerMoyenne() {
        double somme = 0;
// Parcourt de notes et calcul de la somme        
        for (double note : notes) {
            somme += note;
        }
// Calcul de moyenne
        this.moyenne = somme / notes.length;
    }

// Retourner la moyenne d'étudiant    
        public double getMoyenne() {
        return moyenne;
    }

    public String getNom() {
        return nom;
    }

// Redéfinition de la méthode toString pour afficher l'étudiant    
    @Override
    public String toString() {
        return nom + " - Moyenne: " + moyenne;
    }
}
