package TablicaJednowymiarowa;

public class TablicaJednowymiarowa {

    public static void main(String[] args) {

        int[] tablica = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(tablica[6]);

        int x = tablica[5];

        System.out.println("wartość x równa się: " + x );

        tablica[0] = 10;

        System.out.println(tablica[0]);
    }
}

