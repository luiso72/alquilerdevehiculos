package co.edu.umanizales.service;

import co.edu.umanizales.model.AbstractVehicle;

import java.util.ArrayList;
import java.util.List;

    public class VehicleManagementService {
        private List<AbstractVehicle> vehicleList;

        // Constructor
        public VehicleManagementService() {
            this.vehicleList = new ArrayList<>();
        }

        // metodo para rellenar lista de vehiculos
        public void populateVehicles() {
            // añade carros a la lista
            System.out.println("Vehicle list populated.");
        }

        // metodo para registrar un nuevo vehiculo
        public void registerVehicle(AbstractVehicle vehicle) {
            vehicleList.add(vehicle);
            System.out.println("Vehicle registered: " + vehicle);
        }

        // Getter para la lista de vehiculos
        public List<AbstractVehicle> getVehicleList() {
            return vehicleList;
        }

        // Método para obtener vehículos de un color específico
        public List<AbstractVehicle> getVehiclesByColor(String color) {
            List<AbstractVehicle> filteredVehicles = new ArrayList<>();
            for (AbstractVehicle vehicle : vehicleList) {
                if (vehicle.getColor().equalsIgnoreCase(color)) {
                    filteredVehicles.add(vehicle);
                }
            }
            return filteredVehicles;
    }

