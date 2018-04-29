/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Windows10
 */
public class ListaLibros {
    private ArrayList <Libro> listadoLibros;

    public ListaLibros() {
        listadoLibros=new ArrayList();
    }

    public ListaLibros(ArrayList<Libro> listaLibros) {
        this.listadoLibros = listaLibros;
    }

    /**
     * @return the listadoLibros
     */
    public ArrayList <Libro> getListadoLibros() {
        return listadoLibros;
    }

    /**
     * @param listadoLibros the listadoLibros to set
     */
    public void setListadoLibros(ArrayList <Libro> listadoLibros) {
        this.listadoLibros = listadoLibros;
    }
}
