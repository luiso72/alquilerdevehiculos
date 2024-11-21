package co.edu.umanizales.controller;
import co.edu.umanizales.model.AbstractVehicle;
import co.edu.umanizales.model.RentVehicle;
import co.edu.umanizales.model.user;
import co.edu.umanizales.service.UserManagementService;
import co.edu.umanizales.service.VehicleManagementService;

import java.util.List;

    @RestController
    @RequestMapping("/api/rentals")
    public class RentalController {

        @Autowired
        private VehicleManagementService vehicleService;

        @Autowired
        private UserManagementService userService;

        // Devuelve la cantidad de vehículos de un color
        @GetMapping("/vehicles/color/{color}/count")
        public long getVehicleCountByColor(@PathVariable String color) {
            return vehicleService.getVehiclesByColor(color).size();


        // Endpoint para tener los vehiculos
        @GetMapping("/vehicles")
        public List<AbstractVehicle> getAllVehicles() {
            return vehicleService.getVehicleList();
        }

        // Endpoint para registrar un nuevo vehiculo
        @PostMapping("/vehicles")
        public String registerVehicle(@RequestBody AbstractVehicle vehicle) {
            vehicleService.registerVehicle(vehicle);
            return "Vehicle registered successfully!";
        }

        // Endpoint para tener todos los usuarios
        @GetMapping("/users")
        public List<user> getAllUsers() {
            return userService.getUserList();
        }

        // Endpoint para validar las credenciales
        @PostMapping("/users/validate")
        public String validateUser(@RequestBody user loginRequest) {
            boolean isValid = userService.validateUser(loginRequest.getLogin(), loginRequest.getPassword());
            if (isValid) {
                return "User validated successfully!";
            } else {
                return "Invalid credentials!";
            }
        }

        // Endpoint para rentar los vehiculos
        @PostMapping("/rent")
        public String rentVehicle(@RequestBody RentRequest rentRequest) {
            // encontrar los usuarios
            user user = userService.getUserList().stream()
                    .filter(u -> u.getCedula().equals(rentRequest.getUserId()))
                    .findFirst()
                    .orElse(null);

            AbstractVehicle vehicle = vehicleService.getVehicleList().stream()
                    .filter(v -> v.getRegistration().equals(rentRequest.getVehicleId()))
                    .findFirst()
                    .orElse(null);

            if (user == null || vehicle == null) {
                return "User or vehicle not found!";
            }

            // rentar los vehiculos
            RentVehicle rentVehicle = new RentVehicle(vehicle, user, null, null, null);
            rentVehicle.rent(vehicle, user);
            return "Vehicle rented successfully!";
        }
    }


