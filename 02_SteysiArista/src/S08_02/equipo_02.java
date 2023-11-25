
package S08_02;

public class equipo_02 {
  private class Jugador {
    private String nombre;
    
    public Jugador(String nombre) {
      this.nombre = nombre;
    }
    
    public void mostrarNombre() {
      System.out.println("Nombre del jugador: " + nombre);
    }
  }
  
  public void agregarJugador(String nombre) {
    Jugador jugador = new Jugador(nombre);
    jugador.mostrarNombre();
  }
}

