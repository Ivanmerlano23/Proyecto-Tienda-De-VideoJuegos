/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanf
 */
public class listaDoble<E> implements Lista<E>{
    private NodoD<E> ptr;
    private NodoD<E> ult;
    int cantidad=0;
    @Override
    public void insertarFin(E x) {
        NodoD<E> nuevo=new NodoD<>(x);
        if(listaVacia()){
            ptr=ult=nuevo;
        }else{
            ult.sig=nuevo;
            nuevo.ant=ult;
            ult=nuevo;
        }
        cantidad++;
    }

    @Override
    public void insertarInicio(E x) {
        NodoD<E> nuevo=new NodoD<>(x);
        if(listaVacia()){
            ptr=ult=nuevo;
        }else{
            ptr.ant=nuevo;
            nuevo.sig=ptr;
            ptr=nuevo;
        }
        cantidad++;
    }

    @Override
    public void eliminarInicio() {
        if(!listaVacia()){
            if(ptr==ult){
                ptr=ult=null;
            }else{
               NodoD<E> p=ptr;
               ptr=p.sig;
               ptr.ant=null;
               p.sig=null;
            }
        }
        cantidad--;
    }

    @Override
    public void eliminarFin() {
        if(!listaVacia()){
            if(ptr==ult){
                ptr=ult=null;
            }else{
               NodoD<E> p=ult;
                ult=p.ant;
                ult.sig=null;
                p.ant=null;
            }
        }
        cantidad--;
    }

    @Override
    public int cantidad() {
       return cantidad;
    }

    @Override
    public boolean buscar(E x) {
        boolean encontrado=false;
        NodoD<E> p=ptr;
        if(!listaVacia()){
            while(p!=null){
                if(p.dato==x){
                    return encontrado=true;
                }else{
                   return encontrado=false;  
                }
                
            }
            p=p.sig;
            
        }
        return encontrado;
                
    }

    @Override
    public E obtener(int pos) {
        NodoD<E> p=ptr;
        int c=0;
        if(pos<cantidad()){
            while (p!=null) {                
                if(c==pos){
                    return p.dato;
                }
                c++; p=p.sig;
            }
        }
        return null;
    }

    @Override
    public void eliminar(E x) {
        if(!listaVacia()){
            if(ptr.dato.equals(x)){
                eliminarInicio();
            }else{
                NodoD<E> p=ptr;
                NodoD<E> q=ult;
                while(p!=null){
                    if(p.dato.equals(x)){
                        q.sig=p.sig;
                        break;
                    }
                }
            }
        }
        cantidad--;
    }

    @Override
    public boolean listaVacia() {
       return (ptr==null);
    }

    @Override
    public String toString() {
        String lis="";
        NodoD<E> p=ptr;
        while(p!=null){
         lis+=" "+p.dato.toString()+" \n";
         p=p.sig;
        }
        return lis;
    }
   public void filtrarNombre(String nombre){
        
     String lis="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getNonmbre().equals(nombre)){
               lis+=" "+get.toString()+"\n";
               JOptionPane.showMessageDialog(null, lis);
           }else{
               if(get.getNonmbre()!=nombre){
                   JOptionPane.showMessageDialog(null, "No se encontraron resultados");
               }
           }
       }
        
   }
   
    public String filtrarAño(int año){
       String lis="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getAño()== año){
               lis+=" "+get.toString()+"\n";
           }else{
               lis+="No se encontraron resultados";
           }
           
       }
       return lis;
   }
    
     public String filtrarEP(int edadPermitida){
       String lis="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getEdadPermitida()== edadPermitida){
               lis+=" "+get.toString()+"\n";
           }else{
               lis+="No se encontraron resultados";
           }
           
       }
       return lis;
   }
     
    public String filtrarEmpresa(String empresa){
       String lis="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getEmpresa().equals(empresa)){
               lis+=" "+get.toString()+"\n";
           }else{
               lis+="No se encontraron resultados";
           }
           
       }
       return lis;
   }
    
     public String filtrarCalidad(String calidad){
       String lis="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getCalidad().equals(calidad)){
               lis+=" "+get.toString()+"\n";
           }else{
               lis+="No se encontraron resultados";
           }
           
       }
       return lis;
   }
     
      public String filtrarGenero(String genero){
       String lis="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getTipoGenero().equals(genero)){
               lis+=" "+get.toString()+"\n";
           }else{
               lis+="No se encontraron resultados";
           }
           
       }
       return lis;
   }
      
       public String filtrarPlataforma(String plataforma){
       String lis=" ";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getPlataforma().equals(plataforma)){
               lis+=" "+get.toString()+"\n";
           }else{
               lis+="No se encontraron resultados";
           }
           
       }
       return lis;
   }
       
   public String comprar(String nombre){
       String mensaje="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getNonmbre().equals(nombre)){
               eliminar(obtener(i));
               mensaje="Videojuego comprado con exito! ";
           }else{
               mensaje="No se encontró el Videojuego ";
           }
           
       }
       cantidad--;
       return mensaje;
   }
   
   public String buscarCo(String nombre, String plataforma){
       String m="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           buscar((E) get);
           if(get.getNonmbre().equals(nombre)&&(get.getPlataforma().equals(plataforma))){
                 m="Video juego encontrado";
           }else{
                 m="No se encuentra este videojuego";
           }
           
       }
       return m;
   }
   public String eliminar(String nombre, String plataforma){
       String m="";
       for (int i = 0; i < cantidad(); i++) {
           VideoJuego get = (VideoJuego) obtener(i);
           if(get.getNonmbre().equals(nombre)&&(get.getPlataforma().equals(plataforma))){
               eliminar(obtener(i));
               m="Videojuego Eliminado";
           }else{
               m="No se encontraron resultados";
           }
           
       }
       return m;
   }
    
    
    
    
}
