import java.util.Scanner;

public class D_10_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Napraviti program gde cete uneti broj nekih knjiga na lageru, zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru, izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki drugi String, onda samo ispisati stanje knjiga na lageru.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj kniga na lageru");
        int lager = sc.nextInt();
        System.out.println("Skini knjigu sa lagera unosom tacke");
        String unos = sc.next();
        int brojUnosa = 0;
        int novoStanje = lager;
        while(brojUnosa!=lager){
            if (unos.equals(".")) {
                novoStanje--;
                brojUnosa++;
//                System.out.println("Stanje na lageru je " + novoStanje);
//                System.out.println("Broj unosa je " + brojUnosa);
                if(novoStanje==0){
                    System.out.println("Nema vise knjiga na lageru");
                    break;
                }
                System.out.println("Skini knjigu sa lagera unosom tacke");
                unos = sc.next();
            } else {
                System.out.println("Stanje na lageru je " + novoStanje);
                break;
            }
        }
    }
}
