import java.util.Scanner;

public class D_2_Andrija_Jovanovic {
    public static void main (String[] args){
        //Napraviti program gde cete uneti svoju godinu rodjenja, trenutnu godinu
        // i u konzoli istampati svoj broj godina.
  System.out.println("Unesite godinu rodjenja");
  Scanner scanner = new Scanner(System.in);
  int godinaRodjenja;
  godinaRodjenja = scanner.nextInt();
  System.out.println("Unesite aktuelnu kalendarsku godinu");
  int trenutnaGodina;
  trenutnaGodina = scanner.nextInt();
  System.out.println("Imate " + (trenutnaGodina - godinaRodjenja) + " godina");
}
}
