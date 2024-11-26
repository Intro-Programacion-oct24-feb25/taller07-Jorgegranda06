/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica4;

/**
 *
 * @author Core i5-Pro
 */
public class Problematica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n = 1;
    int d = 3;
    int contador = 0;
    int limite = 8;
    String signo = "+";
    String cadena;
    cadena = "1";
        
        while (contador <= 6){
            
            if(contador % 2 == 0){
                signo = "-";
            }else{
                signo = "+";
            }
            
        cadena = cadena +" " + signo +" " + n +"/"+ d ;
        d = d + 2;
        contador = contador + 1;
        
        }
        
        System.out.println(cadena); 
        
    }
}
    

