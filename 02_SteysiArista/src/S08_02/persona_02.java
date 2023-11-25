
package S08_02;

public class persona_02 {
  private String nombre;
  public int edad;
  
  public persona_02(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public void saludar() {
    System.out.println("mi nombre es " + nombre);
  }
  
  public static void main(String[] args) {
    persona_02 persona = new persona_02("Steysi", 20);
    persona.saludar();
    System.out.println("Tengo " + persona.edad + " años");
  }
}


