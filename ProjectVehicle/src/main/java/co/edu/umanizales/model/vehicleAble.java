package co.edu.umanizales.model;

public interface vehicleAble {
    void alquilar();
    void devolver(int kmFinal);
    double calcularAlquiler(int km);
    void mostrarDatos();
}

