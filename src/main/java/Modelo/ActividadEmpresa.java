package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1



/**
 * ActividadEmpresa generated by hbm2java
 */
public class ActividadEmpresa  implements java.io.Serializable {


     private ActividadEmpresaId id;
     private Actividad actividad;
     private Empresa empresa;
     private String prioridad;

    public ActividadEmpresa() {
    }

    public ActividadEmpresa(ActividadEmpresaId id, Actividad actividad, Empresa empresa, String prioridad) {
       this.id = id;
       this.actividad = actividad;
       this.empresa = empresa;
       this.prioridad = prioridad;
    }
   
    public ActividadEmpresaId getId() {
        return this.id;
    }
    
    public void setId(ActividadEmpresaId id) {
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


