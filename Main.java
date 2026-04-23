import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Etudiant> etudiants =GestionDesEtudiants.lireCSV("C:\\Users\\User\\Downloads\\lesnotes.csv");

        GestionDesEtudiants.trierParMoyenne(etudiants);

        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        GestionDesEtudiants.sauvegarder("resultats.txt", etudiants);

        System.out.println("Résultats sauvegardés !");
        System.out.println("Merci");
    }
}
