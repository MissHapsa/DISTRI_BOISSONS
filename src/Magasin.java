import java.util.HashMap;
import java.util.Map;

public class Magasin {
    private Map<Produit, Emplacement> inventaire;

    public Magasin() {
        inventaire = new HashMap<>();
        initialiserInventaire();
    }

    private void initialiserInventaire() {
        Produit p1 = new Produit("Maxbien", 5.99, 3);
        Produit p2 = new Produit("Whatelse", 6.49, 3);
        Produit p3 = new Produit("Choco Nesness", 3.99, 3);
        Produit p4 = new Produit("Lait Nesness", 4.49, 3);
        Produit p5 = new Produit("Noir Lavatzo", 2.49, 3);
        Produit p6 = new Produit("Lait Lavatzo", 2.99, 3);

        inventaire.put(p1, new Emplacement(1, "A", "A1"));
        inventaire.put(p2, new Emplacement(1, "B", "B1"));
        inventaire.put(p3, new Emplacement(2, "A", "A2"));
        inventaire.put(p4, new Emplacement(2, "B", "B2"));
        inventaire.put(p5, new Emplacement(3, "A", "A3"));
        inventaire.put(p6, new Emplacement(3, "B", "B3"));
    }

    public Produit rechercherProduitParNom(String nomProduit) {
        for (Produit produit : inventaire.keySet()) {
            if (produit.getNom().equals(nomProduit)) {
                return produit;
            }
        }
        return null;
    }

    public Emplacement getEmplacement(Produit produitRecherche) {
        return inventaire.get(produitRecherche);
    }

    public Produit rechercherProduitParEmplacement(Emplacement emplacementRecherche) {
        for (Map.Entry<Produit, Emplacement> entry : inventaire.entrySet()) {
            Produit produit = entry.getKey();
            Emplacement emplacement = entry.getValue();

            if (emplacementRecherche.getColonne() == emplacement.getColonne() &&
                    emplacementRecherche.getRangee().equals(emplacement.getRangee())) {
                return produit;
            }
        }
        return null;
    }

    public void rechercherProduitParPlace(String place) {
        boolean found = false;
        for (Map.Entry<Produit, Emplacement> entry : inventaire.entrySet()) {
            Produit produit = entry.getKey();
            Emplacement emplacement = entry.getValue();
            if (place.equals(emplacement.getPlace())) {
                System.out.println("Produit trouvé : " + produit.getNom());
                System.out.println("Prix : " + produit.getPrix() + " euros");
                System.out.println("Emplacement : " + emplacement.getColonne() + emplacement.getRangee());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun produit n'est enregistré à l'emplacement " + place);
        }
    }
}

