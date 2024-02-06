import java.util.Scanner;

public class Data {

    public static String demanderEmplacement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer la place de l'emplacement : ");
        return scanner.nextLine();
    }
    // PROCEDER AU PAIEMMENT
    public static String demanderPaiement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre paiement : ");
        return scanner.nextLine();

    }
}
