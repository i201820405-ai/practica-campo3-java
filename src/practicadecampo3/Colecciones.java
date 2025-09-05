package practicadecampo3;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        // Creamos una lista de nombres
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Miguel");
        lista.add("Ana");
        lista.add("Luis");

        System.out.println("Lista de nombres:");
        for (String nombre : lista) {
            System.out.println("- " + nombre);
        }
    }
}
