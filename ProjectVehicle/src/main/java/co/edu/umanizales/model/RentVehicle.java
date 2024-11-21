package co.edu.umanizales.model;

import java.util.Date;

    public class RentVehicle {
        private AbstractVehicle vehicle;
        private user registeredBy;
        private Date rentalDate;
        private Date returnDate;
        private client client;

        // Constructor
        public RentVehicle(AbstractVehicle vehicle, user registeredBy, Date rentalDate, Date returnDate, client client) {
            this.vehicle = vehicle;
            this.registeredBy = registeredBy;
            this.rentalDate = rentalDate;
            this.returnDate = returnDate;
            this.client = client;
        }

        // Getters and setters
        public AbstractVehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(AbstractVehicle vehicle) {
            this.vehicle = vehicle;
        }

        public user getRegisteredBy() {
            return registeredBy;
        }

        public void setRegisteredBy(user registeredBy) {
            this.registeredBy = registeredBy;
        }

        public Date getRentalDate() {
            return rentalDate;
        }

        public void setRentalDate(Date rentalDate) {
            this.rentalDate = rentalDate;
        }

        public Date getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(Date returnDate) {
            this.returnDate = returnDate;
        }

        public client getClient() {
            return client;
        }

        public void setClient(client client) {
            this.client = client;
        }

        // renta para un vehiculo
        public void rent(AbstractVehicle vehicle, user user) {
            this.vehicle = vehicle;
            this.registeredBy = user;
            this.rentalDate = new Date(); // Set rental date to today
            System.out.println("Vehicle rented by: " + user.getName());
        }
    }
