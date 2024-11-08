/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author Daniel
 */
public class Ejercicio3 {
    public static void main(String[] args) {
       double m=6,t=1,k = -10;
        System.out.println("Numeros ingresados son m=6, t=1, k=-10 ");
        System.out.println("Validacion#1:  m>t");
        if(m>t){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");    
        }
        System.out.println(" ");
        System.out.println("Validacion#2: t>k");
         if((t/k) == (-5)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");    
        }
      System.out.println(" ");
        System.out.println("Validacion#3: (m+t==7) || (m-t==5)");
         if((m+t == 7) || (m-t == 5)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");    
        }
   
    }
}
