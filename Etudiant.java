public class Etudiant {
    private String nom;
    private double[] notes;
    private double moyenne;
 
    public Etudiant(String nom, double[] notes) {
        this.nom = nom;
        this.notes = notes;
        calculerMoyenne();
    }

    public void calculerMoyenne() {
        double somme = 0;
     
        for (double note : notes) {
            somme += note;
        }

        this.moyenne = somme / notes.length;
    }

        public double getMoyenne() {
        return moyenne;
    }

    public String getNom() {
        return nom;
    }

   
    @Override
    public String toString() {
        return nom + " - Moyenne: " + moyenne;
    }
}
