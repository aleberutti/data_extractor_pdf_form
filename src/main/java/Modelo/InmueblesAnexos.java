package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1



/**
 * InmueblesAnexos generated by hbm2java
 */
public class InmueblesAnexos  implements java.io.Serializable {


     private Integer idInmueble;
     private String domicilio;
     private String actividad;
     private int idPlanta;

    public InmueblesAnexos() {
    }

    public InmueblesAnexos(String domicilio, String actividad, int idPlanta) {
       this.domicilio = domicilio;
       this.actividad = actividad;
       this.idPlanta = idPlanta;
    }
   
    public Integer getIdInmueble() {
        return this.idInmueble;
    }
    
    public void setIdInmueble(Integer idInmueble) {
        this.idInmueble = idInmueble;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getActividad() {
        return this.actividad;
    }
    
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    public int getIdPlanta() {
        return this.idPlanta;
    }
    
    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }




}

