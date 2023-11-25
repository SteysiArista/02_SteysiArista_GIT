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
public class hija3 extends persona {
    // Atributo
    private boolean casada;
    private int cantidadHijos;
    private String nombreEsposo;
    // Métodos
    public void casarse() {
        this.casada = true;
        System.out.println("Me he casado.");
    }

    public void divorciarse() {
        this.casada = false;
        System.out.println("Me he divorciado.");
    }
}
