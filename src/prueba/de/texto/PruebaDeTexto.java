/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.de.texto;
import java.io.File;
import java.io.FileWriter;



/**
 *
 * @author edanny
 */
public class PruebaDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String saludo="E danny Cari f";
       try{
           File archivo=new File("texto.txt");
           try (FileWriter escribir = new FileWriter(archivo,true)) {
               escribir.write(saludo);
           }
           System.out.println("Archivo Guardado correctamente: " +saludo);
           
       }catch(Exception e){
           System.out.println("Error Al Escribir");
           
       }
       

    }
    
}
