/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.masa_corporal;

import java.util.Scanner;
public class Masa_corporal {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        float kl;//kilogramos
        float mt;//altura en metros
        float mc;//altura al cuadrado
        float tl;//total de masa corporal
        
    System.out.println("\n*************Departamento de Salud y Servicios Humanos**************");    
    System.out.println("Instituto Nacional de Salud para que el usuario pueda evaluar su BMI");
    System.out.println("\n********************************************************************");
    System.out.println("*                    Peso bajo:  menos de 18.5                     *");
    System.out.println("*                    Peso Normal: Entre 18.5 y 24.9                *");
    System.out.println("*                    Sobrepeso: Entre 25 y 29.9                    *");
    System.out.println("*                    Obesidad: Mas de 30                           *");
    System.out.println("********************************************************************");
    
    
    System.out.print("\nIngrese su peso (En kilogramos): ");
        kl = entrada.nextFloat();
        
    System.out.print("Ingrese su altura (En metros): ");
        mt=entrada.nextFloat();
        
        mc = mt * mt;
        tl =kl / mc;
        
        System.out.println("\nTu indice de masa corporal es: "+tl);
        if(tl<18.5){
            System.out.println("Ten cuidado, peso demasiado bajo");
        }else if(tl>=18.5 && tl<=24.9){
            System.out.println("tu peso es normal");
        }else if(tl>=25 && tl<=29.9){
            System.out.println("Padeces sobrepeso");
        }else if(tl>30){
            System.out.println("Cuidado, peso alto (obesidad)");            
        }
    }
    
}
