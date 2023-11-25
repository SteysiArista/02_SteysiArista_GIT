
package S010_02;

public class Main_S010_02 {
    public static void main(String[] args) {
        
        
        futbolista_02 futbolista1 = new futbolista_02(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_02 masajista1  = new masajista_02("si", 15, 2, "raul", "Martines", 50);
        entrenador_02 RicardoGareca = new entrenador_02("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();   
    }
}
