public enum Color {
    BLANCO ("Blanco"),
    NEGRO ("Negro");

    private final String cadenaAMostrar;

    Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    public String getCadenaAMostrar() {
        return cadenaAMostrar;
    }

    //Metodo toString para obtener la representacion en cadena
    @Override
    public String toString() {
        return this.cadenaAMostrar;
    }
}
