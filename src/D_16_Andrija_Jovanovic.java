import java.util.ArrayList;
import java.util.Scanner;

public class D_16_Andrija_Jovanovic {
    public static void main(String[] args) {
        //2. Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste, ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        lista.add("jovana");
        lista.add("petar");
        lista.add("milica");
        lista.add("stefan");
        lista.add("katarina");
        lista.add("stefan");
        lista.add("petar");
        lista.add("igor");

        System.out.println("Lista pre brisanja: " + lista);

        System.out.println("Unesite ime koje zelite da obrisete sa liste");
        String ime = sc.next().trim().toLowerCase();

        int pocetnaVelicina = lista.size();

        for (int i = lista.size() - 1; i >= 0; i--) {
            if (lista.get(i).equals(ime)) {
                lista.remove(i);
            }
        }
        if (lista.size() != pocetnaVelicina) {
            System.out.println("Ime " + ime + " je na listi");
            System.out.println("Ime " + ime + " je obrisano");
            System.out.println("Lista nakon brisanja: " + lista);
        } else {
            System.out.println("Ime " + ime + " nije na listi");
            System.out.println("Nista nije obrisano");
            System.out.println(lista);
        }
    }
}