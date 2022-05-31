/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prueba1;

/**
 *
 * @author user
 */
import java.util.Scanner; // el programa usa la clase Scanner
public class aritmetica_2_15 
{
 // el método main empieza la ejecución de la aplicación en Java
        public static void main(String[] args)
        {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int suma;// suma de numero1 y numero2
        int resta;// resta de numero1 y numero2
        int prod;// prod de numero1 y numero2
        int div;// div de numero1 y numero2
        
        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
    
        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt();// lee el segundo número del usuario
        
        suma = numero1 + numero2; // suma los números, después almacena el total en suma
        resta = numero1 - numero2; // resta los números, después almacena el total en resta
        prod = numero1 * numero2; // multiplica los números, después almacena el total en prod
        div = numero1 / numero2; // divide los números, después almacena el total en div
        System.out.printf("La suma es %d%n", suma); // muestra la suma
        System.out.printf("La resta es %d%n", resta);
        System.out.printf("El producto es %d%n", prod);
        System.out.printf("El cociente es %d%n", div);
    }
}
