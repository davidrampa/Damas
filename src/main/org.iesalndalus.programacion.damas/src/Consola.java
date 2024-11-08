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

    public static Color elegirOpcion() {
        int opcion;
        do {
            System.out.println("elige un color (1 para Blanco, 2 para Negro): ");
            opcion = Entrada.entero();
        } while (opcion <1 || opcion > 2);

        return (opcion == 1) ? Color.WHITE : Color.BLACK;
    }

    public static void mostrarMenuDirecciones() {
        System.out.println("Direcciones disponibles");
        System.out.println("1. Noreste");
        System.out.println("2. Noroeste");
        System.out.println("3. Sureste");
        System.out.println("4. Suroeste");
    }

    public static Direccion elegirDireccion() {
        int opcion;
        do {
            System.out.print("Elige una dirección (1-4): ");
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 4);

        return switch (opcion) {
            case 1 -> Direccion.NORESTE;
            case 2 -> Direccion.NOROESTE;
            case 3 -> Direccion.SURESTE;
            case 4 -> Direccion.SUROESTE;
            default -> throw new IllegalArgumentException("Dirección inválida");
        };
    }


}
