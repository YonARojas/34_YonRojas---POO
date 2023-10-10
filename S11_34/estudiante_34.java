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
public class estudiante_34 extends persona_34{
    private String curso;

    public estudiante_34(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void estudiar() {
        System.out.println("estudia el curso de " + curso + ".");
    }
    public void nombre(){
        System.out.println(nombre +"es mi nombre");
    }
}

