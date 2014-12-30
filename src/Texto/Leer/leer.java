/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Texto.Leer;
import java.io.FileReader;
import java.io.BufferedReader;


public class leer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto="";
        try
        {
           FileReader lector=new FileReader("texto.txt");
           BufferedReader contenido=new BufferedReader(lector);
           while((texto=contenido.readLine())!=null)
           {
                System.out.println("El Archivo Encontrado es:");
               System.out.println(texto);
              
           }
        }
        catch(Exception e)
{
System.out.println("Error al leer");
}
        
    }
    
}
