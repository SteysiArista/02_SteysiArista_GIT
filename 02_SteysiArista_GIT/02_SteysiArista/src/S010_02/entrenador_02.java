
package S010_02;

public class entrenador_02 extends selecctionFutbol_02 {
    public entrenador_02(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    

//atributos
    private String idFederacion;

//metodos
    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " es el entrenador");
    }

}
