import java.util.Arrays;
import java.util.Scanner;

public class D_14_Andrija_Jovanovic {
    public static void main(String[] args) {
        //3. Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj, i u novom nizu smestiti sve brojeve koji su veci od tog unetog broja (Obratiti paznju da nov niz nema prazna polja tj 0).
        Scanner sc = new Scanner(System.in);
        int[] niz1 = {7, 21, 3, 8, 1, 66, 17, 118, 9, 13};
        System.out.println("Unesi neki broj");
        int x = sc.nextInt();
        int brojVecih = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (x < niz1[i]) {
                brojVecih++;
            }
        }
        //System.out.println(brojVecih);
        int[] niz2 = new int[brojVecih];
        int y = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (x < niz1[i]) {
                niz2[y] = niz1[i];
                y++;
            }
        }
        System.out.println("Novi niz je " + Arrays.toString(niz2));
    }
}
