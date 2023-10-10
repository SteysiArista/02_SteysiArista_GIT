/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_02_E01;

public class estudiante_02_E01 extends persona_02_E01{

    public estudiante_02_E01(int grado, int nota, String seccion, String nombre, int edad) {
        super(nombre, edad);
        this.grado = grado;
        this.nota = nota;
        this.seccion = seccion;
    }
    
    int grado;
    int nota;
    String seccion;
    
    public void aprobar(){
        
    }
    public void noaprobar(){
        
    }

    void nombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
