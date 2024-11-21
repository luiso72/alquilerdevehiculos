package co.edu.umanizales.model;


    public class motorcycle implements vehicleAble {
        private String matricula;
        private int km;
        private boolean estado;
        private double valorAlquiler;
        private boolean casco;

        public motorcycle(String matricula, int km, boolean estado, double valorAlquiler, boolean casco) {
            this.matricula = matricula;
            this.km = km;
            this.estado = estado;
            this.valorAlquiler = valorAlquiler;
            this.casco = casco;
        }

        @Override
        public void alquilar() {
            this.estado = false; // Cambiar estado a "no disponible"
        }

        @Override
        public void devolver(int kmFinal) {
            this.km += kmFinal;
            this.estado = true; // Cambiar estado a "disponible"
        }

        @Override
        public double calcularAlquiler(int km) {
            return valorAlquiler * km; // Cálculo simple para ejemplo
        }

        @Override
        public void mostrarDatos() {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Kilometraje: " + km);
            System.out.println("Estado: " + (estado ? "Disponible" : "No disponible"));
            System.out.println("Valor Alquiler: " + valorAlquiler);
            System.out.println("Casco incluido: " + (casco ? "Sí" : "No"));
        }
    }

