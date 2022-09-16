/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author docente
 */
public class LibroDao {
    private List<Libro> lista = new ArrayList<>();

    public LibroDao() {
    }

    public void registrar(Libro l){
        lista.add(l);
    }

    public List<Libro> getLista() {
        return lista;
    }
    
}
