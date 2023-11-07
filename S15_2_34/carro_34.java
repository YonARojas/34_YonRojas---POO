/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_2_34;

/**
 *
 * @author User
 */
public class carro_34 {
    String tipo;
    String color;
    double km;
    int tamaño;
    String marca;
   
    public void acelerar(){
        System.out.println("Mi auto acelera a "+km+" por hora");
    }
    public void espacio(){
        System.out.println("Mi auto tine un espacio para 6 persona por que es "+tamaño+" de tamaño");
    }
    public void tipo(){
        System.out.println("Mi auto es de "+tipo);
    }
    public void moderno(){
        System.out.println("mi auto es de color "+color);
    }
    public void marca(){
        System.out.println("mi auto es "+marca);
    }
}
