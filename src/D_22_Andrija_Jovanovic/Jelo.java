package D_22_Andrija_Jovanovic;

import java.util.ArrayList;

public class Jelo {

    //Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.

    String naziv;
    ArrayList<String> listaSastojaka;
    boolean bezLaktoze;


    public Jelo(String naziv) {
        this.naziv = naziv;
        bezLaktoze = true;
        this.listaSastojaka=new ArrayList<>();
    }

    public void dodajSastojak(String sastojak){
        if (sastojak.equals("mleko")){
            bezLaktoze=false;
        }
        listaSastojaka.add(sastojak);
    }

}
