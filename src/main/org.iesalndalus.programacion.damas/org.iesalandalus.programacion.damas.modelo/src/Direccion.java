public enum Direccion {
        NORESTE("Noreste"),
        SURESTE("Sureste"),
        SUROESTE("Suroeste"),
        NOROESTE("Noroeste");

        private final String cadenaAMostrar;

        Direccion(String cadenaAMostrar) {
            this.cadenaAMostrar = cadenaAMostrar;
        }

        public String getCadenaAMostrar() {
            return cadenaAMostrar;
        }

        @Override
        public String toString() {
                return cadenaAMostrar;
        }
}
