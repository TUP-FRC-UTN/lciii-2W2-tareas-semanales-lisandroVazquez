/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dada
 */
public class Biblioteca {
    
    Libro libros[];
    
    public Biblioteca(int cantidadLibros){
        this.libros = new Libro[cantidadLibros];
    }
    
    public void agregarLibro(Libro nuevoLibro){
        for(int i = 0; i < libros.length; i++){
            if(libros[i]== null){
                libros[i] = nuevoLibro;
                break;
            } 
        }
    }
    
    public int cantidadLibros(){
        int contador = 0;
        for(int i = 0; i < libros.length; i++){
            if(libros[i]== null){
                contador++;
            } 
        }return contador;
    }
    
    public String librosPorEstado(){
        int[] contadorPosiciones = new int[3];
        for(int i = 0; i < libros.length; i++){
            if(libros[i]== null){
                switch (libros[i].getEstado()){
                    case 1: contadorPosiciones[0]++;
                    break;
                    case 2: contadorPosiciones[1]++;
                    break;
                    case 3: contadorPosiciones[2]++;
                    break;
                    
                }
            } 
        }return "\nDisponibles: " + contadorPosiciones[0] + "\nPrestados: " + contadorPosiciones[1] + "\nPerdidos: " + contadorPosiciones[2];
    }
    
    public float promedioPrestamo(){
        int acumulador = 0;
        int contador = 0;
        for(int i = 0; i < libros.length; i++){
            if(libros[i] != null){
                acumulador += libros[i].cantidadPrestamos();
                contador++;
            } 
        }return (float) acumulador / contador;
    }
    
    public float totalExtraviado(){
        float acumulador = 0f;
        for(int i = 0; i < libros.length; i++){
            if(libros[i] != null && libros[i].getEstado() == 3){
                acumulador += libros[i].getPrecio();
            } 
        }return acumulador;
    }
}
