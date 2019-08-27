package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Actividad generated by hbm2java
 */
public class Actividad  implements java.io.Serializable {


     private int cuacm;
     private Grupoactividad grupoactividad;
     private String nombreActividad;
     private int estandar;
     private Set actividadempresas = new HashSet(0);

    public Actividad() {
    }

	
    public Actividad(int cuacm, Grupoactividad grupoactividad, String nombreActividad, int estandar) {
        this.cuacm = cuacm;
        this.grupoactividad = grupoactividad;
        this.nombreActividad = nombreActividad;
        this.estandar = estandar;
    }
    public Actividad(int cuacm, Grupoactividad grupoactividad, String nombreActividad, int estandar, Set actividadempresas) {
       this.cuacm = cuacm;
       this.grupoactividad = grupoactividad;
       this.nombreActividad = nombreActividad;
       this.estandar = estandar;
       this.actividadempresas = actividadempresas;
    }
   
    public int getCuacm() {
        return this.cuacm;
    }
    
    public void setCuacm(int cuacm) {
        this.cuacm = cuacm;
    }
    public Grupoactividad getGrupoactividad() {
        return this.grupoactividad;
    }
    
    public void setGrupoactividad(Grupoactividad grupoactividad) {
        this.grupoactividad = grupoactividad;
    }
    public String getNombreActividad() {
        return this.nombreActividad;
    }
    
    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }
    public int getEstandar() {
        return this.estandar;
    }
    
    public void setEstandar(int estandar) {
        this.estandar = estandar;
    }
    public Set getActividadempresas() {
        return this.actividadempresas;
    }
    
    public void setActividadempresas(Set actividadempresas) {
        this.actividadempresas = actividadempresas;
    }




}


