package Modelo;
// Generated 27-ago-2019 12:41:28 by Hibernate Tools 4.3.1



/**
 * Insumo generated by hbm2java
 */
public class Insumo  implements java.io.Serializable {


     private Integer idInsumo;
     private Planta planta;
     private String nombre;
     private String estadoFisico;
     private double consumoAnual;
     private String unidad;
     private String almacenamiento;

    public Insumo() {
    }

    public Insumo(Planta planta, String nombre, String estadoFisico, double consumoAnual, String unidad, String almacenamiento) {
       this.planta = planta;
       this.nombre = nombre;
       this.estadoFisico = estadoFisico;
       this.consumoAnual = consumoAnual;
       this.unidad = unidad;
       this.almacenamiento = almacenamiento;
    }
   
    public Integer getIdInsumo() {
        return this.idInsumo;
    }
    
    public void setIdInsumo(Integer idInsumo) {
        this.idInsumo = idInsumo;
    }
    public Planta getPlanta() {
        return this.planta;
    }
    
    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstadoFisico() {
        return this.estadoFisico;
    }
    
    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }
    public double getConsumoAnual() {
        return this.consumoAnual;
    }
    
    public void setConsumoAnual(double consumoAnual) {
        this.consumoAnual = consumoAnual;
    }
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public String getAlmacenamiento() {
        return this.almacenamiento;
    }
    
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}


