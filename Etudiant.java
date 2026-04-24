// Creation class Etudiant
public class Etudiant {
    private String nom;
    private double[] notes;
    private double moyenne;

// Constructeur : Pour l'initialisation du nom et les notes 
// Calcul de la moyenne    
    public Etudiant(String nom, double[] notes) {
        this.nom = nom;
        this.notes = notes;
        calculerMoyenne();
    }
// Méthode de calcul de moyenne
    public void calculerMoyenne() {
        double somme = 0;
// Parcourt de notes et calculer de somme        
        for (double note : notes) {
            somme += note;
        }
// Calcul de la moyenne        
        this.moyenne = somme / notes.length;
    }
// Retourne la moyenne de l'étudiant
    public double getMoyenne() {
        return moyenne;
    }
// Retourne le nom de l'étudiant
    public String getNom() {
        return nom;
    }
// Redéfinition de la méthode toString pour afficher l'etudiant
    @Override
    public String toString() {
        return nom + " - Moyenne: " + moyenne;
    }
}
