import java.util.Scanner;

public class TreciZadatakProizvod {
    public static void main(String[] args) {
        //Kreirati metod koji računa prizvod dva broja, vraća rezultat u main i udupla i ispisuje

        Proizvod();
    }

    public static double Proizvod() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite prvi činilac:");
        double x= sc.nextDouble();
        System.out.println("Unesite drugi činilac:");
        double y= sc.nextDouble();

        double z=(x*y)*2;
        System.out.println("Proizvod brojeva je:" +z);
        return z;


    }


}
