import java.util.Scanner;

public class PetiZadatakKvadr {
    public static void main(String[] args) {
        IzracunajKva();

    }

    //Napisati program koji za uneti broj sa tastature računa njegov kvadrat.

    public static int IzracunajKva(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesi broj:");
        int x= sc.nextInt();
        int c=x*x ;
        System.out.println("Kvadrat broja je:" +c);
        return c;




    }




}
