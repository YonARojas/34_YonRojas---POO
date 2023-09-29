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
public class CuentaBancaria_34 {
    int numeroDcuenta;
    int monto;
    
public void DatosDCuenta(){
    Scanner sc = new Scanner(System.in);
    int numeroDcuenta = sc.nextInt();
    int monto = sc.nextInt();
}
public void SalidaDDatos(){
    System.out.println("el numero de cuenta es: "+numeroDcuenta);
    System.out.println("el moto de la cuenta es: "+monto);
}
}
