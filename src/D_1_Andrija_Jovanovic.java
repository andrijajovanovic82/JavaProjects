public class D_1_Andrija_Jovanovic {
    public static void main(String[] args){
        //Napraviti program gde cete uneti informacije o nekom vocu tako sto cete kreirati String za naziv nekog voca
        // i double vrednost za njegovu cenu.
        //Uneti 4 naziva i 4 cene za odredjeno voce, i u svakom redu posebno stampati naziv vocke
        // i njenu cenu za 30% snizenu
        String voce1="jabuka";
        double cenaJabuka=99.99;
        String voce2="kruska";
        double cenaKrusaka=189.99;
        String voce3="banana";
        double cenaBanana=199.99;
        String voce4="pomorandza";
        double cenaPomorandzi=159.99;
        System.out.println("Naziv artikla: " + voce1 + " - Snizena cena za kg: " + (cenaJabuka * 0.3));
        System.out.println("Naziv artikla: " + voce2 + " - Snizena cena za kg: " + (cenaKrusaka * 0.3));
        System.out.println("Naziv artikla: " + voce3 + " - Snizena cena za kg: " + (cenaBanana * 0.3));
        System.out.println("Naziv artikla: " + voce4 + " - Snizena cena za kg: " + (cenaPomorandzi * 0.3));


    }
}
