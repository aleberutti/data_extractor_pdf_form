package Modelo;
// Generated 13-ago-2019 9:35:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Grupoactividad generated by hbm2java
 */
public class Grupoactividad  implements java.io.Serializable {


     private char idGrupo;
     private String nombreGrupo;
     private Set actividads = new HashSet(0);

    public Grupoactividad() {
    }

	
    public Grupoactividad(char idGrupo, String nombreGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
    }
    public Grupoactividad(char idGrupo, String nombreGrupo, Set actividads) {
       this.idGrupo = idGrupo;
       this.nombreGrupo = nombreGrupo;
       this.actividads = actividads;
    }
   
    public char getIdGrupo() {
        return this.idGrupo;
    }
    
    public void setIdGrupo(char idGrupo) {
        this.idGrupo = idGrupo;
    }
    public String getNombreGrupo() {
        return this.nombreGrupo;
    }
    
    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    public Set getActividads() {
        return this.actividads;
    }
    
    public void setActividads(Set actividads) {
        this.actividads = actividads;
    }




}


