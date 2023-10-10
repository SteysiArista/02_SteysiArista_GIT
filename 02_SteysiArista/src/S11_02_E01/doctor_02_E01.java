/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_02_E01;

public class doctor_02_E01 extends persona_02_E01{

    public doctor_02_E01(int experiencia, String especialidad, int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.experiencia = experiencia;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }
    
    int experiencia;
    String especialidad;
    int sueldo;
    
    public void curar(){
        
    }
    public void ayudar(){
        
    }

    void especialidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
