/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Libro;
import modelo.ListaLibros;

/**
 *
 * @author Windows10
 */
@ManagedBean
@RequestScoped
public class LibroFormBean {
    private Libro unLibro;
    private ListaLibros listaLibro;
    private int isbn;
    private String titulo;
    private String autor;
    private float precio;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public LibroFormBean() {
        unLibro=new Libro();
        listaLibro=new ListaLibros();
    }
    public void almacenarLibro(){
        setUnLibro(new Libro (getIsbn(), getTitulo(), getAutor(), getPrecio()));
        getListaLibro().getListadoLibros().add(getUnLibro());
    }

    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }


    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the listaLibro
     */
    public ListaLibros getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ListaLibros listaLibro) {
        this.listaLibro = listaLibro;
    }
    
}
