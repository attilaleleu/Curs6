package exercitiu.masina;

/**
 * Created by leleluattila on 19/01/16.
 */
public class Test {
    public static void main(String[] args){

        Vehicule v1 = new Vehicule("Camion");
        Vehicule v2 = new Masina("Ford", 5000);

        v1.afiseaza();
        v2.afiseaza();
    }
}
