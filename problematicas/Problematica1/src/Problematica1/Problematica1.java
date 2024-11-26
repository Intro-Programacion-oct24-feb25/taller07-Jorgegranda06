/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problematica1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Core i5-Pro
 */
public class Problematica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String reporte = " ";
        String reporteB = " ";
        String reporteFinal = " ";
        String nombre;
        String posicionCampo;
        String salir;
        int edad;
        int contador = 0;
        double estatura;
        boolean ciclo = true;
        int sumaEdades = 0;
        double sumaEstatura = 0;
        double promedioE;
        double promedioT;

        reporte = String.format("Listado de jugadores\n",
                reporte);
        reporteB = String.format("Listado de edades\n", reporteB);

        while (ciclo) {
            System.out.println("Ingrese nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese posicion del jugador");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();

            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;
            contador = contador + 1;
            promedioE = sumaEdades / contador;
            promedioT = sumaEstatura / contador;

            reporte = String.format("%s%d._ %s -%s-,edad %d,estatura %.2f\n",
                    reporte,
                    contador,
                    nombre,
                    posicionCampo,
                    edad,
                    estatura);
            reporteB = String.format("%s%d\n",
                    reporteB,
                    edad);

            reporteFinal = String.format("%s%sPromedio de edades: %.2f\n"
                    + "Promedio de estaturas: %.2f",
                    reporte,
                    reporteB,
                    promedioE,
                    promedioT);
            System.out.println("Desea salir del ciclo? Ingrese si");
            salir = entrada.nextLine();
            if (salir.equals("si") || salir.equals("SI") || salir.equals("Si")) {
                ciclo = false;
            }
        }
        System.out.printf("%s\n", reporteFinal);
    }

}
    
    

