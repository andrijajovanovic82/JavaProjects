import java.util.Scanner;

public class D_4_Andrija_Jovanovic {
    public static void main (String[] args){
        //Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..), zatim izracunavate godine radnog iskustva,
        //ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer(Napraviti ispis "Ti si Junior programer"),
        //ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"), ako imate vise od 8 godina
        //onda ste direktor firme("Vi ste direktor firme").
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu u kojoj ste krenuli da radite");
        int godina=sc.nextInt();
        int staz = 2022 - godina;
        if (staz<=4){System.out.println("Ti si Junior programer");}
        else if (staz>4 && staz<=8){System.out.println("Ti si senior programer");}
        else if (staz>8 && staz<50){System.out.println("Vi ste direktor firme");}
        else {System.out.println("Neispravan unos");}


    }
}
