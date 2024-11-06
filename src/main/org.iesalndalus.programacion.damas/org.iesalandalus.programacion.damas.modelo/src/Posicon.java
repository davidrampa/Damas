public class Posicon {
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
}
