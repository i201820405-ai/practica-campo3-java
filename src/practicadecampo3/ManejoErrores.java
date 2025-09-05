package practicadecampo3;

import java.util.Scanner;

public class ManejoErrores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int num = sc.nextInt();
            System.out.println("Número ingresado: " + num);
        } catch (Exception e) {
            System.out.println("⚠ Error: No ingresaste un número válido.");
        } finally {
            sc.close();
        }
    }
}
