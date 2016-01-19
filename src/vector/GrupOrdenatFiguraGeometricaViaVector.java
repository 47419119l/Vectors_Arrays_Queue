package vector;
import java.util.Collections;
import java.util.List;
import java.util.Vector;


/**
 * Created by shengbin on 2016/1/19.
 */
public class GrupOrdenatFiguraGeometricaViaVector {
     Vector<FiguraGeometrica02> v;

    public GrupOrdenatFiguraGeometricaViaVector(int tamany)   {

        v = new Vector<FiguraGeometrica02>(tamany);
    }
    public GrupOrdenatFiguraGeometricaViaVector()   {

    }

    public int getCapacitat()   {
        return v.capacity();
    }

    public int getSize()   {
        return v.size();

    }
    public int afegir(FiguraGeometrica02 figura)
    {
        v.add(figura);
        return -1;
    }




    public FiguraGeometrica02 retornaPosicio(int i)   {
        return v.get(i);
    }


    public FiguraGeometrica02 extreure(int id)   {

       // int pos=Collections.binarySearch((List<? extends Comparable<? super Integer>>) v,id);
        return v.remove(1);
    }

    public void clear()   {
        v.clear();
    }

    public void mostrar()   {

        for (int i=0; i<v.size(); i++)
            System.out.println("Codi : "+v.get(i).getCodi() + " - Nom : "+v.get(i).getNom());
    }

    @Override
    public boolean equals(Object obj)   {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof GrupOrdenatFiguraGeometricaViaVector)
            return v.equals(((GrupOrdenatFiguraGeometricaViaVector)obj).v);
        return false;
    }

}
