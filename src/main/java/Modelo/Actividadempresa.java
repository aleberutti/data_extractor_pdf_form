package Modelo;
// Generated 13-ago-2019 9:35:52 by Hibernate Tools 4.3.1



/**
 * Actividadempresa generated by hbm2java
 */
public class Actividadempresa  implements java.io.Serializable {


     private ActividadempresaId id;
     private Actividad actividad;
     private Empresa empresa;
     private String prioridad;

    public Actividadempresa() {
    }

    public Actividadempresa(ActividadempresaId id, Actividad actividad, Empresa empresa, String prioridad) {
       this.id = id;
       this.actividad = actividad;
       this.empresa = empresa;
       this.prioridad = prioridad;
    }
   
    public ActividadempresaId getId() {
        return this.id;
    }
    
    public void setId(ActividadempresaId id) {
        this.id = id;
    }
    public Actividad getActividad() {
        return this.actividad;
    }
    
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getPrioridad() {
        return this.prioridad;
    }
    
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }




}

