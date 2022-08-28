/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import gui.FormInsertarFinal;
import gui.FormInsertarInicio;
import gui.FormMenu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanf
 */
public class ManejoCuentas {
    private ArrayList<Cuenta> mc=new ArrayList<>();
    listaDoble<VideoJuego> vid;
    Cuenta cue;
    public void addCuenta(Cuenta x){
        mc.add(x);
    }
    
    public void acceso(String u, String c){
        for (int i = 0; i < mc.size(); i++) {
            Cuenta get = mc.get(i);
            if(get.getUsuario().equals(u)&&(get.getContraseña().equals(c))){
                FormMenu fm=new FormMenu();
                fm.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos, Porfavor Rectifique su nombre de usuario o contraseña! ");
            }
            
        }
    }
    
    
    
}
