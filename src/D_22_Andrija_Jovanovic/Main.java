package D_22_Andrija_Jovanovic;

public class Main {
    public static void main(String[] args) {
        //Zadatak 2.
        //Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
        // Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko,
        // podesicemo boolean vrednost za laktozu na false, u suprotnom na true.
        // U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).

        Jelo corba=new Jelo("corba");
        Jelo torta=new Jelo("torta");
        Jelo sarma=new Jelo("sarma");

        //--------------------------------------

        Corba c1=new Corba("juneca corba");
        c1.dodajSastojak("junetina");
        c1.dodajSastojak("zelen");
        c1.dodajSastojak("mesano povrce");
        c1.dodajSastojak("voda");

        c1.stampa();

        //--------------------------------------

        Corba c2=new Corba("pileca corba");
        c2.dodajSastojak("pilece meso");
        c2.dodajSastojak("voda");
        c2.dodajSastojak("zelen");
        c2.dodajSastojak("mleko");

        c2.stampa();

        //-------------------------------------

        Torta t1=new Torta("Reform torta");
        t1.dodajSastojak("cokolada");
        t1.dodajSastojak("orah");
        t1.dodajSastojak("puter");
        t1.dodajSastojak("secer");

        t1.stampa();

        //---------------------------------------

        Torta t2=new Torta("Keks torta");
        t2.dodajSastojak("jaja");
        t2.dodajSastojak("mleko");
        t2.dodajSastojak("keks");
        t2.dodajSastojak("secer");

        t2.stampa();

        //--------------------------------------

         Sarma s1=new Sarma("Sarma od kupusa");
         s1.dodajSastojak("mleveno meso");
         s1.dodajSastojak("pirinac");
         s1.dodajSastojak("kupus");
         s1.dodajSastojak("zacin");

         s1.stampa();

    }
}
