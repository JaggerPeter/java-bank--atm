public class Main {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Intenta dividir por cero
        } catch (ArithmeticException e) { // Captura la excepción
            System.out.println("No se puede dividir por cero!");
        }
    }
}
