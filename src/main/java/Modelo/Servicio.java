package Modelo;
// Generated 13-ago-2019 9:35:52 by Hibernate Tools 4.3.1



/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private Integer idServicios;
     private boolean energiaElectrica;
     private boolean cloacas;
     private boolean aguaRed;
     private boolean gasNatural;
     private int idPlanta;

    public Servicio() {
    }

    public Servicio(boolean energiaElectrica, boolean cloacas, boolean aguaRed, boolean gasNatural, int idPlanta) {
       this.energiaElectrica = energiaElectrica;
       this.cloacas = cloacas;
       this.aguaRed = aguaRed;
       this.gasNatural = gasNatural;
       this.idPlanta = idPlanta;
    }
   
    public Integer getIdServicios() {
        return this.idServicios;
    }
    
    public void setIdServicios(Integer idServicios) {
        this.idServicios = idServicios;
    }
    public boolean isEnergiaElectrica() {
        return this.energiaElectrica;
    }
    
    public void setEnergiaElectrica(boolean energiaElectrica) {
        this.energiaElectrica = energiaElectrica;
    }
    public boolean isCloacas() {
        return this.cloacas;
    }
    
    public void setCloacas(boolean cloacas) {
        this.cloacas = cloacas;
    }
    public boolean isAguaRed() {
        return this.aguaRed;
    }
    
    public void setAguaRed(boolean aguaRed) {
        this.aguaRed = aguaRed;
    }
    public boolean isGasNatural() {
        return this.gasNatural;
    }
    
    public void setGasNatural(boolean gasNatural) {
        this.gasNatural = gasNatural;
    }
    public int getIdPlanta() {
        return this.idPlanta;
    }
    
    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }




}


