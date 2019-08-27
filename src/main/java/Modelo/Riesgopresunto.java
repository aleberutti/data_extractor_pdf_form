package Modelo;
// Generated 27-ago-2019 12:41:28 by Hibernate Tools 4.3.1



/**
 * Riesgopresunto generated by hbm2java
 */
public class Riesgopresunto  implements java.io.Serializable {


     private Integer idRiesgoPresunto;
     private Planta planta;
     private boolean fuentesMoviles;
     private boolean aparatosSometidos;
     private boolean sustanciasQuimicas;
     private boolean explosion;
     private boolean incendio;
     private boolean otro;
     private String observaciones;

    public Riesgopresunto() {
    }

    public Riesgopresunto(Planta planta, boolean fuentesMoviles, boolean aparatosSometidos, boolean sustanciasQuimicas, boolean explosion, boolean incendio, boolean otro, String observaciones) {
       this.planta = planta;
       this.fuentesMoviles = fuentesMoviles;
       this.aparatosSometidos = aparatosSometidos;
       this.sustanciasQuimicas = sustanciasQuimicas;
       this.explosion = explosion;
       this.incendio = incendio;
       this.otro = otro;
       this.observaciones = observaciones;
    }
   
    public Integer getIdRiesgoPresunto() {
        return this.idRiesgoPresunto;
    }
    
    public void setIdRiesgoPresunto(Integer idRiesgoPresunto) {
        this.idRiesgoPresunto = idRiesgoPresunto;
    }
    public Planta getPlanta() {
        return this.planta;
    }
    
    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
    public boolean isFuentesMoviles() {
        return this.fuentesMoviles;
    }
    
    public void setFuentesMoviles(boolean fuentesMoviles) {
        this.fuentesMoviles = fuentesMoviles;
    }
    public boolean isAparatosSometidos() {
        return this.aparatosSometidos;
    }
    
    public void setAparatosSometidos(boolean aparatosSometidos) {
        this.aparatosSometidos = aparatosSometidos;
    }
    public boolean isSustanciasQuimicas() {
        return this.sustanciasQuimicas;
    }
    
    public void setSustanciasQuimicas(boolean sustanciasQuimicas) {
        this.sustanciasQuimicas = sustanciasQuimicas;
    }
    public boolean isExplosion() {
        return this.explosion;
    }
    
    public void setExplosion(boolean explosion) {
        this.explosion = explosion;
    }
    public boolean isIncendio() {
        return this.incendio;
    }
    
    public void setIncendio(boolean incendio) {
        this.incendio = incendio;
    }
    public boolean isOtro() {
        return this.otro;
    }
    
    public void setOtro(boolean otro) {
        this.otro = otro;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


