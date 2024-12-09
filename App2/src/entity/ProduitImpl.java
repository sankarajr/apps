package entity;

import java.util.Scanner;

public class ProduitImpl implements IProduit {
    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fall diokh ma référence produit bi : ");
        String ref = scanner.nextLine();

        System.out.print("Fall diokh libellé produit bi : ");
        String libelle = scanner.nextLine();

        System.out.print("Fall diokh ma quantité produit bi: ");
        double quantite = scanner.nextDouble();

        System.out.print("Fall prix unitaire bi gnata leuh ? : ");
        int prix = scanner.nextInt();

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println("\n--- YARAM bagages ya ngi ni ---");
        System.out.println("Référence bi : " + produit.getRef());
        System.out.println("Libellé bi : " + produit.getLibelle());
        System.out.println("Quantité bi: " + produit.getQuantite() + " unités");
        System.out.println("Prix unitaire bi: " + produit.getPrix() + " FCFA");
        System.out.println("---------------Diadieuf---------------");
    }
}
