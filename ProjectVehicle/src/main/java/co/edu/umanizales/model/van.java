package co.edu.umanizales.model;

public class van implements vehicleAble {
        private String matricula;
        private int km;
        private boolean estado;
        private double valorAlquiler;
        private short capacidad;

        public van(String matricula, int km, boolean estado, double valorAlquiler, short capacidad) {
            this.matricula = matricula;
            this.km = km;
            this.estado = estado;
            this.valorAlquiler = valorAlquiler;
            this.capacidad = capacidad;
        }

        @Override
        public void alquilar() {
            this.estado = false;
        }

        @Override
        public void devolver(int kmFinal) {
            this.km += kmFinal;
            this.estado = true;
        }

        @Override
        public double calcularAlquiler(int km) {
            return valorAlquiler * km + capacidad * 10; // Costo extra por capacidad
        }

        @Override
        public void mostrarDatos() {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Kilometraje: " + km);
            System.out.println("Estado: " + (estado ? "Disponible" : "No disponible"));
            System.out.println("Valor Alquiler: " + valorAlquiler);
            System.out.println("Capacidad: " + capacidad + " toneladas");
        }
    }

