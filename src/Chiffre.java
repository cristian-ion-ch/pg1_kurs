import java.util.Scanner;
public class Chiffre {
    static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        char a;
        System.out.println("Geben Sie das zu verschlüsselndes Zeichen ein:");
        String a1;
        a1 = eingabe.next();
        a = a1.charAt(0);
        int schluessel;
        System.out.println("Geben Sie den Schluessel ein:");
        schluessel = eingabe.nextInt();
        // A - 65 /  Schluessel 65 -4 -- 61
        int b_ascii = (int) a;
        int b_ascii_code;
        b_ascii_code = b_ascii - schluessel;
        char code;
        code = (char) b_ascii_code;
        System.out.println("Code: " + code);
    }
}
