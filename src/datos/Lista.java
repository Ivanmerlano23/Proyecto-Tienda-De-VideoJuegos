/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Administrador
 */
public interface Lista <E> {
    void insertarFin(E x);
    void insertarInicio(E x);
    void eliminarInicio();
    void eliminarFin();
    int cantidad();
    boolean buscar (E x);
    E obtener(int pos);
    void eliminar(E x);
    boolean listaVacia();
}
