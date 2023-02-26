import java.util.Scanner;

public class D_11_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din, kruske 100 din i banane 140 din, tako da se suma
        //racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo), toliko dodajemo na sumu, kada se unese ".",
        //program izlazi iz petlje i pise ukupnu cenu navedenog voca.
        Scanner sc = new Scanner(System.in);
        System.out.println("Stavi voce u korpu");
        String voce = sc.next().trim().toLowerCase();
        int suma = 0;
        if (!voce.equals(".")) {
            while (!voce.equals(".")) {
                switch (voce) {
                    case "jabuka":
                        suma = suma + 50;
                        //System.out.println("Ukupna suma je " + suma);
                        System.out.println("Stavi voce u korpu");
                        voce = sc.next();
                        break;
                    case "kruska":
                        suma = suma + 100;
                        //System.out.println("Ukupna suma je " + suma);
                        System.out.println("Stavi voce u korpu");
                        voce = sc.next();
                        break;
                    case "banana":
                        suma = suma + 140;
                       // System.out.println("Ukupna suma je " + suma);
                        System.out.println("Stavi voce u korpu");
                        voce = sc.next();
                        break;
                    default:
                        System.out.println("Pogresan unos");
                        System.out.println("Stavi voce u korpu");
                        voce = sc.next();
                        break;
                }
                if (voce.equals(".")) {
                    System.out.println("Kraj unosa");
                    System.out.println("Ukupna suma je " + suma);
                    break;
                }
            }
        }
        else{
            System.out.println("Kraj unosa");
            System.out.println("Ukupna suma je " + suma);
        }
    }
}
