/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_diegocruz;
import java.util.Scanner;

/**
 *
 * @author dfcm9
 */
public class Lab8P1_DiegoCruz {
    
    static Scanner sc = new Scanner(System.in);
    static Scanner sc_st = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro [][] libguar = null; // declaracion de matriz global para ser usada en ambos case
        int count = 0;// contador de validacion
        boolean resp = true;
        while (resp){
            System.out.println("Menu Lab 8 - Libreria");
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Modificar Libro");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            if (opcion == 1){
                count=1;
            }
            switch(opcion){
                case 1:
                {
                    libguar = llenarLibrero();
                    System.out.println("El librero completo es: ");
                    Imprimirlibro(libguar);
                    break;
                }
                case 2:
                {
                    String tituloA, nombreA;
                    int anioA;
            
                    if (count <1){
                        System.out.println("Disculpe estimado/a, usted no ha ingresado libros. Por favor llene el librero (Opcion 1) primero.");
                    }
                    else{
                        System.out.println("Ingrese el titulo del libro");
                        tituloA = sc_st.nextLine();
                        
                        System.out.println("Ingrese el escritor");
                        nombreA = sc_st.nextLine();
                        
                        System.out.println("Ingrese el año de publicacion");
                        anioA = sc.nextInt();
                        while (anioA < 0){
                            System.out.println("Este año no es valido. Intente de nuevo");
                            anioA = sc.nextInt();
                        }
                        
                        libguar = ModificarLibro(tituloA,nombreA,anioA,libguar);
                        
                        System.out.println("");
                        System.out.println("El librero ha quedado con los siguientes contenidos: ");
                        Imprimirlibro(libguar);

                    }
                    break;


                }
                case 3:
                {
                    resp = false;
                    break;

                }
                default:
                {
                    System.out.println("La opcion es invalida. Intente de nuevo.");
                    break;
                }
            }
            
        }
        
    
        // TODO code application logic here
    }
    
    public static Libro[][] llenarLibrero(){
        System.out.println("Ingrese la cantidad de filas para el librero:");
        int filas = sc.nextInt();
        while (filas < 1){//validacion filas
            System.out.println("Este numero de filas no es valido. Intente de nuevo.");
            filas = sc.nextInt();
        }
        
        System.out.println("Ingrese la cantidad de columnas para el librero:");
        int columnas = sc.nextInt();
        while (columnas < 1){//validacion columnas
            System.out.println("Este numero de columnas no es valido. Intente de nuevo.");
            columnas = sc.nextInt();
        }
        
        Libro[][] librero= new Libro[filas][columnas];
        String tituloL, nombreL;
        int anioL;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
               
                System.out.println("Ingrese el titulo del libro:");
                tituloL = sc_st.nextLine();
                
                System.out.println("Ingrese el escritor:");
                nombreL = sc_st.nextLine();
                
                System.out.println("Ingrese el año de publicacion:");
                anioL = sc.nextInt();
                while (anioL < 0){
                    System.out.println("Este año no es valido. Intente de nuevo");
                    anioL = sc.nextInt();
                }
                        
                Libro L = new Libro(tituloL, nombreL, anioL);
                
                librero[i][j] = L;// Asignacion de cada libro a cada posicion de la matriz de libros, osea el librero
                
                System.out.println("El libro fue añadido exitosamente.");
                System.out.println("");
            }
            
        }      

        return librero;
}
    
    public static void Imprimirlibro (Libro [][] librero1){ //Metodo imprimir para mostrar los nombres de los libros con el metodo get
        for (int i = 0; i < librero1.length; i++) {
            for (int j = 0; j < librero1[i].length; j++) {
                System.out.print("[ "+librero1[i][j].getTitulo()+" ] ");      
            }
            System.out.println("");
            
        }
        
    }
    
    public static Libro[][] ModificarLibro(String titulo, String nombre, int anio, Libro[][] matlibro){
        Libro [][] libreriamod = matlibro;
        String newtitulo, newnombre;
        int newanio;
        boolean encontro = false;
        for (int i = 0; i < matlibro.length; i++) {
            for (int j = 0; j < matlibro[i].length; j++) {

                if (titulo.equals(matlibro[i][j].getTitulo()) && nombre.equals(matlibro[i][j].getnombre())&& (anio == matlibro[i][j].getAnio())){
                    encontro = true;
                    System.out.println("El libro fue encontrado en la fila "+ (i+1) +" columna " + (j+1));
                    System.out.println("");
                    System.out.println("Ingrese el titulo del libro:");
                    newtitulo = sc_st.nextLine();
                    libreriamod[i][j].setTitulo(newtitulo);
                    
                    System.out.println("Ingrese el escritor:");
                    newnombre = sc_st.nextLine();
                    libreriamod[i][j].setnombre(newnombre);
                    
                    System.out.println("Ingrese el año de publicacion:");
                    newanio = sc.nextInt();
                    while (newanio < 0){
                        System.out.println("Este año no es valido. Intente de nuevo");
                        newanio = sc.nextInt();
                    }
                    libreriamod[i][j].setAnio(newanio);
                    
                    System.out.println("El libro fue modificado exitosamente.");
                }
            }

        }
        
        if (encontro == false){
            System.out.println("El libro no fue encontrado.");
        }
        
        return libreriamod;
    }
}
