package D_19_Andrija_Jovanovic;

public class Main {
    public static void main(String[] args) {
        //Napraviti klasu Knjiga koja ce imati naziv i zanr. U glavnoj klasi napraviti dve knjige, zatim proveriti da li imaju isti zanr i naziv,
        // ako imaju, ispisati poruku da je u pitanju ista knjiga, ako je samo zanr isti, ispisati poruku koji je to zanr,
        // ako nista od toga nije isto, ispisati poruku da su u pitanju dve razlicite knjige.

        Knjiga knjiga1 = new Knjiga("Limeni dobos", "roman");

        Knjiga knjiga2 = new Knjiga("Slobodan pad", "roman");


        if (knjiga1.zanr.equals(knjiga2.zanr)) {
            if (knjiga1.naziv.equals(knjiga2.naziv)) {
                System.out.println("Knjige su iste");
            } else {
                System.out.println("Zanr knjiga je: " + knjiga1.zanr);
            }
        } else {
            System.out.println("Knjige su razlicite");
        }
    }
}
