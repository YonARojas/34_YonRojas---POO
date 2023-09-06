/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg34_yonrojas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab06
 */
public class Calculadora {

    int a, b, sum, rest, mul;

    public void suma() {
        sum = a + b;
    }

    public void multiplicar() {
        mul = a * b;
    }

    public void restar() {
        rest = a - b;
    }

    public void pregunta() {
        a = Integer.parseInt(JOptionPane.showInputDialog("ingresa a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("ingresa B"));
    }

    public void respuestas() {
        JOptionPane.showMessageDialog(null, "La suma es " + sum + "\nLa resta es " + rest + "\nLa multiplicacion es " + mul);
    }

}
