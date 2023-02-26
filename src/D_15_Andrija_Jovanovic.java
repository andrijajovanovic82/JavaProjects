import java.util.ArrayList;

public class D_15_Andrija_Jovanovic {
    public static void main(String[] args) {
        //1. Napraviti proizvoljan niz brojeva, podeliti ih u dve liste, jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.
        int niz[] = {9,1,5,4,7,8,12,5,2,22};
        ArrayList lista1 = new ArrayList<>();
        ArrayList lista2 = new ArrayList<>();
        for (int i=0; i<niz.length; i++){
            if(niz[i]%2==0){
                lista1.add (niz[i]);}
            else{lista2.add(niz[i]);
            }
        }
        System.out.println(lista1);
        System.out.println(lista2);
    }
}
