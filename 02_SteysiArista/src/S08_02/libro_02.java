/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_02;

/**
 *
 * @author ARISTA
 */
class libro__02 {
  String titulo;
  String autor;
  
  public libro__02(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }
  
  public void mostrarInformacion() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
  }
  
  public static void main(String[] args) {
    libro__02 libro = new libro__02("Romeo y Julieta", "Shakespeare");
    libro.mostrarInformacion();
  }
}

