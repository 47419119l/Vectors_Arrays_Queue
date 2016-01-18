package queue;

import java.util.Comparator;

/**
 * Created by shengbin on 2016/1/18.
 */
public class OrdenarPorPrioridad implements Comparator<Peticion>{
    @Override
    public int compare(Peticion o1, Peticion o2) {
        if(o2.prioridadint != o1.prioridadint) {
            return o2.prioridadint - o1.prioridadint;
        }else{
            // fer funcio per verue quina data es la anterior.
            return o2.prioridadint +1;
        }
    }
}
