import java.util.Scanner;

public class DrugiZadatakZbirPrekoFunkcije {
    public static void main(String[] args) {

Zbir();
Zbir();
Zbir();
    }
    //Funkcija koja sabira dva broja

    public static double Zbir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi broj:");
        double x = sc.nextDouble();
        System.out.println("Unesi drugi broj:");
        double y = sc.nextDouble();

        double c = x + y;
        System.out.println("Zbir brojeva je" + c);
        return c;

    }


}
