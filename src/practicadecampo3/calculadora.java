package practicadecampo3;

public class calculadora {

    // Método sumar con 2 enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: sumar con 3 enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: sumar con decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 10));
        System.out.println("Suma de 3 enteros: " + calc.sumar(5, 10, 15));
        System.out.println("Suma de decimales: " + calc.sumar(5.5, 10.5));
    }
}
