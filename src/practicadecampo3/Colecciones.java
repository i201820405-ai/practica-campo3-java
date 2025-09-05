package practicadecampo3;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Miguel");
        nombres.add("Ana");
        nombres.add("Luis");

        // Mostrar todos los nombres
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
