package queue;

/**
 * Created by shengbin on 2016/1/18.
 */
enum Prioridad{
    baja,media,alta
}
public class Peticion {

    String usuario;
    String descripcion ;
    String fecha_solicitud;
     static Prioridad prioridad;
    int prioridadint;

    /**
     * Constructor de la clase Preticion sense parametres.
     */
    Peticion(){
        usuario = null;
        descripcion = null;
        fecha_solicitud= null;
        prioridad = Prioridad.baja;
    }

    /**
     * Constructor de la classe Peticion amb parametres
     * @param usuario
     * @param descripcion
     * @param fecha_solicitud
     * @param prioridad
     */
    Peticion(String usuario, String descripcion,String fecha_solicitud, int prioridad){
        this.usuario=usuario;
        this.descripcion= descripcion;
        this.fecha_solicitud= fecha_solicitud;
        this.prioridadint = prioridad;
        extreurePrioridad(prioridad);

    }
    /**
     * Extreu la prioridad.
     * @param prioridad
     */
    public void extreurePrioridad(int prioridad){

        if(prioridad ==1){
            this.prioridad =  Prioridad.baja;
        }else if( prioridad==2){
            this.prioridad = Prioridad.media;
        }else{
            this.prioridad = Prioridad.alta;
        }
    }


}
