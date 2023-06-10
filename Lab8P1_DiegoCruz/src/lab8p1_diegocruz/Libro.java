/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Libro {
    // declaracion atributos
    private String titulo;
    private String nombre;
    private int anio;
    
    //constructor base
    public Libro (){
        
    }
    
    // constructor con atributos
    public Libro (String tituloN, String nombreN, int anioN){
        
        this.titulo = tituloN;
        this.nombre = nombreN;
        this.anio = anioN;
                
        
        
    }
    
    //Aqui se encuentran los metodos get y set correspondientes de cada atributo
    public String getTitulo(){
        
        return this.titulo;
    }
    
    public void setTitulo(String tituloN){
        
        this.titulo = tituloN;
    }
   
     public String getnombre(){
        
        return this.nombre;
    }
    
    public void setnombre(String nombre){
        
        this.nombre = nombre;
    }
    
     public int getAnio(){
        
        return this.anio;
    }
    
    public void setAnio(int anioN){
        
        this.anio = anioN;
        
    }
    
    
}// fin class Libro
