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
public class persona_34 {
     //ATRIBUTOS

    private String NOMBRE;
    private String APELLIDOS;
    private int EDAD;

    public persona_34(String NOMBRE, String APELLIDOS, int EDAD) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.EDAD = EDAD;
    }

    //FUNCIONES

    public String getNOMBRE() { return NOMBRE; }

    public String getAPELLIDOS() { return APELLIDOS; }

    public int getEDAD() { return EDAD; }

}
