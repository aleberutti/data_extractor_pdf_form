package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1



/**
 * MateriaPrima generated by hbm2java
 */
public class MateriaPrima  implements java.io.Serializable {


     private Integer idMateriaPrima;
     private Planta planta;
     private String nombre;
     private String estadoFisico;
     private double consumoAnual;
     private String unidad;
     private String almacenamiento;

    public MateriaPrima() {
    }

    public MateriaPrima(Planta planta, String nombre, String estadoFisico, double consumoAnual, String unidad, String almacenamiento) {
       this.planta = planta;
       this.nombre = nombre;
       this.estadoFisico = estadoFisico;
       this.consumoAnual = consumoAnual;
       this.unidad = unidad;
       this.almacenamiento = almacenamiento;
    }
   
    public Integer getIdMateriaPrima() {
        return this.idMateriaPrima;
    }
    
    public void setIdMateriaPrima(Integer idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
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

