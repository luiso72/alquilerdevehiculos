package co.edu.umanizales.service;

import co.edu.umanizales.model.client;
import co.edu.umanizales.model.user;

import java.util.ArrayList;
import java.util.List;

    public class UserManagementService {
        private List<user> userList;
        private List<client> clientList;

        // Constructor
        public UserManagementService() {
            this.userList = new ArrayList<>();
            this.clientList = new ArrayList<>();
        }

        // metodo para rellenar la lista de usuarios
        public void populateUsers() {
            // añadir usuarios en la lista
            System.out.println("lista de usuarios rellenado.");
        }

        // metodo para validar contraseña del usuario
        public boolean validateUser(String login, String password) {
            for (user user : userList) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    return true;
                }
            }
            return false;
        }

        // Getters para las listas
        public List<user> getUserList() {
            return userList;
        }

        public List<client> getClientList() {
            return clientList;
        }

        // ejemplo para agregar un nuevo usuario
        public void registerUser(user user) {
            userList.add(user);
            System.out.println("User registered: " + user);
        }
    }


