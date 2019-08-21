/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.ArrayList;
import org.xml.sax.SAXException;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Admin
 */
//Clase para gestionar los datos dinámicos del formulario

public class MultipleDataController {
    //Attributes
    public ArrayList<Element> nodes = new ArrayList<>();
    public FormController formController;
    
    //Public constructor
    public MultipleDataController(){
        this.formController = FormController.getInstance();
    }
    //Método para obtener las actividades de la empresa
    public ArrayList<ArrayList<String>> getActivitiesData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina1.P1P2.P1P2SP2.P1P2SP2.Actividad");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
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
            }catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los datos de las autoridades de la empresa
    public ArrayList<ArrayList<String>> getAutoritiesData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina2.P2P2.P2P2SP2.TablaAutoridades.Autoridades");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
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
            }catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los datos de los administradores/representantes de la empresa
    public ArrayList<ArrayList<String>> getAdministratorsData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina2.P2P3.P2P3SP2.TablaAdministradores.Administradores");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
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
            }catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los números de partidas junto con su latitud y longitud
    public ArrayList<ArrayList<String>> getPartidaData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina3.PartidaInmobiliaria.TablaPartidaInmobiliaria.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try {
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
            }catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los domicilios de las plantas fuera de la provincia
    public ArrayList<ArrayList<String>> getPlantAddressData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina4.P4P3.P4P3SP2.TablaPlantasFueraProv.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
                //Primero comprobamos el valor del radio button
                String rbPlantasFueraDeProv = this.formController.getSimpleDataForm("Pagina4.P4P3.P4P3SP1.RBPlantasFueraProv");
                if(rbPlantasFueraDeProv.equals("2"))throw new EmptyException("NO");
               //Domicilio de la planta fuera de la provincia
                formController.SimpleNodeSearcher(n,".DomicilioPlantaFueraProvincia", value);
                temp.add(value.toString());
                value.setLength(0);
                //Provincia de la planta fuera de la provincia
                formController.SimpleNodeSearcher(n,".PROVINCIAPlantaFueraProvincia", value);
                temp.add(value.toString());
                value.setLength(0);
                //Localidad de la planta fuera de la provincia
                formController.SimpleNodeSearcher(n,".LocalidadPlantaFueraProvincia", value);
                temp.add(value.toString());
                value.setLength(0);
                //CP de la planta fuera de la provincia
                formController.SimpleNodeSearcher(n,".CodigoPostalPlantaFueraProvincia", value);
                temp.add(value.toString());
                value.setLength(0);

                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
                if(ex.getMessage().equals("NO")) break;
                
            }
            
        }
        return data;
    }
    //Método para obtener los datos de los productos de la empresa
    public ArrayList<ArrayList<String>> getProductData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina4.P4P5.P4P5SP2.Table1.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        ArrayList<Element> tempNodes = this.formController.getComplexDataForm("Pagina5.P5P1.P5P1SP2.Table1.Row11");
        int index = 0;
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
               //Nombre
                formController.SimpleNodeSearcher(n,".NombreProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Estado Fisico
                formController.SimpleNodeSearcher(n,".EstadoFisicoProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Produccion Anual
                formController.SimpleNodeSearcher(n,".ProduccionAnualProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Unidad de la produccion anual
                formController.SimpleNodeSearcher(n,".UnidadProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Almacenamiento del producto
                formController.SimpleNodeSearcher(n,".AlmacenamientoProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Clasificación de producto
                formController.SimpleNodeSearcher(tempNodes.get(index),".ClasificacionProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Clasificación de producto
                formController.SimpleNodeSearcher(tempNodes.get(index),".OtraClasificacionProducto", value);
                temp.add(value.toString());
                value.setLength(0);
                
                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            index++;
            
        }
        return data;
    }
    //Método para obtener los datos de los subproductos de la empresa
    public ArrayList<ArrayList<String>> getSubProductData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina5.P5P3.P5P3SP2.Table1.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
               //Nombre
                formController.SimpleNodeSearcher(n,".NombreSubproducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Estado Fisico
                formController.SimpleNodeSearcher(n,".EstadoFisicoSubproducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Produccion Anual
                formController.SimpleNodeSearcher(n,".ProduccionAnualSubproducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Unidad de la produccion anual
                formController.SimpleNodeSearcher(n,".UnidadSubproducto", value);
                temp.add(value.toString());
                value.setLength(0);
                //Almacenamiento del subproducto
                formController.SimpleNodeSearcher(n,".AlmacenamientoSubproducto", value);
                temp.add(value.toString());
                value.setLength(0);
                
                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los datos de las materias primas de la empresa
    public ArrayList<ArrayList<String>> getRawMaterialData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina5.P5P4.P5P4SP2.Table1.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
               //Nombre
                formController.SimpleNodeSearcher(n,".NombreMateriaPrima", value);
                temp.add(value.toString());
                value.setLength(0);
                //Estado Fisico
                formController.SimpleNodeSearcher(n,".EstadoFisicoMateriaPrima", value);
                temp.add(value.toString());
                value.setLength(0);
                //Consumo Anual
                formController.SimpleNodeSearcher(n,".ConsumoAnualMateriaPrima", value);
                temp.add(value.toString());
                value.setLength(0);
                //Unidad del consumo anual
                formController.SimpleNodeSearcher(n,".UnidadMateriaPrima", value);
                temp.add(value.toString());
                value.setLength(0);
                //Almacenamiento de la materia prima
                formController.SimpleNodeSearcher(n,".AlmacenamientoMateriaPrima", value);
                temp.add(value.toString());
                value.setLength(0);
                
                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los datos de los insumos utilizados en la empresa empresa
    public ArrayList<ArrayList<String>> getInputData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina5.P5P5.P5P5SP2.Table1.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
               //Nombre
                formController.SimpleNodeSearcher(n,".NombreInsumo", value);
                temp.add(value.toString());
                value.setLength(0);
                //Estado Fisico
                formController.SimpleNodeSearcher(n,".EstadoFisicoInsumo", value);
                temp.add(value.toString());
                value.setLength(0);
                //Consumo Anual
                formController.SimpleNodeSearcher(n,".ConsumoAnualInsumo", value);
                temp.add(value.toString());
                value.setLength(0);
                //Unidad del consumo anual
                formController.SimpleNodeSearcher(n,".UnidadInsumo", value);
                temp.add(value.toString());
                value.setLength(0);
                //Almacenamiento del insumo
                formController.SimpleNodeSearcher(n,".AlmacenamientoInsumo", value);
                temp.add(value.toString());
                value.setLength(0);
                
                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
            }
            
        }
        return data;
    }
    //Método para obtener los datos de las sustancias auxiliares utilizados en la empresa empresa
    public ArrayList<ArrayList<String>> getAuxSubstanceData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina6.P6P3.P6P3SP2.TablaSustanciasAuxiliares.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
                String rbCombustibles = this.formController.getSimpleDataForm("Pagina6.P6P3.P6P3SP1.RBCombustiblesLiquidos");
                String rbGasNatural = this.formController.getSimpleDataForm("Pagina6.P6P3.P6P3SP1.RBGasNatural");
                String rbAceitesyLubricantes = this.formController.getSimpleDataForm("Pagina6.P6P3.P6P3SP1.RBAceitesYLubricantes");
                String rbAireComprimido = this.formController.getSimpleDataForm("Pagina6.P6P3.P6P3SP1.RBAireComprimido");
                if (rbCombustibles.equals("0") && rbGasNatural.equals("0") &&
                    rbAceitesyLubricantes.equals("0") && rbAireComprimido.equals("0")) throw new EmptyException("NO");
                //Nombre
                formController.SimpleNodeSearcher(n,".NombreSustanciasAuxiliaresYFluidos", value);
                temp.add(value.toString());
                value.setLength(0);
                //Consumo Anual
                formController.SimpleNodeSearcher(n,".ConsumoAnualSustanciasAuxiliares", value);
                temp.add(value.toString());
                value.setLength(0);
                //Unidad del consumo anual
                formController.SimpleNodeSearcher(n,".UnidadSustanciasAuxiliares", value);
                temp.add(value.toString());
                value.setLength(0);
                //Almacenamiento de la sustancia auxiliar
                formController.SimpleNodeSearcher(n,".AlmacenamientoSustanciasAuxiliares", value);
                temp.add(value.toString());
                value.setLength(0);
                
                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
                if(ex.getMessage().equals("NO")) break;
            }
            
        }
        return data;
    }
    //Método para obtener los datos de los inmuebles anexos de la empresa empresa
    public ArrayList<ArrayList<String>> getAnnexPropertyData(){
        this.nodes.clear();
        this.nodes = this.formController.getComplexDataForm("Pagina7.P7P2.P7P2SP2.T34.Row1");
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        //System.out.println(this.nodes);
        for(Element n: nodes){
            ArrayList <String> temp= new ArrayList<>();
            StringBuilder value = new StringBuilder();
            try{
                String rbInmueblesAnexos = this.formController.getSimpleDataForm("Pagina7.P7P2.P7P2SP1.RBInmueblesAnexos");
                if (rbInmueblesAnexos.equals("0"))throw new EmptyException("NO");
                //Domicilio
                formController.SimpleNodeSearcher(n,".DomicilioInmueblesAnexos", value);
                temp.add(value.toString());
                value.setLength(0);
                //Actividad
                formController.SimpleNodeSearcher(n,".ActividadInmueblesAnexos", value);
                temp.add(value.toString());
                value.setLength(0);
                
                data.add(temp); 
            } catch(EmptyException ex){
                if(!temp.isEmpty()) data.add(temp);
                System.out.println(ex.getMessage());
                if(ex.getMessage().equals("NO")) break;
            }
            
        }
        return data;
    }
//End of class
}
