/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dir.inno.pub.data_extractor;

import Controladores.*;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String argv[]) {
 
      try {
            FormController formController = FormController.getInstance();
            formController.setPath("C:\\Users\\Admin\\Desktop\\Formulario de presentación v4.18 prueba 4 cerra3_datos.xml");
            formController.loadXML();
            MultipleDataController multipleDataController = MultipleDataController.getInstance();
//            ArrayList <Node> nodes = formcontroller.getComplexDataForm("Pagina1.P1P2.P1P2SP2.P1P2SP2.Actividad");
//            for (Node n: nodes){
//                System.out.println(n.getNodeName());
//            }
            ArrayList<ArrayList<String>> data = multipleDataController.getWastePData();
            if (!data.isEmpty()){
                for(ArrayList<String> s: data){
                System.out.println(s);
                }
            }
            else{
                System.out.println("VACIO NEGRI");
            }
            //System.out.println("Retorno: " + formcontroller.getSimpleDataForm("Pagina1.P1P1.RazonSocial"));
           
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
}
