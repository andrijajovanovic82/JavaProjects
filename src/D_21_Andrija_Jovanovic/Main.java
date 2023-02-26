package D_21_Andrija_Jovanovic;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1.
        //Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata.
        // Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik.
        // Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
        // Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene i fizikalcu
        // ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.

        Radnik fizikalac=new Radnik("001R", "fizikalac", 3, 40000);
        Radnik sefSmene=new Radnik("002S", "sef smene", 5, 60000);
        Radnik investitor=new Radnik("003I", "investitor", 6, 90000);

        //------------------------

        Fizikalac f1=new Fizikalac(fizikalac.id, fizikalac.nazivRadnika, fizikalac.godineIskustva, fizikalac.plata);

        f1.stampa();

        Fizikalac f2=new Fizikalac(fizikalac.id, fizikalac.nazivRadnika, 6, 50000);

        f2.stampa();

        //------------------------

        SefSmene s1=new SefSmene(sefSmene.id, sefSmene.nazivRadnika, sefSmene.godineIskustva, sefSmene.plata);

        s1.stampa();

        SefSmene s2=new SefSmene(sefSmene.id, sefSmene.nazivRadnika, 6, 70000);

        s2.stampa();

        //--------------------------

        Investitor i1=new Investitor(investitor.id, investitor.nazivRadnika, investitor.godineIskustva, investitor.plata, 4);

        i1.stampa();

        Investitor i2=new Investitor(investitor.id, investitor.nazivRadnika, 7, 110000, 10);

        i2.stampa();

    }
}
