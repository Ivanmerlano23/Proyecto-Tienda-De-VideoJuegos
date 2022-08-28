/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ivanf
 */
public class NodoD<E> {
    public E dato;
    public NodoD<E> sig;
    public NodoD<E> ant;

    public NodoD(E dato) {
        this.dato = dato;
    }
    
}
