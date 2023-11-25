
package S07_02;

public class Main_S07_02 {
    public static void main(String[] args) {
        // Crear objetos de las clases Persona1 y Persona2
        persona1 persona1 = new persona1();
        persona2 persona2 = new persona2();

        // Llamar a los métodos de los objetos creados
        persona1.metodo1(15, "Hola", true);
        persona1.metodo2("Adiós", 5);
        persona1.metodo3(3.14, 7, "Java");

        int resultado = persona2.metodo4();
        String saludo = persona2.metodo5();
        double suma = persona2.metodo6(3, 4.5);
        
        System.out.println(resultado);
        System.out.println(saludo);
        System.out.println(suma);
    }
}
