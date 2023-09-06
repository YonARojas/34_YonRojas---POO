/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg34_yonrojas;

/**
 *
 * @author Lab06
 */
public class Auto {
    String marca, color;
    double km;
    
    public void acelerar(){
        System.out.println("Mi auto acelera a "+km+" por hora");
    }
    public void frenar(){
        System.out.println("Estoy frenando");
    }
    public void sonido(){
        System.out.println("Mi auto suena como un "+marca);
    }
}
