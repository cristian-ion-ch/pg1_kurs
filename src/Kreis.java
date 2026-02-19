import java.util.Scanner;
/* Test Kommentar

 */
// Test

public class Kreis {
    static void main(String[] args) {
        int x;
        Scanner eingabe = new Scanner(System.in);
        x = eingabe.nextInt();
        final double pi;
        pi = 3.14159265359;
        double flaeche;
        flaeche = x * pi;
        flaeche = Math.round(flaeche*100)/100.0;
        System.out.println("Fläche" + flaeche);
    }
}
