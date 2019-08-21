/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.ArrayList;
import org.w3c.dom.Node;

/**
 *
 * @author Admin
 */
//Clase para gestionar los datos dinámicos del formulario

public class MultipleDataController {
    public ArrayList<Node> nodes = new ArrayList<>();
    public FormController formController;
    
    public MultipleDataController(){
        this.formController = FormController.getInstance();
    }
    
    public ArrayList<ArrayList<String>> getActivitiesData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina1.P1P2.P1P2SP2.P1P2SP2.Actividad");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(Node n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            //Grupo
            formController.SimpleNodeSearcher(n,"HeaderGrupo.ACTGRAL", value);
            temp.add(value.toString());
            value.setLength(0);
            //Actividad
            formController.SimpleNodeSearcher(n,"HeaderActividad.ACTIVIDADES", value);
            temp.add(value.toString());
            value.setLength(0);
            //Prioridad
            formController.SimpleNodeSearcher(n,"HeaderTipoCodigoEstandar.TIPOACT", value);
            temp.add(value.toString());
            value.setLength(0);
            //CUACM
            formController.SimpleNodeSearcher(n,"HeaderTipoCodigoEstandar.CUACM", value);
            temp.add(value.toString());
            value.setLength(0);
            //Estandar
            formController.SimpleNodeSearcher(n,"HeaderTipoCodigoEstandar.ESTANDAR", value);
            temp.add(value.toString());
            value.setLength(0);
            
            data.add(temp);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getAutoritiesData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina2.P2P2.P2P2SP2.TablaAutoridades.Autoridades");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(Node n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            //Apellido
            formController.SimpleNodeSearcher(n,".ApellidoAutoridadesSocietarias", value);
            temp.add(value.toString());
            value.setLength(0);
            //Nombre
            formController.SimpleNodeSearcher(n,".NombreAutoridadesSocietarias", value);
            temp.add(value.toString());
            value.setLength(0);
            //Documento
            formController.SimpleNodeSearcher(n,".DocumentoAutoridadesSocietarias", value);
            temp.add(value.toString());
            value.setLength(0);
            //Cargo
            formController.SimpleNodeSearcher(n,".CargoAutoridadesSocietarias", value);
            temp.add(value.toString());
            value.setLength(0);
            
            data.add(temp);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getAdministratorsData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina2.P2P3.P2P3SP2.TablaAdministradores.Administradores");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(Node n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            //Apellido
            formController.SimpleNodeSearcher(n,".ApellidoAdministradores", value);
            temp.add(value.toString());
            value.setLength(0);
            //Nombre
            formController.SimpleNodeSearcher(n,".NombreAdministradores", value);
            temp.add(value.toString());
            value.setLength(0);
            //Documento
            formController.SimpleNodeSearcher(n,".DocumentoAdministradores", value);
            temp.add(value.toString());
            value.setLength(0);
            //Cargo
            formController.SimpleNodeSearcher(n,".CargoAdministradores", value);
            temp.add(value.toString());
            value.setLength(0);
            
            data.add(temp);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getPartidaData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina3.PartidaInmobiliaria.TablaPartidaInmobiliaria.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Node n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            //Numero de partida inmobiliaria
            formController.SimpleNodeSearcher(n,".NumPartidaInmobiliaria", value);
            temp.add(value.toString());
            value.setLength(0);
            //Latitud
            formController.SimpleNodeSearcher(n,".LatPartidaInmobiliaria", value);
            temp.add(value.toString());
            value.setLength(0);
            //Longitud
            formController.SimpleNodeSearcher(n,".LongPartidaInmobiliaria", value);
            temp.add(value.toString());
            value.setLength(0);
            
            data.add(temp);
        }
        return data;
    }
}
