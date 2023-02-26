import java.util.Scanner;

public class D_3_Andrija_Jovanovic {
    public static void main (String[] args){
        //Napraviti program gde cete uneti svoju radnu poziciju, mozete uneti "fizikalac", "inzenjer" i "masinovodja" i uneti svoju platu. Ispisati u konzoli poziciju koju radis i platu.
        //Ako ste na poziciji fizikalca, povecati platu za 15%.
        //Ako ste na poziciji inzenjera, povecati platu za 20%.
        //Ako ste na poziciji masinovodje, povecati platu za 30%.
        //Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite svoju radnu poziciju");
        String pozicija=sc.next();
        if (pozicija.toLowerCase().equals("fizikalac")){System.out.println("Unesi svoju platu");}
        else if (pozicija.toLowerCase().equals("inzenjer") || pozicija.toLowerCase().equals("inženjer"))
        {System.out.println("Unesi svoju platu");}
        else if (pozicija.toLowerCase().equals("masinovodja") || pozicija.toLowerCase().equals("mašinovođa")
        || pozicija.toLowerCase().equals("masinovođa") || pozicija.toLowerCase().equals("mašinovodja"))
        {System.out.println("Unesi svoju platu");}
        else {System.out.println("Pogresan unos");}
        double plata=sc.nextDouble();
        if (pozicija.toLowerCase().equals("fizikalac") && plata > 0){plata += plata * 0.15;}
        else if ((pozicija.toLowerCase().equals("inzenjer") || pozicija.toLowerCase().equals("inženjer")) && plata > 0)
        {plata += plata *0.2;}
        else if ((pozicija.toLowerCase().equals("masinovodja") || pozicija.toLowerCase().equals("mašinovođa")
                || pozicija.toLowerCase().equals("masinovođa") || pozicija.toLowerCase().equals("mašinovodja")) && plata>0)
        {plata += plata * 0.3;}
        else {System.out.println("Pogresan unos");}
        //System.out.println(plata);


    }
}
