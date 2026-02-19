import java.util.Scanner;
public class Doppeln {
    static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double zahl;
        System.out.println("Geben Sie eine Zahl ein:");
        zahl = eingabe.nextDouble();

        zahl = zahl * 2;
        System.out.println(zahl);
    }
}
