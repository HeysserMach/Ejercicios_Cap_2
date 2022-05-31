/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.par_impar;

/**
 *
 * @author user
 */
import java.util.Scanner;//importar scanner
public class Par_impar {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        int numero;
       
        //ingreso de datos
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
       
        //evaluacion
        if(numero % 2 == 0) {
            //resultado par
            System.out.println(numero+" es un número par.");
        }else {
            //resultado impar
            System.out.println(numero+" no es un número par.");
        }
    }
}
