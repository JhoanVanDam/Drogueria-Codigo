/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *
 * @author Jhoan
 */
public class Rut implements Serializable{
    private String RUTA;
    
    
    public static boolean serializarObjeto(String direccionArchivo, Serializable objeto) {
        boolean sw = false;
        try (FileOutputStream fos = new FileOutputStream(direccionArchivo);
                ObjectOutputStream salida = new ObjectOutputStream(fos);) {
            salida.writeObject(objeto);
            sw = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sw;
    }

    public  <E> E deserializarObjeto(String direccionArchivo, Class<E> claseObjetivo) {
        E objeto = null;
        try (FileInputStream fis = new FileInputStream(direccionArchivo);
                ObjectInputStream entrada = new ObjectInputStream(fis);) {
            objeto = (E) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }
    public void Guardar(String DireccionArchivo, String objeto){
        serializarObjeto(DireccionArchivo, objeto);
    }
   
}
