/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ari_2_17;

/**
 *
 * @author user
 */
import java.util.Scanner; 
public class Ari_2_17 {
// el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args)
    {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        
        //declaracion de variables
        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int numero3; // tercer número a sumar
        int suma;// suma de numero1, numero2 y numero 3
        int prod;// prod de numero1, numero2 y numero 3
        int prom;// prom de numero1, numero2 y numero 3
        
        //Ingreso de datos
        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
    
        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt();// lee el segundo número del usuario
        
        System.out.print("Escriba el tercer entero: "); // indicador
        numero3 = entrada.nextInt();// lee el tercer número del usuario
        
        //operaciones
        suma = numero1 + numero2 + numero3; // suma los números
        prod = (numero1 * numero2 * numero3); // multiplica los números
        prom = prod / 3; // promedio de los números
        
        //muestra de resultados
        System.out.printf("\nLa suma es %d%n", suma); // muestra la suma
        System.out.printf("\nEl producto es %d%n", prod); // muestra El producto
        System.out.printf("\nEl promedio es %d%n", prom); // muestra El promedio
        
        //********************Mayor************************
        if (numero1 == numero2 && numero2 == numero3){
            System.out.printf("\nLos tres numeros son iguales");
        
        } else if(numero1 > numero2 && numero1 > numero3){ 
            System.out.println("\nEl numero Mayor es: "+numero1);
        
        }else if(numero2 > numero1 && numero2 > numero3){ 
            System.out.println("\nEl numero Mayor es: "+numero2);
        
        }else{
            System.out.println("\nEl numero Mayor es: "+numero3);   
        }
        
        //******************Menor************************ 
        if(numero1 < numero2 && numero1 < numero3){ 
            System.out.println("\nEl numero menor es: "+numero1);
        
        }else if(numero2 < numero1 && numero2 < numero3){ 
            System.out.println("\nEl numero menor es: "+numero2);
        
        }else{
            System.out.println("\nEl numero menor es: "+numero3);   
        }
        
    }    
}
