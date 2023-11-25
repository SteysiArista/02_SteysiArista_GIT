/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package S07v2_021;

public class main_S07v2_02 {

    public static void main(String[] args) {
        persona persona1 = new persona();
        persona persona2 = new persona("steysi",25, (float)170.5);
        
        persona1.setNombre("ana");
        persona1.setEdad(30);
        persona1.setAltura(165.0);
        
        System.out.println(persona1.getNombre());
        System.out.println(persona1);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getAltura());
        
        System.out.println(persona2);
    }
    
}
