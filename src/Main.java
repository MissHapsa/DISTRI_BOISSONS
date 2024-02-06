public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        String placeEmplacement = Data.demanderEmplacement();
        magasin.rechercherProduitParPlace(placeEmplacement);
    }
}

