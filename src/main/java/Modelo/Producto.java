package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private Planta planta;
     private String nombre;
     private String estadoFisico;
     private double produccionAnual;
     private String unidad;
     private String almacenamiento;
     private String clasificacion;
     private String especificacion;

    public Producto() {
    }

    public Producto(Planta planta, String nombre, String estadoFisico, double produccionAnual, String unidad, String almacenamiento, String clasificacion, String especificacion) {
       this.planta = planta;
       this.nombre = nombre;
       this.estadoFisico = estadoFisico;
       this.produccionAnual = produccionAnual;
       this.unidad = unidad;
       this.almacenamiento = almacenamiento;
       this.clasificacion = clasificacion;
       this.especificacion = especificacion;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
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
    public double getProduccionAnual() {
        return this.produccionAnual;
    }
    
    public void setProduccionAnual(double produccionAnual) {
        this.produccionAnual = produccionAnual;
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
    public String getClasificacion() {
        return this.clasificacion;
    }
    
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getEspecificacion() {
        return this.especificacion;
    }
    
    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }




}


