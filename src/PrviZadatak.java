import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {

        //Izracunaj zbir dva broja preko sken.

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesi prvi broj:");
        int x= sc.nextInt();

        System.out.println("Unesi drugi broj:");
        int y=sc.nextInt();

        int c=x+y;
        System.out.println("Zbir brojeva je:" +c);




    }
}
