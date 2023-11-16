
package S06_02;

public class estudiante_02 {

    // Atributos
    private String nombre;
    private int edad;
    //sobrecarga de constructor
          public estudiante_02(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    estudiante_02() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    // Métodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }     
        // Sobrecarga de método
    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + "y tengo" + edad );
    }
    //retorno
        public String getNombre() {
        return nombre;
    }
            public int getEdad() {
        return edad;
    }
}
