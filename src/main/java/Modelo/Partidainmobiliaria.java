package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1



/**
 * Partidainmobiliaria generated by hbm2java
 */
public class Partidainmobiliaria  implements java.io.Serializable {


     private String nroPartida;
     private String latitud;
     private String longitud;

    public Partidainmobiliaria() {
    }

    public Partidainmobiliaria(String nroPartida, String latitud, String longitud) {
       this.nroPartida = nroPartida;
       this.latitud = latitud;
       this.longitud = longitud;
    }
   
    public String getNroPartida() {
        return this.nroPartida;
    }
    
    public void setNroPartida(String nroPartida) {
        this.nroPartida = nroPartida;
    }
    public String getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }
    public String getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }




}


