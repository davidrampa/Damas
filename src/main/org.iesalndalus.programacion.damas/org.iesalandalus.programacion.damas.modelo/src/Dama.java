import java.util.Random;
import javax.naming.OperationNotSupportedException;

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

    public void mover(Direccion direccion, int pasos) throws  OperationNotSupportedException {
        if (direccion == null) {
            throw new IllegalArgumentException("La direccion no puede ser nula.");
        }
        if (pasos < 1) {
            throw new IllegalArgumentException("El numero de pasos debe ser un entero positivo");
        }
        if (!esDamaEspecial) {
            pasos = 1;
            if ((color == Color.BLANCO && (direccion == Direccion.SURESTE || direccion == Direccion.SUROESTE)) ||
                    (color == Color.NEGRO && (direccion == Direccion.NORESTE || direccion == Direccion.NOROESTE))) {
                throw new OperationNotSupportedException("Movimiento no permite para damas no especiales.");
            }
        }

        int nuevaFila = Posicion.getFila();
        int nuevaColumna = Posicion.getColumna();

        switch (direccion) {
            case NORESTE -> { nuevaFila += pasos; nuevaColumna += pasos; }
            case NOROESTE -> { nuevaFila += pasos; nuevaColumna += pasos; }
            case SURESTE -> { nuevaFila -= pasos; nuevaColumna -= pasos; }
            case SUROESTE -> { nuevaFila -= pasos; nuevaColumna -= pasos; }
        }

        if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 1 || nuevaColumna > 8) {
            throw new OperationNotSupportedException("Movimiento fuera del tablero.");
        }

        Posicion = new Posicion(nuevaFila, nuevaColumna);

        if ((color == Color.BLANCO && nuevaFila == 8) || (color == Color.NEGRO && nuevaFila == 1)) {
            esDamaEspecial = true;
        }
    }

    @Override
    public String toString() {
        return "Dama{" + "color =" + color + ", posicion =" + Posicion + ", esDamaEspecial =" + esDamaEspecial + '}';
    }

}
