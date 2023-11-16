/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_02;

import S06_02.calculadora_02;
import S06_02.estudiante_02;

/**
 *
 * @author ARISTA
 */
public class main {
    public static void main(String[] args) {
        estudiante_02 estudiante1 = new estudiante_02();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);
        estudiante1.saludar(); 
        
        calculadora_02 miCalculadora = new calculadora_02(5, 3);
        double resultadoSuma = miCalculadora.sumar();
        double resultadoResta = miCalculadora.restar();
        System.out.println(resultadoSuma);
        System.out.println(resultadoResta);
    }
}
