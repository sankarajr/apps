

import entity.IPersonne;
import entity.Personne;
import entity.Etudiant;
import entity.Employe;

public class Main {
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("Niang", "Balla", 19.5);

        Employe employe = new Employe("Ngom", "Cheikh", "Géomaticien", 1000000);


        System.out.println("=== Test de l'interface IPersonne ===");
        etudiant.affiche();
        employe.affiche();


        System.out.println("\n=== Polymorphisme avec IPersonne ===");
        IPersonne personne1 = etudiant;
        IPersonne personne2 = employe;

        personne1.affiche();
        personne2.affiche();


        System.out.println("\n=== Vérification des attributs spécifiques ===");
        System.out.println("Matricule de l'étudiant : " + etudiant.getMatricule());
        System.out.println("Salaire de l'employé : " + employe.getSalaire());
    }
}
