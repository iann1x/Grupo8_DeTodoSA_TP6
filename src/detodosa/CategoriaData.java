package detodosa;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class CategoriaData {
    public ArrayList<Categoria> obtenerCategorias(){
     
        ArrayList<Categoria> lista=new ArrayList<>();
        lista.add(new Categoria(1,"Perfumeria"));
        lista.add(new Categoria(2,"Limpieza"));
        lista.add(new Categoria(3,"Comestible"));
        
        return lista;
        
        
    }
}
