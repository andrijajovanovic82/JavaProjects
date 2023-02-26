package D_20_Andrija_Jovanovic;

public class Main {
    public static void main(String[] args) {
        //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika,
        // proveriti cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.

        Radnik radnik1=new Radnik("Petar Petrovic", "magacioner", 40000);

        Radnik radnik2=new Radnik("Veljko Nikolic", "nadzornik", 50000 );

       if (radnik1.plata>radnik2.plata){
           System.out.println( "Radnik " + radnik1.ime + " je na poziciji " + radnik1.pozicija + ", sa platom koja iznosi " + (radnik1.plata * 1.2));
       }
       else{
           System.out.println( "Radnik " + radnik2.ime + " je na poziciji " + radnik2.pozicija + ", sa platom koja iznosi " + (radnik2.plata *1.2));
       }
    }
}
