package Ex_puntuable;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import Ex_puntuable.Personatge;

class Parser 
{
    /*Vamos a intentar leer y procesar el xml */
    public static void main(String[] args) throws Exception
    {
        try
        {    File xml = new File ("personatges.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(xml);
            //Obtenir tots els nodes del document anomenats "Personaje"
            NodeList nodeList = document.getElementsByTagName("Personaje");

            /*Creamos una matriz para almacenar los detalles de los personajes */
            String[][] detallsPersonatges = new String[nodeList.getLength()][4];

            /*cargamos los datos en la matriz */
            for (int i = 0; i < nodeList.getLength(); i++) 
            {
                Element element = (Element) nodeList.item(i);
                detallsPersonatges[i][0] = element.getAttribute("nom");
                detallsPersonatges[i][1] = element.getAttribute("nivell");
                detallsPersonatges[i][2] = element.getAttribute("puntsvida");
                detallsPersonatges[i][3] = element.getAttribute("puntsmana");
            }   
            /*Mostrar los elemntos */
            for (String[] detalls : detallsPersonatges)
            {
                System.out.println("Nom: "+detalls[0] + ",Nivell: "+detalls[1]+",Puntsvida: "+detalls[2]+",Puntsmana: "+detalls[3]);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error en la lectura del document: " + ex);
            throw ex;
        }

    }
}
