/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_34;

/**
 *
 * @author Jhon
 */
public class cliente_34 extends persona_34{
    private String direccion;
    private String verduras;
    private int kilos;

    public cliente_34(String nombre, int edad, String direccion) {
        super(nombre, edad);
        this.direccion = direccion;
    }

    public void hacerCompra() {
        System.out.println(nombre + " está realizando una compra en la dirección " + direccion + ".");
    }
    public void compre(){
        System.out.println("fui a comprar"+ verduras);
    }
}

