/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Core i5-Pro
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;

        int edad;
        double estatura;
        
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;

       
        // variables para promedio
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores, Lista de edades\n"
                        + "Promedio de edades :\nPromedio de estaturas :\n");

        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            
            System.out.println("Ingrese la posición del jugador: ");
            posicionCampo = entrada.nextLine();
            
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();

            // agrego una iteración
            sumaEdades = sumaEdades + 1; // primera(0+1=1)
            promedioEdad = sumaEdades/edad;
            

            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d.) %s\n",
                    cadenaReporte,
                    sumaEdades,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);

            // entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")||salir.equals("s")||
                    salir.equals("yes")|| salir.equals("si") ){
                bandera = false;
            }
        }


        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);

    }
}
    
    

