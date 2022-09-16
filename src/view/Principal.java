/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Libro;
import model.LibroDao;

/**
 *
 * @author docente
 */
public class Principal {
 static Scanner sc = new Scanner(System.in);
 static List<Libro> lista = new ArrayList<>();
 static LibroDao dao = new LibroDao();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p;
        p = menu();
        switch(p){
            case 1: crear();listar();
                    break;
            case 2: listar();break;
            case 3: System.exit(0);
        }
        
    }
    static void crear(){
        Libro libro = new Libro();
        System.out.println("Datos del Libro:");
        System.out.println("Titulo");
        libro.setTitulo(sc.next());
        libro.setAutor(sc.next());
        libro.setNpaginas(sc.nextInt());
        libro.setEditorial(sc.next());
        dao.registrar(libro);
    }
    static void listar(){
        lista = dao.getLista();
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getTitulo());
        }
    }
    static int menu(){
        int op;
        System.out.println("********MENU********");
        System.out.println("[1]. Regitrar");
        System.out.println("[2]. Listar");
        System.out.println("[3]. Salir");
        System.out.println("Opcion?:");
        op = sc.nextInt();
        return op;
    }
    
}
