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

    public static void mover() {
        if (dama == null) {
            System.out.println("Primero debes crear una dama.");
            return;
        }

        Consola.mostrarMenuDirecciones();
        Direccion direccion = Consola.elegirDireccion();

        int pasos = 1;
        if (dama.isEsDamaEspecial()) {
            pasos = Consola.elegirPasos();
        }

        try {
            dama.mover(direccion, pasos);
            System.out.println("La dama se ha movido a la posición: " + dama.getPosicion());
        } catch (OperationNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarDama() {
        if (dama != null) {
            System.out.println(dama);
        } else {
            System.out.println("No hay una dama creada actualmente.");
        }
    }

    public static void main(String[] args) {
        int opcion;
        do {
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcionMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }


}
