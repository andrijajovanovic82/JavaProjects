package D_22_Andrija_Jovanovic;

import java.util.ArrayList;

public class Corba extends Jelo {

    public Corba(String naziv) {
        super(naziv);

    }

    public void stampa(){
        System.out.println("Recept: " + this.naziv);
        System.out.println("Potrebni sastojci:");
        for(int i =0; i<listaSastojaka.size(); i++){
            System.out.println(listaSastojaka.get(i));
        }
        if(bezLaktoze){
            System.out.println("Jelo je bez laktoze");
        }
        else{
            System.out.println("Jelo sadrzi laktozu");
        }
        System.out.println("----------------");
    }
}
