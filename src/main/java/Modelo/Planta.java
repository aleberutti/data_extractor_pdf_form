package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Planta generated by hbm2java
 */
public class Planta  implements java.io.Serializable {


     private Integer idPlanta;
     private Empresa empresa;
     private boolean fueraProv;
     private Double superficieDeposito;
     private double superficieTotalM2;
     private double superficieCubiertaM2;
     private double potenciaInstaladaHp;
     private int dotacionDePersonal;
     private Date fechaInicioActividades;
     private Set efluentes = new HashSet(0);
     private Set insumos = new HashSet(0);
     private Set residuossolidoses = new HashSet(0);
     private Set formaciondepersonals = new HashSet(0);
     private Set subproductos = new HashSet(0);
     private Set emisiongaseosas = new HashSet(0);
     private Set productos = new HashSet(0);
     private Set domicilios = new HashSet(0);
     private Set materiaprimas = new HashSet(0);
     private Set riesgopresuntos = new HashSet(0);

    public Planta() {
    }

	
    public Planta(Empresa empresa, boolean fueraProv, double superficieTotalM2, double superficieCubiertaM2, double potenciaInstaladaHp, int dotacionDePersonal, Date fechaInicioActividades) {
        this.empresa = empresa;
        this.fueraProv = fueraProv;
        this.superficieTotalM2 = superficieTotalM2;
        this.superficieCubiertaM2 = superficieCubiertaM2;
        this.potenciaInstaladaHp = potenciaInstaladaHp;
        this.dotacionDePersonal = dotacionDePersonal;
        this.fechaInicioActividades = fechaInicioActividades;
    }
    public Planta(Empresa empresa, boolean fueraProv, Double superficieDeposito, double superficieTotalM2, double superficieCubiertaM2, double potenciaInstaladaHp, int dotacionDePersonal, Date fechaInicioActividades, Set efluentes, Set insumos, Set residuossolidoses, Set formaciondepersonals, Set subproductos, Set emisiongaseosas, Set productos, Set domicilios, Set materiaprimas, Set riesgopresuntos) {
       this.empresa = empresa;
       this.fueraProv = fueraProv;
       this.superficieDeposito = superficieDeposito;
       this.superficieTotalM2 = superficieTotalM2;
       this.superficieCubiertaM2 = superficieCubiertaM2;
       this.potenciaInstaladaHp = potenciaInstaladaHp;
       this.dotacionDePersonal = dotacionDePersonal;
       this.fechaInicioActividades = fechaInicioActividades;
       this.efluentes = efluentes;
       this.insumos = insumos;
       this.residuossolidoses = residuossolidoses;
       this.formaciondepersonals = formaciondepersonals;
       this.subproductos = subproductos;
       this.emisiongaseosas = emisiongaseosas;
       this.productos = productos;
       this.domicilios = domicilios;
       this.materiaprimas = materiaprimas;
       this.riesgopresuntos = riesgopresuntos;
    }
   
    public Integer getIdPlanta() {
        return this.idPlanta;
    }
    
    public void setIdPlanta(Integer idPlanta) {
        this.idPlanta = idPlanta;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public boolean isFueraProv() {
        return this.fueraProv;
    }
    
    public void setFueraProv(boolean fueraProv) {
        this.fueraProv = fueraProv;
    }
    public Double getSuperficieDeposito() {
        return this.superficieDeposito;
    }
    
    public void setSuperficieDeposito(Double superficieDeposito) {
        this.superficieDeposito = superficieDeposito;
    }
    public double getSuperficieTotalM2() {
        return this.superficieTotalM2;
    }
    
    public void setSuperficieTotalM2(double superficieTotalM2) {
        this.superficieTotalM2 = superficieTotalM2;
    }
    public double getSuperficieCubiertaM2() {
        return this.superficieCubiertaM2;
    }
    
    public void setSuperficieCubiertaM2(double superficieCubiertaM2) {
        this.superficieCubiertaM2 = superficieCubiertaM2;
    }
    public double getPotenciaInstaladaHp() {
        return this.potenciaInstaladaHp;
    }
    
    public void setPotenciaInstaladaHp(double potenciaInstaladaHp) {
        this.potenciaInstaladaHp = potenciaInstaladaHp;
    }
    public int getDotacionDePersonal() {
        return this.dotacionDePersonal;
    }
    
    public void setDotacionDePersonal(int dotacionDePersonal) {
        this.dotacionDePersonal = dotacionDePersonal;
    }
    public Date getFechaInicioActividades() {
        return this.fechaInicioActividades;
    }
    
    public void setFechaInicioActividades(Date fechaInicioActividades) {
        this.fechaInicioActividades = fechaInicioActividades;
    }
    public Set getEfluentes() {
        return this.efluentes;
    }
    
    public void setEfluentes(Set efluentes) {
        this.efluentes = efluentes;
    }
    public Set getInsumos() {
        return this.insumos;
    }
    
    public void setInsumos(Set insumos) {
        this.insumos = insumos;
    }
    public Set getResiduossolidoses() {
        return this.residuossolidoses;
    }
    
    public void setResiduossolidoses(Set residuossolidoses) {
        this.residuossolidoses = residuossolidoses;
    }
    public Set getFormaciondepersonals() {
        return this.formaciondepersonals;
    }
    
    public void setFormaciondepersonals(Set formaciondepersonals) {
        this.formaciondepersonals = formaciondepersonals;
    }
    public Set getSubproductos() {
        return this.subproductos;
    }
    
    public void setSubproductos(Set subproductos) {
        this.subproductos = subproductos;
    }
    public Set getEmisiongaseosas() {
        return this.emisiongaseosas;
    }
    
    public void setEmisiongaseosas(Set emisiongaseosas) {
        this.emisiongaseosas = emisiongaseosas;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }
    public Set getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set domicilios) {
        this.domicilios = domicilios;
    }
    public Set getMateriaprimas() {
        return this.materiaprimas;
    }
    
    public void setMateriaprimas(Set materiaprimas) {
        this.materiaprimas = materiaprimas;
    }
    public Set getRiesgopresuntos() {
        return this.riesgopresuntos;
    }
    
    public void setRiesgopresuntos(Set riesgopresuntos) {
        this.riesgopresuntos = riesgopresuntos;
    }




}


