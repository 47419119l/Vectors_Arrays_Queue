package vector;
import java.util.Collections;
import java.util.Vector;

public class GrupFiguraGeometricaViaVector {
    private Vector<FiguraGeometrica02> v;

    public GrupFiguraGeometricaViaVector(int dim) {
        if (dim<0) throw new IllegalArgumentException("Dimensió errònia: " + dim);
        v = new Vector<FiguraGeometrica02>(dim);
    }

    public GrupFiguraGeometricaViaVector() {
        this (0);
    }

    public int capacitat() {
        return v.capacity();
    }

    public int nreElements() {
        return v.size();
    }

    /** Afegeix, si no hi ha cap objecte amb idèntica clau, l'objecte obj al vector
     Retorna -1: S'ha afegit sense cap problema
     -2: S'ha passat una referència nul·la - No es pot afegir
     >=0: Ja existeix un objecte amb igual clau a la posició retornada per la funció
     */
    public int afegir(FiguraGeometrica02 obj) {
        int i;
        if (obj==null) return -2;
        i = v.indexOf (obj);
        if (i>=0) return i;
        v.add(obj);
        return -1;
    }

    /** Cerca un objecte dins la taula amb codi idèntic a a l'indicat
     Retorna -1: Si no el troba
     >=0: La posició on hi ha un objecte amb idèntic codi
     */
    public int cercar(int codi) {
        int i;
        for (i=0; i<v.size() && v.get(i).codi!=codi; i++);
        if (i<v.size()) return i;
        return -1;
    }

    /** Retorna l'objecte que esta a la posicio i
     Retorna null: Si la posicio no existeix o està buida
     */
    public FiguraGeometrica02 exemplarAt(int i) {
        if (i<0 || i>=v.size()) return null;
        return v.get(i);
    }

    /** Cerca un objecte dins la taula amb codi idèntic a l'indicat per a treure'l de la taula
     Retorna null: Si no el troba
     L'objecte extret en cas de trobar-lo
     */
    public FiguraGeometrica02 extreure(int codi) {
        int i;
        for (i=0; i<v.size() && v.get(i).codi!=codi;i++);
        if (i==v.size()) return null;
        return v.remove(i);
    }

    public void buidar() {
        v.clear();
    }

    public void visualitzar() {
        int i;
        System.out.println ("Contingut del vector");
        System.out.println ("********************");
        System.out.println ("Capacitat....: " + v.capacity());
        System.out.println ("Nre. Elements: " + v.size());
        for (i=0; i<v.size(); i++)
            System.out.println("Element " + i + ": " + v.get(i));
    }

    public void ordenarPerCodi() {
        Collections.sort(v);
    }

    public void ordenarPerArea() {
        Collections.sort(v,new FiguraGeometrica02.ComparatorFiguraGeometricaSegonsArea());
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof GrupFiguraGeometricaViaVector)  {
            GrupFiguraGeometricaViaVector aux = (GrupFiguraGeometricaViaVector)obj;
            int i;
            if (v.size()!=aux.v.size()) return false;
            for (i=0; i<v.size() && aux.v.indexOf(v.get(i))>=0; i++);
            if (i==v.size()) return true; // Vol dir que totes les figures de v tenen un objecte "igual" segons el
            // mètode FiguraGeometrica.equals() a l'altre grup obj
        }
        return false;
    }

    public int hashCode () {
        int result=0;
        int i;
        for (i=0; i<v.size(); i++) result = result + v.get(i).hashCode();
        return result;
        // És clar que si dos grups són iguals (conjunt d'elements iguals), amb aquesta implementació de hashCode()
        // també tindran el mateix hashCode(), tal i com ha de ser.
    }
}