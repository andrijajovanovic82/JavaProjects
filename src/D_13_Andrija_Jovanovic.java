public class D_13_Andrija_Jovanovic {
    public static void main(String[] args) {
        //2. Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.
        int niz[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 != 0) {
                niz[i] = niz[i] + 2;
                System.out.println((niz[i] - 2) + ". clan niza je sada " + niz[i]);
            }
        }
    }
}
