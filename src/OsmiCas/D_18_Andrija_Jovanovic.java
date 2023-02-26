package OsmiCas;

import java.util.ArrayList;
import java.util.Scanner;

public class D_18_Andrija_Jovanovic {
    public static void main(String[] args) {
        //Zadatak 2.
        //Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0. Zatim cete uneti neki broj,
        // pomocu metode napraviti novu listu koja ce u sebi sadrzati sve brojeve vece od unetog broja.
        // Novu listu pozvati pomocu metode za stampanje elemenata liste.

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Unesi broj");
        int unos = sc.nextInt();
        int i = 0;
        while (unos != 0) {
            lista.add(unos);
            System.out.println("Unesi broj");
            unos = sc.nextInt();
            i++;
        }
        System.out.println("Lista sadrzi sledece brojeve: " + lista);

        System.out.println("Unesi novi broj");
        int broj = sc.nextInt();

        stampanje(novaLista(lista, broj));

    }

    public static ArrayList<Integer> novaLista(ArrayList<Integer> lista, int broj) {
        ArrayList<Integer> lista2=new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)>broj)
                lista2.add(lista.get(i));
            }
            return lista2;
        }

        public static void stampanje(ArrayList<Integer> lista2){
            System.out.println("Nova lista sadrzi sledece brojeve:");
        for (int i=0; i< lista2.size(); i++){
            System.out.println(lista2.get(i));
        }
    }

}
