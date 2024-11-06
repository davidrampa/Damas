public enum Color {
    BLANCO ("Blanco"),
    NEGRO ("Negro");

    private final String cadenaAMostrar;

    private Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    public String getCadenaAMostrar() {
        return cadenaAMostrar;
    }
}
