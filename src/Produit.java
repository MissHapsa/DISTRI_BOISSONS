public class Produit {
    private String nom;
    private double prix;
    private int stock;

    public Produit(String nom, double prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
