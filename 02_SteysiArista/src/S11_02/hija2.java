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

public class hija2 extends persona {
    // Atributo
    private String profesion;
    private int salario;
    private boolean tieneTrabajo;
    // Métodos
    public void trabajar() {
        System.out.println("Estoy trabajando como " + this.profesion + ".");
    }

    public void estudiar() {
        System.out.println("Estoy estudiando.");
    }
}
