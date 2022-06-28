public class CetvrtiZadatakMinimumOdDvaBroja {
    public static void main(String[] args) {
        //Napisati metod za nalaženje minimuma od dva broja

        System.out.println("Minimum dva broja" + NaciMin1(10, 0));
    }

    public static int NaciMin1(int a1, int a2) {

        int min;

        if (a1 < a2) {
            min = a1;

        } else min = a2;
        return min;

    }


    }





