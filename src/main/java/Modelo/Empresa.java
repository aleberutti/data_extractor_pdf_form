package Modelo;
// Generated 13-ago-2019 9:35:52 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private int cuit;
     private String razonSocial;
     private Date fechaInicioActividades;
     private int tipoPersona;
     private Integer nroRegistro;
     private Set representantes = new HashSet(0);
     private Set domicilios = new HashSet(0);
     private Set plantas = new HashSet(0);
     private Set actividadempresas = new HashSet(0);

    public Empresa() {
    }

	
    public Empresa(int cuit, String razonSocial, Date fechaInicioActividades, int tipoPersona) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.fechaInicioActividades = fechaInicioActividades;
        this.tipoPersona = tipoPersona;
    }
    public Empresa(int cuit, String razonSocial, Date fechaInicioActividades, int tipoPersona, Integer nroRegistro, Set representantes, Set domicilios, Set plantas, Set actividadempresas) {
       this.cuit = cuit;
       this.razonSocial = razonSocial;
       this.fechaInicioActividades = fechaInicioActividades;
       this.tipoPersona = tipoPersona;
       this.nroRegistro = nroRegistro;
       this.representantes = representantes;
       this.domicilios = domicilios;
       this.plantas = plantas;
       this.actividadempresas = actividadempresas;
    }
   
    public int getCuit() {
        return this.cuit;
    }
    
    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public Date getFechaInicioActividades() {
        return this.fechaInicioActividades;
    }
    
    public void setFechaInicioActividades(Date fechaInicioActividades) {
        this.fechaInicioActividades = fechaInicioActividades;
    }
    public int getTipoPersona() {
        return this.tipoPersona;
    }
    
    public void setTipoPersona(int tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
    public Integer getNroRegistro() {
        return this.nroRegistro;
    }
    
    public void setNroRegistro(Integer nroRegistro) {
        this.nroRegistro = nroRegistro;
    }
    public Set getRepresentantes() {
        return this.representantes;
    }
    
    public void setRepresentantes(Set representantes) {
        this.representantes = representantes;
    }
    public Set getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set domicilios) {
        this.domicilios = domicilios;
    }
    public Set getPlantas() {
        return this.plantas;
    }
    
    public void setPlantas(Set plantas) {
        this.plantas = plantas;
    }
    public Set getActividadempresas() {
        return this.actividadempresas;
    }
    
    public void setActividadempresas(Set actividadempresas) {
        this.actividadempresas = actividadempresas;
    }




}

