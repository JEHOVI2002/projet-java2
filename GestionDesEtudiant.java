import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class GestionDesEtudiants {

    public static List<Etudiant> lireCSV(String nomFichier) {
        List<Etudiant> liste = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            br.readLine(); // ignorer l'en-tête

            while ((ligne = br.readLine()) != null) {
                String[] parts = ligne.split(",");
                String nom = parts[0];

                double[] notes = new double[parts.length - 1];
                for (int i = 1; i < parts.length; i++) {
                    notes[i - 1] = Double.parseDouble(parts[i]);
                }

                liste.add(new Etudiant(nom, notes));
            }

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        return liste;
    }

    public static void trierParMoyenne(List<Etudiant> liste) {
        liste.sort((e1, e2) -> Double.compare(e2.getMoyenne(), e1.getMoyenne()));
    }

    public static void sauvegarder(String fichier, List<Etudiant> liste) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichier))) {
            for (Etudiant e : liste) {
                bw.write(e.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Erreur écriture: " + e.getMessage());
        }
    }
}
