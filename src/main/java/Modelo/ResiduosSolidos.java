package Modelo;
// Generated 27-ago-2019 12:41:28 by Hibernate Tools 4.3.1



/**
 * ResiduosSolidos generated by hbm2java
 */
public class ResiduosSolidos  implements java.io.Serializable {


     private Integer idResiduoSolido;
     private Planta planta;
     private String residuo;
     private double cantidad;
     private String unidad;
     private String periodo;
     private String procesoGenerador;
     private String gestion;
     private String tipo;

    public ResiduosSolidos() {
    }

    public ResiduosSolidos(Planta planta, String residuo, double cantidad, String unidad, String periodo, String procesoGenerador, String gestion, String tipo) {
       this.planta = planta;
       this.residuo = residuo;
       this.cantidad = cantidad;
       this.unidad = unidad;
       this.periodo = periodo;
       this.procesoGenerador = procesoGenerador;
       this.gestion = gestion;
       this.tipo = tipo;
    }
   
    public Integer getIdResiduoSolido() {
        return this.idResiduoSolido;
    }
    
    public void setIdResiduoSolido(Integer idResiduoSolido) {
        this.idResiduoSolido = idResiduoSolido;
    }
    public Planta getPlanta() {
        return this.planta;
    }
    
    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
    public String getResiduo() {
        return this.residuo;
    }
    
    public void setResiduo(String residuo) {
        this.residuo = residuo;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getProcesoGenerador() {
        return this.procesoGenerador;
    }
    
    public void setProcesoGenerador(String procesoGenerador) {
        this.procesoGenerador = procesoGenerador;
    }
    public String getGestion() {
        return this.gestion;
    }
    
    public void setGestion(String gestion) {
        this.gestion = gestion;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}

