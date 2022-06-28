import java.util.Scanner;

public class SestiZadatakParanBrojVeciOdNule {
    public static void main(String[] args) {
        //Ispisati parne brojeve vece od 0 od n bunetih brojeva

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj brojeva:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi brojeve:");
            int x = sc.nextInt();
            if (x%2==0&&x>0) {

                System.out.println("Broj " +x+ "je paran i veci od nule" );
            }else{
                System.out.println("Uslov nije zadovoljen:");
            }

            }

            }




            }




