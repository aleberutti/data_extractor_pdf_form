/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dir.inno.pub.data_extractor;

import Controladores.FileController;
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
         FileController inputFile = new FileController("C:\\Users\\Admin\\Desktop\\Formulario de presentación v4.17 PRUEBA cerra3_datos.xml");
         inputFile.cargar();
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile.getArchivo());
         doc.getDocumentElement().normalize();
         System.out.print("Root element: ");
         System.out.println(doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("P1P1");
         System.out.println("----------------------------");
         
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
//            System.out.println("\nCurrent Element :");
            System.out.println(nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
//               System.out.print("company : ");
//               System.out.println(eElement.getAttribute("company"));
               NodeList carNameList = eElement.getElementsByTagName("RazonSocial");
               
               for (int count = 0; count < carNameList.getLength(); count++) {
                  Node node1 = carNameList.item(count);
                  
                  if (node1.getNodeType() == node1.ELEMENT_NODE) {
                     Element car = (Element) node1;
                     System.out.print("Razon Social: ");
                     System.out.println(car.getTextContent());
//                     System.out.print("car type : ");
//                     System.out.println(car.getAttribute("type"));
                  }
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
}
