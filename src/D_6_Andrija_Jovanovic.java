import java.util.Scanner;

public class D_6_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi) nakon toga, uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
        //starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru, takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        //ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi zanr knjige");
        String zanr = sc.next().toLowerCase();
        if (zanr.equals("romantika") || zanr.equals("triler") || zanr.equals("horor") || zanr.equals("krimi")) {
            System.out.println("Unesi godinu izdanja");
            int godina = sc.nextInt();
            int starostIzdanja = 2022 - godina;
            if (godina > 1900 && godina <= 2022) {
                switch (zanr) {
                    case "romantika", "triler":
                        if (starostIzdanja > 30) {
                            System.out.println("Zanr knjige vise nije na lageru");
                        } else {
                            System.out.println("Zanr knjige je na lageru");
                        }
                        break;
                    case "horor":
                        if (starostIzdanja > 40) {
                            System.out.println("Zanr knjige vise nije na lageru");
                        } else {
                            System.out.println("Zanr knjige je na lageru");
                        }
                        break;
                    case "krimi":
                        if (starostIzdanja > 20) {
                            System.out.println("Zanr knjige vise nije na lageru");
                        } else {
                            System.out.println("Zanr knjige je na lageru");
                        }
                        break;
                }
            }
            else {System.out.println("Neispravan unos");}

            } else {
                System.out.println("Neispravan unos");}

    }
}
