package co.edu.umanizales.model;



public class Typeofuser {
        private String code; // Código único para identificar el tipo
        private String description; // Descripción del tipo de usuario

        // Constructor
        public Typeofuser(String code, String descripcion) {
            this.code = code;
            this.description = descripcion;
        }

        // Getters y setters
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescriptiom() {
            return description;
        }

        public void setDescription(String descripcion) {
            this.description = descripcion;
        }

        /// Método para mostrar los datos del tipo de usuario
        @Override
        public String toString() {
            return "TipoUsuario{" +
                    "codigo='" + code + '\'' +
                    ", descripcion='" + description + '\'' +
                    '}';
        }
    }

