/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica2;

/**
 *
 * @author Core i5-Pro
 */
public class Problematica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n = 1; // Inicializamos n
        int limite = 10; // Cantidad de números en la serie
        int resultado = 0;

        System.out.println("Serie generada:");
        while (n <= limite) {
            resultado = n * (n + 1); // Fórmula para generar el número
            System.out.println(resultado); // Imprimimos el resultado
            n= n+1; // Incrementamos n
        }
    }
}
    
    

