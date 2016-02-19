package exercitiu.masina;

/**
 * Created by leleluattila on 19/01/16.
 */
public class Vehicule {
    String nume;

    Vehicule(String nume){
        this.nume = nume;
    }

    void afiseaza (){
        System.out.println("nume: " + nume);
    }
}

class Masina extends Vehicule{
    int cc;

    Masina(String nume, int cc){
        super(nume);
        this.cc = cc;
    }

    @Override
    void afiseaza() {
        System.out.println();
        super.afiseaza();
        System.out.println("capacitate cilindrica: " + cc);
    }
}
