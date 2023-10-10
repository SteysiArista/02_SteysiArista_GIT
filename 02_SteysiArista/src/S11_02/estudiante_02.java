/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_02;

public class estudiante_02 extends persona_02{

    public estudiante_02(String carrera, int numerodeorden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numerodeorden = numerodeorden;
        this.ciclo = ciclo;
    }
        
    //atributos
    String carrera;
    int numerodeorden;
    int ciclo;

}
