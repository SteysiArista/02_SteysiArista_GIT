/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_02;

/**
 *
 * @author ARISTA
 */
public class main {
    public static void main(String[] args) {
        // Crear un objeto de cada clase
        persona persona = new persona();
        hija1 hija1 = new hija1();
        hija2 hija2 = new hija2();
        hija3 hija3 = new hija3();

        // Llamar a los métodos de los objetos creados
        persona.saludar();
        hija1.bailar();
        hija2.trabajar();
        hija3.casarse();
    }
}
