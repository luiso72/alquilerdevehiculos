package co.edu.umanizales.model;

public class Car  implements vehicleAble {
        private String matricula;
        private int km;
        private boolean estado;
        private double valorAlquiler;
        private boolean extras;

        public Car(String matricula, int km, boolean estado, double valorAlquiler, boolean extras) {
            this.matricula = matricula;
            this.km = km;
            this.estado = estado;
            this.valorAlquiler = valorAlquiler;
            this.extras = extras;
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
            return valorAlquiler * km + (extras ? 50 : 0); // Extra costo si tiene extras
        }

        @Override
        public void mostrarDatos() {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Kilometraje: " + km);
            System.out.println("Estado: " + (estado ? "Disponible" : "No disponible"));
            System.out.println("Valor Alquiler: " + valorAlquiler);
            System.out.println("Extras incluidos: " + (extras ? "Sí" : "No"));
        }
    }



