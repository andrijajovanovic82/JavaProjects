import java.util.Scanner;

public class D_5_Andrija_Jovanovic {
    public static void main (String[] args){
        //Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
        //36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.
        Scanner sc = new Scanner (System.in);
        System.out.println("Unesi velicinu majice u cm");
        int velicina = sc.nextInt();
        switch(velicina) {
            case 24:
                System.out.println("S");
                break;
            case 30:
                System.out.println("M");
                break;
            case 36:
                System.out.println("L");
                break;
            case 42:
                System.out.println("XL");
                break;
            default:
                System.out.println("Nepostojeca velicina");
        }
    }
}
