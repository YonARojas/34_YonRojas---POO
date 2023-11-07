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
public class bombero_34 {
    String Nombre;
    int Nrescates;
    double peso;
    float altura;
    double velocidad;
    
    public void rescates(){
        System.out.println("El realizo "+Nrescates+" rescates");
    }
    public void AFuego(){
        System.out.println("El apago el fuego a una altura de "+altura);
    }
    public void Peso(){
        System.out.println("Debe ser fuerte para alzar pesos de hasta "+peso);
    }
    public void velocidad(){
        System.out.println("el bombero es veloz llega a correr hasta "+velocidad);
    }
    public void especializado(){
        System.out.println("El bombero "+Nombre+"se especializa en rescates a altura");
    }
    
}
