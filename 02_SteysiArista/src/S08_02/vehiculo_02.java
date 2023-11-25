
package S08_02;

public class vehiculo_02 {
  protected class Motor {
    protected void encender() {
      System.out.println("Motor encendido");
    }
  }
  
  protected void arrancarMotor() {
    Motor motor = new Motor();
    motor.encender();
  }
  
  public static void main(String[] args) {
    vehiculo_02 vehiculo = new vehiculo_02();
    vehiculo.arrancarMotor();
  }
}
