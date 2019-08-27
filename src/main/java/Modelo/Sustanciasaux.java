package Modelo;
// Generated 27-ago-2019 12:41:28 by Hibernate Tools 4.3.1



/**
 * Sustanciasaux generated by hbm2java
 */
public class Sustanciasaux  implements java.io.Serializable {


     private Integer idSustancias;
     private boolean combustiblesLiquidos;
     private boolean aireComprimido;
     private boolean gasNatural;
     private boolean aceitesYlubricantes;
     private int idPlanta;

    public Sustanciasaux() {
    }

    public Sustanciasaux(boolean combustiblesLiquidos, boolean aireComprimido, boolean gasNatural, boolean aceitesYlubricantes, int idPlanta) {
       this.combustiblesLiquidos = combustiblesLiquidos;
       this.aireComprimido = aireComprimido;
       this.gasNatural = gasNatural;
       this.aceitesYlubricantes = aceitesYlubricantes;
       this.idPlanta = idPlanta;
    }
   
    public Integer getIdSustancias() {
        return this.idSustancias;
    }
    
    public void setIdSustancias(Integer idSustancias) {
        this.idSustancias = idSustancias;
    }
    public boolean isCombustiblesLiquidos() {
        return this.combustiblesLiquidos;
    }
    
    public void setCombustiblesLiquidos(boolean combustiblesLiquidos) {
        this.combustiblesLiquidos = combustiblesLiquidos;
    }
    public boolean isAireComprimido() {
        return this.aireComprimido;
    }
    
    public void setAireComprimido(boolean aireComprimido) {
        this.aireComprimido = aireComprimido;
    }
    public boolean isGasNatural() {
        return this.gasNatural;
    }
    
    public void setGasNatural(boolean gasNatural) {
        this.gasNatural = gasNatural;
    }
    public boolean isAceitesYlubricantes() {
        return this.aceitesYlubricantes;
    }
    
    public void setAceitesYlubricantes(boolean aceitesYlubricantes) {
        this.aceitesYlubricantes = aceitesYlubricantes;
    }
    public int getIdPlanta() {
        return this.idPlanta;
    }
    
    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }




}


