package OsmiCas;

import java.util.Scanner;

public class D_17_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Zadatak 1.
        //Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz imena i String koji zelimo da proverimo,
        // ispisati poruku ukoliko se ime nalazi u nizu, obavestiti ako nije tu. (Ime za proveru vi unosite)

        Scanner sc = new Scanner(System.in);
        String[] niz = {"ivana", "petar", "isidora", "jovana", "nikola", "milos", "ana"};
        System.out.println("Unesite neko ime");

        provera(niz,sc.next().trim().toLowerCase());

    }
    public static void provera(String[] niz, String unos){

        boolean provera=false;
        for(int i =0; i<niz.length; i++){
            if (niz[i].equals(unos)){
                provera=true;
                break;
            }
        }
        if(provera){
            System.out.println("Ime se nalazi u nizu");
        }
        else{
            System.out.println("Ime se ne nalazi u nizu");
        }
    }

}
