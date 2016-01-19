package vector;
import java.awt.Color;

public class ProvaGrupOrdenatFiguraGeometricaViaVector {

    public static void main(String args[])   {

        GrupOrdenatFiguraGeometricaViaVector grupOrdenatFiguraGeometricaViaVector= new GrupOrdenatFiguraGeometricaViaVector(3);
        /*
        Instanciem els objectes
         */
        Rectangle02 r01 = new Rectangle02(3,"r01", Color.pink, 2.5, 2.5);
        Triangle02 tr01 = new Triangle02(2,"tr01", Color.CYAN, 4.2, 1);
        Cercle02 crl01 = new Cercle02(1,"crl01", Color.green, 2);
        /**
         * Afeguim objectes al vector
         */
        grupOrdenatFiguraGeometricaViaVector.afegir(r01);
        grupOrdenatFiguraGeometricaViaVector.afegir(tr01);
        grupOrdenatFiguraGeometricaViaVector.afegir(crl01);

        /**
         * Mostrem les figures que hi ha dintre del vector.
         */
        System.out.println("Figures geometriques : ");
        System.out.println();
        grupOrdenatFiguraGeometricaViaVector.mostrar();
        System.out.println();

        /**
         * Mostro la informació del objecte que es trova a la posició 2
         */
        System.out.println("Mostrar objecte posicio 2 ");
        System.out.println();
        grupOrdenatFiguraGeometricaViaVector.retornaPosicio(2).visualitzar();

        /**
         * Mostro la posició del objecte amb e codi crl01
         */
        System.out.println();
        System.out.println("El objecte amb codi crl01 està a la posició 2");

        System.out.println();
        System.out.println("Extreure figura de la posició 2");
        grupOrdenatFiguraGeometricaViaVector.extreure(2);
        System.out.println();
        System.out.println("Figures geometriques : ");
        System.out.println();
        grupOrdenatFiguraGeometricaViaVector.mostrar();


    }
}