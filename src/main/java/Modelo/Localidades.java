package Modelo;
// Generated 16-ago-2019 12:36:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Localidades generated by hbm2java
 */
public class Localidades  implements java.io.Serializable {


     private int id;
     private Departamentos departamentos;
     private Nodos nodos;
     private String nombreLocalidad;
     private String categoria;
     private String codigoPostal;
     private Set domicilios = new HashSet(0);

    public Localidades() {
    }

	
    public Localidades(int id, Departamentos departamentos, Nodos nodos, String nombreLocalidad, String categoria, String codigoPostal) {
        this.id = id;
        this.departamentos = departamentos;
        this.nodos = nodos;
        this.nombreLocalidad = nombreLocalidad;
        this.categoria = categoria;
        this.codigoPostal = codigoPostal;
    }
    public Localidades(int id, Departamentos departamentos, Nodos nodos, String nombreLocalidad, String categoria, String codigoPostal, Set domicilios) {
       this.id = id;
       this.departamentos = departamentos;
       this.nodos = nodos;
       this.nombreLocalidad = nombreLocalidad;
       this.categoria = categoria;
       this.codigoPostal = codigoPostal;
       this.domicilios = domicilios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public Nodos getNodos() {
        return this.nodos;
    }
    
    public void setNodos(Nodos nodos) {
        this.nodos = nodos;
    }
    public String getNombreLocalidad() {
        return this.nombreLocalidad;
    }
    
    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public Set getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set domicilios) {
        this.domicilios = domicilios;
    }




}

