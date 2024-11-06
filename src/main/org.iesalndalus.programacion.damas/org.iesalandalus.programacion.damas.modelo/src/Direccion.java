public enum Direccion {
        NORESTE("Noreste"),
        SURESTE("Sureste"),
        SUROESTE("Suroeste"),
        NOROESTE("Noroeste");

        private final String nombre;

        Direccion(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
}
