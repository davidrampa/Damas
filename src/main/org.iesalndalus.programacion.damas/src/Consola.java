import entrada.Entrada;
import java.awt.Color;

public class Consola {

    private Consola() {

    }

    public static void mostrarMenu() {
        System.out.println("Menu de Opciones:");
        System.out.println("1. Crear dama por defecto");
        System.out.println("2. Crear dama eligiendo el color");
        System.out.println("3. Mover dama");
        System.out.println("4. Salir");
    }

    public static int elegirOpcionMenu() {
        int opcion;
        do {
            System.out.println("Elige una opcion del menu (1-4): ");
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 2);

        return (opcion == 1) ? Color.WHITE : Color.BLACK;
    }


}
