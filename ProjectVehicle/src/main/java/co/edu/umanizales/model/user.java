package co.edu.umanizales.model;

public class user {
        private String cedula; // Identificación del usuario
        private String name; // Nombre del usuario
        private String login;  // Login para autenticación
        private String password; // Contraseña
        private Typeofuser typeuser; // Relación con TipoUsuario

        // Constructor
        public user(String cedula, String name, String login, String password, Typeofuser typeuser) {
            this.cedula = cedula;
            this.name = name;
            this.login = login;
            this.password = password;
            this.typeuser = typeuser;
        }

        // Getters y setters
        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getName() {
            return name ;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Typeofuser getTypeuser() {
            return typeuser;
        }

        public void setTypeuser(Typeofuser Typeuser) {
            this.typeuser = Typeuser;
        }

        // Método para mostrar los datos del usuario
        @Override
        public String toString() {
            return "user{" +
                    "cedula='" + cedula + '\'' +
                    ", name='" + name + '\'' +
                    ", login='" + login + '\'' +
                    ", type of user=" + typeuser +
                    '}';
        }
    }

