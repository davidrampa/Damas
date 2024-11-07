import java.util.Random;

public class Dama {

    private Color color;
    private Posicion Posicion;
    private boolean esDamaEspecial;

    //Constructor por defecto
    public Dama() {
        this.color = Color.BLANCO;
        this.Posicion = crearPosicionInicial(Color.BLANCO);
        this.esDamaEspecial = false;
    }

    //Constructor que acepta color
    public Dama(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo");
        }
        this.color = color;
        this.Posicion = crearPosicionInical(color);
        this.esDamaEspecial = false;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo");
        }
        this.color = color;
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }

    //Metodo para crear la posicion inicial de la Dama
    private Posicion crearPosicionInicial(Color color) {
        Random random = new Random();
        int fila = color == Color.BLANCO ? random.nextInt(3) + 1 : random.nextInt(3) + 6;
        int columna;
        do {
            columna = random.nextInt(8) + 1;
        } while ((fila + columna) % 2 == 0); //Asegura que este en una casilla negra
        return new Posicion(fila, columna);
    }

}
