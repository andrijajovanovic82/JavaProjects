package D_21_Andrija_Jovanovic;

public class Investitor extends Radnik{

    int brojZgrada;

    public Investitor(String id, String nazivRadnika, int godineIskustva, int plata, int brojZgrada) {
        super(id, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    public void stampa(){
        System.out.println("Zaposleni se nalazi na poziciji " + this.nazivRadnika + " sa stazom od " + this.godineIskustva + " godina.");
        if(brojZgrada>=5){
            System.out.println("Plata zaposlenog iznosi " + (this.plata + (this.plata * 0.3)));
        }
        else{
            System.out.println("Plata zaposlenog iznosi " + this.plata);
        }
        System.out.println("---------------------------");
    }
}
