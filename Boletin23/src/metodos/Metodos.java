/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import com.cristian.PedirDatos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author crist
 */
public class Metodos {
    public ArrayList<Libro> engadirLibros(ArrayList<Libro> aux){
        int num = PedirDatos.pedirInt("Teclee o numero de libros distintos a engadir");
        for(int i = 0; i < num; i++){
            Libro obx = new Libro(PedirDatos.pedirString("Libro nº" + (i+1) + "\nCal é o seu título?"), PedirDatos.pedirString("Libro nº" + (i+1) + "\nQuen é o autor?"), PedirDatos.pedirString("Libro nº" + (i+1) + "\nCal é o seu ISBN?"), PedirDatos.pedirFloat("Libro nº" + (i+1) + "\nCal é o seu prezo?"), PedirDatos.pedirInt("Libro nº" + (i+1) + "\nCantas unidades a engadir?"));
            while(obx.getUnidades() < 1){
                obx.setUnidades(PedirDatos.pedirInt("Unidad incorrecta, non pode ser menor a 1\nIntentelo de novo"));
            }
            aux.add(obx);
        }
        return aux;
    }
    /**
     * @param aux
     * @param titulo: titulo del libro a vender 
     */
    public void venderLibro(ArrayList<Libro> aux, String titulo){
        Iterator it = aux.iterator();
        Libro li;
        int bandera = 0;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getTitulo().equalsIgnoreCase(titulo) && li.getUnidades() == 0){
                System.out.println("No se puede vender este libro por que no tiene unidades, por favor dé de baixa os libros");
                bandera = 1;
            }
            else if(li.getTitulo().equalsIgnoreCase(titulo) && li.getUnidades() > 0){
                li.setUnidades((li.getUnidades()-1));
                System.out.println("Se ha vendido una unidad de " + li.getTitulo() + " qudan " + li.getUnidades() + " unidades");
                bandera = 1;
            }
        }
        if(bandera == 0){
            System.out.println("Libro no encontrado");
        }
    }
    
    public void amosarLibros(ArrayList<Libro> aux){
        Collections.sort(aux);
        for(Libro elemento : aux){
            System.out.println(elemento);
        }
    }
    
    public void darDeBaixa(ArrayList<Libro> aux){
        Iterator it = aux.iterator();
        Libro li;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getUnidades() == 0){
                System.out.println(li.getTitulo() + " ha sido borrado");
                it.remove();
            }
        }
    }
    
    /**
     * @param aux
     * @param titulo: titulo del libro a consultar
     */
    public void consultarLibro(ArrayList<Libro> aux, String titulo){
        Iterator it = aux.iterator();
        Libro li;
        int bandera = 0;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(li.toString());
                bandera = 1;
            }
        }
        if(bandera == 0){
            System.out.println(titulo + " no encontrado");
        }
    }

  
    
}
