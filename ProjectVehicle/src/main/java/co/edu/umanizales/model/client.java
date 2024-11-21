package co.edu.umanizales.model;

public class client{

        private co.edu.umanizales.model.user user ; // Relación con Usuario
        private String address; // Dirección del cliente
        private String numberphone;  // Teléfono de contacto

        // Constructor
        public client(user user, String address, String numberphone) {
            this.user = user;
            this.address = address;
            this.numberphone = numberphone;
        }

        // Getters y setters
        public user getUser() {
            return user;
        }

        public void setUser(user user) {
            this.user = user;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String Address) {
            this.address = address;
        }

        public String getNumberphone() {
            return numberphone;
        }

        public void setNumberphone(String numberphone) {
            this.numberphone = numberphone;
        }

        // Método para mostrar los datos del cliente
        @Override
        public String toString() {
            return "Client{" +
                    "user=" + user +
                    ", address='" + address + '\'' +
                    ", phone='" + numberphone + '\'' +
                    '}';
        }
    }

