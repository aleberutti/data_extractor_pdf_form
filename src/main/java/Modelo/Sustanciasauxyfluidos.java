package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1



/**
 * Sustanciasauxyfluidos generated by hbm2java
 */
public class Sustanciasauxyfluidos  implements java.io.Serializable {


     private Integer idSustanciasAux;
     private String nombre;
     private double consumoAnual;
     private String unidad;
     private String almacenamiento;
     private int idPlanta;

    public Sustanciasauxyfluidos() {
    }

    public Sustanciasauxyfluidos(String nombre, double consumoAnual, String unidad, String almacenamiento, int idPlanta) {
       this.nombre = nombre;
       this.consumoAnual = consumoAnual;
       this.unidad = unidad;
       this.almacenamiento = almacenamiento;
       this.idPlanta = idPlanta;
    }
   
    public Integer getIdSustanciasAux() {
        return this.idSustanciasAux;
    }
    
    public void setIdSustanciasAux(Integer idSustanciasAux) {
        this.idSustanciasAux = idSustanciasAux;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public int getIdPlanta() {
        return this.idPlanta;
    }
    
    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }




}


