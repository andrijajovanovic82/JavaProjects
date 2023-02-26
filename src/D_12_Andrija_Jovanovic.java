import java.util.Scanner;

public class D_12_Andrija_Jovanovic {
    public static void main(String[] args) {
        //1. Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu, na kraju treba ispisati najveci broj od onih koje smo uneli.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi velicinu niza");
        int x = sc.nextInt();
        int niz[] = new int [x];
        int y =0;
        for (int i =0; i<x; i++) {
            System.out.println("Unesi " + (i + 1) + ". clan niza");
            niz[i] = sc.nextInt();
            if (niz[i] > y) {
                y = niz[i];
            }
        }
        System.out.println("Najveci clan niza je " + y);
    }
}
