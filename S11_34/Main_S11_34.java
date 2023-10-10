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
public class Main_S11_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante
        estudiante_34 estudiante = new estudiante_34("Ana", 20, "Matemáticas");
        estudiante.saludar();  // Llama al método heredado de la clase Persona
        estudiante.mostrarEdad();  // Llama al método heredado de la clase Persona
        estudiante.estudiar();  // Llama al método específico de la clase Estudiante

        // Crear un objeto de la clase Empleado
        empleado_34 empleado = new empleado_34("Carlos", 35, "Ingeniero");
        empleado.saludar();  // Llama al método heredado de la clase Persona
        empleado.mostrarEdad();  // Llama al método heredado de la clase Persona
        empleado.trabajar();  // Llama al método específico de la clase Empleado

        // Crear un objeto de la clase Cliente
        cliente_34 cliente = new cliente_34("María", 45, "lima");
        cliente.saludar();  // Llama al método heredado de la clase Persona
        cliente.mostrarEdad();  // Llama al método heredado de la clase Persona
        cliente.hacerCompra();  // Llama al método específico de la clase Cliente
    }
}
