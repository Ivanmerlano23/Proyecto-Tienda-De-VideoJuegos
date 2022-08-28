/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author melis
 */
import gui.FormMenu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class ArchiTienda {
    public void guardar(FormMenu j) throws FileNotFoundException, IOException{
        ObjectOutputStream salida= new ObjectOutputStream(new FileOutputStream("tienda.obj"));
        salida.writeObject(j);
        salida.close();
    }
    
    public FormMenu recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
       ObjectInputStream entrada= new ObjectInputStream(new FileInputStream("juego.obj"));
       FormMenu juego= (FormMenu) entrada.readObject();
               entrada.close();
               return juego;
    }
}
