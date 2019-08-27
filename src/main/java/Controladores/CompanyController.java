/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.*;
import java.util.List;

/**
 *
 * @author Admin
 */

//Clase para gestionar los datos de la empresa y de la planta en general
public class CompanyController {
    public FormController formcontroller;
    public MultipleDataController multiplecontroller;
    public Empresa company;
    public List<Actividad> activites;
    public Planta plant;
    public Domicilio address;
    public PartidaInmobiliaria partida;
    public Representante representanteLegal;
    public List<Representante> representantes;
    public List<Representante> autoridades;
    public FormacionDePersonal personal;
    public Perito perito;
    
    
    public CompanyController(){
        this.formcontroller = FormController.getInstance();
        this.multiplecontroller = MultipleDataController.getInstance();
    }
    
    public void instantiate (){
        //Acá se obtienen todos los datos mediante formcontroller y multiplecontroller
        try{
           String scuit = formcontroller.getSimpleDataForm("Pagina1.P1P1.Cuit1")+
                formcontroller.getSimpleDataForm("Pagina1.P1P1.Cuit2")+
                formcontroller.getSimpleDataForm("Pagina1.P1P1.Cuit3");
           Long cuit = Long.parseLong(scuit);
           System.out.println(cuit);
        }catch (EmptyException e){
            //will see
        }
    }

    public Empresa getCompany() {
        return company;
    }

    public void setCompany(Empresa company) {
        this.company = company;
    }

    public List<Actividad> getActivites() {
        return activites;
    }

    public void setActivites(List<Actividad> activites) {
        this.activites = activites;
    }

    public Planta getPlant() {
        return plant;
    }

    public void setPlant(Planta plant) {
        this.plant = plant;
    }

    public Domicilio getAddress() {
        return address;
    }

    public void setAddress(Domicilio address) {
        this.address = address;
    }

    public PartidaInmobiliaria getPartida() {
        return partida;
    }

    public void setPartida(PartidaInmobiliaria partida) {
        this.partida = partida;
    }

    public Representante getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(Representante representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public List<Representante> getRepresentantes() {
        return representantes;
    }

    public void setRepresentantes(List<Representante> representantes) {
        this.representantes = representantes;
    }

    public List<Representante> getAutoridades() {
        return autoridades;
    }

    public void setAutoridades(List<Representante> autoridades) {
        this.autoridades = autoridades;
    }

    public FormacionDePersonal getPersonal() {
        return personal;
    }

    public void setPersonal(FormacionDePersonal personal) {
        this.personal = personal;
    }

    public Perito getPerito() {
        return perito;
    }

    public void setPerito(Perito perito) {
        this.perito = perito;
    }
}
