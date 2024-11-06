public class Posicion {
    //Atributos
    private int fila;
    private char columna;

    //Metodos Getters y Setters

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
            throw new IllegalArgumentException("La fila debe estar entra 1 y 8");
        }
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }
    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("La columna debe estar entre 'a' y 'h'");
        }
        this.columna = columna;
    }

    //Constructor con parametros
    public Posicion(int fila, char columna) {
        setFila(fila); //Utiliza el setter con validacion
        setColumna(columna); //Utiliza el setter con validacion
    }

    //Constructor copia
    public Posicion(Posicion otraPosicion) {
        this.fila = otraPosicion.fila;
        this.columna = otraPosicion.columna;
    }

    //Metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Posicion posicion = (Posicion) obj;
        return fila == posicion.fila && columna == posicion.columna;
    }

    //Metodo hashCode
    @Override
    public int hashCode() {
        return 31 * fila+columna;
    }
}
