
package S06_02;

public class calculadora_02 {
        // Atributos
      private double operando1;
      private double operando2;
      //sobrecarga
        public calculadora_02(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
      // Métodos
        public double sumar() {
        return operando1 + operando2;
            }
         
        public double restar() {
        return operando1 - operando2;
    }
        //sobrecarga
        public double sumar(double operando) {
        return operando1 + operando;
    }
        public double restar(double operando) {
        return operando1 - operando;
    }
        //metodos de retorno
        public double getsuma() {
        return operando1;
    }
            public double getresta() {
        return operando2;
    }
}

