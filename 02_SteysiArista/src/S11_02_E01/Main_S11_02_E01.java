/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_02_E01;

public class Main_S11_02_E01 {
    public static void main(String[] args) {
                estudiante_02_E01 objestudiante = new estudiante_02_E01 (5, 10, "B", "SOFIA", 12);
                objestudiante.nombre();
                
                doctor_02_E01 objdoctor = new doctor_02_E01 (4, "corazon", 2000, "pablo", 30);
                objdoctor.especialidad();
                
                jugador_02_E01 objugador = new jugador_02_E01 (4, "peru", 2, "jorge", 20);
                objugador.equipo();
    }
}
