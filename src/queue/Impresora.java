package queue;
import java.util.*;
/**
 * Created by shengbin on 2016/1/18.
 */
public class Impresora {
    public static void main(String[] args) {
        PriorityQueue<Peticion> pq = new PriorityQueue<Peticion>(10, new OrdenarPorPrioridad());

        Peticion i;
        i = new Peticion("Sandra", "Fotografia", "02/01/2015", 1);
        pq.add(i);
        i = new Peticion("Pere", "Projecte", "03/03/2015", 3);
        pq.add(i);
        i = new Peticion("Joan", "CV", "02/01/2015", 2);
        pq.add(i);

        System.out.println("Número de peticions : " + pq.size());
        System.out.println();
        Iterator<Peticion> it = pq.iterator();

       //Mostrem el nom dels usuaris sense prioritat.
        System.out.println("Peticions :");
        System.out.println();
        while (it.hasNext()) System.out.print(" - "+it.next().usuario+"\n");

        System.out.println();
        System.out.println("Imprimint ... :");
        System.out.println();

        // Passen les peticions ala impresora i es van esborrant.
        System.out.println("Usuario : "+pq.peek().usuario+"\n Descripción ; "+pq.peek().descripcion+"\n Fecha de solicitud : " +pq.poll().fecha_solicitud+"\n");
        System.out.println("Usuario : "+pq.peek().usuario+"\n Descripción ; "+pq.peek().descripcion+"\n Fecha de solicitud : " +pq.poll().fecha_solicitud+"\n");
        System.out.println("Usuario : "+pq.peek().usuario+"\n Descripción ; "+pq.peek().descripcion+"\n Fecha de solicitud : " +pq.poll().fecha_solicitud+"\n");


        pq.clear();

    }
}


