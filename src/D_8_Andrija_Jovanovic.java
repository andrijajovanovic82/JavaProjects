import java.util.Scanner;

public class D_8_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int suma = 0;
        for (int godina = sc.nextInt(); godina < 2022; godina++) {
            if (godina%4==0 && godina%100!=0 || godina%400==0) {
                suma++;}
            }
            System.out.println("Broj prestupnih godina je " + suma);
    }
}

