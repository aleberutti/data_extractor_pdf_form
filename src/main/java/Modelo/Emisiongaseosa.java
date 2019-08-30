package Modelo;
// Generated 27-ago-2019 12:41:28 by Hibernate Tools 4.3.1



/**
 * Emisiongaseosa generated by hbm2java
 */
public class Emisiongaseosa  implements java.io.Serializable {


     private Integer idEmisionGaseosa;
     private Planta planta;
     private String tipo;
     private String emision;
     private String procesoGenerador;
     private String tratamiento;
     private String componentesRelevantes;

    public Emisiongaseosa() {
    }

    public Emisiongaseosa(Planta planta, String tipo, String emision, String procesoGenerador, String tratamiento, String componentesRelevantes) {
       this.planta = planta;
       this.tipo = tipo;
       this.emision = emision;
       this.procesoGenerador = procesoGenerador;
       this.tratamiento = tratamiento;
       this.componentesRelevantes = componentesRelevantes;
    }
   
    public Integer getIdEmisionGaseosa() {
        return this.idEmisionGaseosa;
    }
    
    public void setIdEmisionGaseosa(Integer idEmisionGaseosa) {
        this.idEmisionGaseosa = idEmisionGaseosa;
    }
    public Planta getPlanta() {
        return this.planta;
    }
    
    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEmision() {
        return this.emision;
    }
    
    public void setEmision(String emision) {
        this.emision = emision;
    }
    public String getProcesoGenerador() {
        return this.procesoGenerador;
    }
    
    public void setProcesoGenerador(String procesoGenerador) {
        this.procesoGenerador = procesoGenerador;
    }
    public String getTratamiento() {
        return this.tratamiento;
    }
    
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    public String getComponentesRelevantes() {
        return this.componentesRelevantes;
    }
    
    public void setComponentesRelevantes(String componentesRelevantes) {
        this.componentesRelevantes = componentesRelevantes;
    }




}


