/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_02_E01;

public class jugador_02_E01 extends persona_02_E01 {

    public jugador_02_E01(int jugadornum, String equipo, int hermanos, String nombre, int edad) {
        super(nombre, edad);
        this.jugadornum = jugadornum;
        this.equipo = equipo;
        this.hermanos = hermanos;
    }

    int jugadornum;
    String equipo;
    int hermanos;
    public void jugar(){
        
    }
    public void entrenar(){
        
    }

    void equipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
