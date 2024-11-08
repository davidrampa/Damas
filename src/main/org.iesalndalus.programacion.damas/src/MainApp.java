public class MainApp {
    private static Dama dama;

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> crearDamaDefecto();
            case 2 -> crearDamaColor();
            case 3 -> mover();
            case 4 -> Consola.despedirse();
            default -> System.out.println("Opción no válida.");
        }
    }

    public static void crearDamaDefecto() {
        dama = new Dama();
        System.out.println("Dama creada por defecto.");
    }

    public static void crearDamaColor() {
        Color color = Consola.elegirOpcion();  // Asumiendo que Consola.elegirOpcion devuelve un color válido
        dama = new Dama(color);
        System.out.println("Dama creada de color " + color + ".");
    }

}
