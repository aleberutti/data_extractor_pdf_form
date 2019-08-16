/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dir.inno.pub.data_extractor;

import Controladores.*;
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
            FormController formcontroller = new FormController("C:\\Users\\Admin\\Desktop\\Formulario de presentación v4.18 prueba 1 cerra3_datos.xml");
            System.out.println("Retorno: " + formcontroller.getSimpleDataForm("Pagina1.P1P1.RazonSocial"));
           
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
}
