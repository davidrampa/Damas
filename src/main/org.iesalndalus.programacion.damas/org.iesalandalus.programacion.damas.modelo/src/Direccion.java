public enum Direccion {
        NORESTE("Noreste"),
        SURESTE("Sureste"),
        SUROESTE("Suroeste"),
        NOROESTE("Noroeste");

        //Atributo para almacenar la cadena representativa
        private final String cadenaAMostrar;

        //Constructor que inicializa el atributo cadenaAMostrar
        Direccion(String cadenaAMostrar) {
            this.cadenaAMostrar = cadenaAMostrar;
        }

        //Metodo toString para obtener la representacion en cadena
        @Override
        public String toString() {
                return cadenaAMostrar;
        }
}
