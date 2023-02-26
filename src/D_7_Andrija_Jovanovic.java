import java.util.Scanner;

public class D_7_Andrija_Jovanovic {
    public static void main(String[] args) {
        // Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int n = sc.nextInt();
        if(n>0) {
            int faktorijel = 1;
            for (int i = 1; i <= n; i++) {
                faktorijel = faktorijel * i;
            }
            System.out.println("Faktorijel unetog broja je " + faktorijel);
        }
        else {
            System.out.println("Greska, uneli ste negativan broj");
        }
    }
}
