package D_21_Andrija_Jovanovic;

public class SefSmene extends Radnik {

    public SefSmene(String id, String nazivRadnika, int godineIskustva, int plata) {
        super(id, nazivRadnika, godineIskustva, plata);
    }
    public void stampa(){
        System.out.println("Zaposleni se nalazi na poziciji " + this.nazivRadnika + " sa stazom od " + this.godineIskustva + " godina.");
        if(godineIskustva>5){
            System.out.println("Plata zaposlenog iznosi " + (this.plata + (this.plata * 0.2)));
        }
        else{
            System.out.println("Plata zaposlenog iznosi " + this.plata);
        }
        System.out.println("---------------------------");
    }
}
