package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;



public class Main {

    private final static UserService userService = new UserServiceImpl();


    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Bender", "Rodriges", (byte) 110);
        userService.saveUser("Homer", "Simpson", (byte) 44);
        userService.saveUser("Eric", "Cartman", (byte) 11);
        userService.saveUser("Kenny", "Mccormac", (byte) 9);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
