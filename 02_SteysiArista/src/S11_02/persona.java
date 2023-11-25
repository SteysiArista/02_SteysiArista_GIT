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
public class persona {
    // Atributo
    private String nombre;
    private int edad;

    // Método
    public void saludar() {
        System.out.println("mi nombre es " + this.nombre + " mi edad es " + this.edad + " años.");
    }

    public void despedir() {
        System.out.println("bye");
    }
}
