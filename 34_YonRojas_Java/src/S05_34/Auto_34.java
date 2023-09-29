/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_34;

import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Auto_34 {
    String marca;
    int velocidad;
    
public void datosDauto(){
    Scanner scaner = new Scanner(System.in);
    marca = scaner.nextLine();
    velocidad = scaner.nextInt();
}
public void SalidaDDatos(){
    System.out.println("la marca del auto es: "+marca);
    System.out.println("tiene una veocidad de: "+velocidad);
}
}
