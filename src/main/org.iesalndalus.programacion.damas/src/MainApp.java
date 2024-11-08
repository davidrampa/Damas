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

}
