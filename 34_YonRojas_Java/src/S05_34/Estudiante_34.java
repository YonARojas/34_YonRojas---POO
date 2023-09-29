/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_34;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Estudiante_34 {
    String nombre;
    String apellido;
    
    public void PedirDatos(){
        nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        apellido=JOptionPane.showInputDialog("Introduce tu apellido");
    }
    public void SalidaDatos(){
     JOptionPane.showMessageDialog(null,nombre);
     JOptionPane.showMessageDialog(null,apellido);
    }
}
