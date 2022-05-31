/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.area_diametro_circunferecia;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Area_diametro_circunferecia {

   public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        int r; //radio
       
        System.out.print("Ingrese el radio del circulo (Debe ser entero): ");
        r = entrada.nextInt();
      
            System.out.printf("\nEl diametro es: %d", r * 2);
            System.out.printf("\nLa circunferencia es: %f", 2 * (Math.PI) * r);
            System.out.printf("\nEl Area es: %f", (Math.PI) * r * r);
        
    }
}
