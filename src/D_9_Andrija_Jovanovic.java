import java.util.Scanner;

public class D_9_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti neki broj i kao rezultat vratiti zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)

        //---------------------------
        // FOR varijanta

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Unesite broj");
//        int broj = sc.nextInt();
//        int zbir = 0;
//        if (broj<0){
//            System.out.println("Uneli ste negativan broj");
//        }
//        else{
//            for (int i = 0; i<broj; i++) {
//                zbir = zbir + i;
//            }
//            System.out.println("Zbir svih prethodnih brojeva je " + zbir);
//        }

        //-------------------------------
        // WHILE varijanta
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = sc.nextInt();
        int zbir = 0;
        int i = 0;
        if (broj<0){
            System.out.println("Uneli ste negativan broj");
        }
        else{
            while (i<broj) {
                zbir = zbir + i;
                i++;
            }
            System.out.println("Zbir svih prethodnih brojeva je " + zbir);
        }
    }
}
