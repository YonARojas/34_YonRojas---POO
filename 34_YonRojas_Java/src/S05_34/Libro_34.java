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
public class Libro_34 {
    String nombre;
    String Autor;
    
public void DatosLibro(){
    nombre=JOptionPane.showInputDialog("Introduce tu nombre");
    Autor=JOptionPane.showInputDialog("Introduce tu apellido");
}
public void SaLidaDatos(){
     JOptionPane.showMessageDialog(null,nombre);
     JOptionPane.showMessageDialog(null,Autor);
}    
}
