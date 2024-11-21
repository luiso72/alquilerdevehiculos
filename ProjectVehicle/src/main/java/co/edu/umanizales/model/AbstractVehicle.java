package co.edu.umanizales.model;

public abstract class AbstractVehicle {

    // Atributos
    private String Registration;
    private int km;
    private boolean State; // true = disponible, false = alquilado
    private double RentalValue;
    private String color;

    // Constructor
    public AbstractVehicle(String Registration, int km, boolean State, double RentalValue, String color) {
        this.Registration = Registration;
        this.km = km;
        this.State = State;
        this.RentalValue = RentalValue;
        this.color=color;
    }

    //Getter y Setters del color
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    // Métodos getters y setters
    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String Registration) {
        this.Registration = Registration;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean state) {
        this.State = state;
    }

    public double getRentValue() {
        return RentalValue;
    }

    public void setRentalValue(double RentalValue) {
        this.RentalValue = RentalValue;
    }

    // Método para alquilar el vehículo
    public void Rental(int numDays) {
        if (State) {
            State = false;
            System.out.println("Vehículo alquilado por " + numDays + " días.");
        } else {
            System.out.println("El vehículo no está disponible.");
        }
    }

    // Método para devolver el vehículo
    public void refund(int kmEnd) {
        if (!State) {
            State = true;
            int kmTravels = kmEnd - km;
            km = kmEnd;
            System.out.println("Vehículo devuelto. Kilómetros recorridos: " + kmEnd);
        } else {
            System.out.println("El vehículo no está alquilado.");
        }
    }

    // Método abstracto para calcular el costo del alquiler (debe ser implementado por las subclases)
    public abstract double calculateRent(int km);

    // Método para mostrar los datos del vehículo
    public void showDates() {
        System.out.println("Matrícula: " + Registration);
        System.out.println("Kilometraje: " + km);
        System.out.println("Estado: " + (State ? "Disponible" : "No disponible"));
        System.out.println("Valor base del alquiler: " + RentalValue);
    }
}
