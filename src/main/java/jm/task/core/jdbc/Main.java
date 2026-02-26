package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl usrSrvImpl = new UserServiceImpl();
        usrSrvImpl.createUsersTable();
        usrSrvImpl.saveUser("John", "Cliucker", (byte) 50);
        System.out.println("User с именем — " + usrSrvImpl.getAllUsers().get(0).getName() + " " +
                usrSrvImpl.getAllUsers().get(0).getLastName() + " добавлен в базу данных");
        usrSrvImpl.saveUser("John", "Cramer", (byte) 65);
        System.out.println("User с именем — " + usrSrvImpl.getAllUsers().get(1).getName() + " " +
                usrSrvImpl.getAllUsers().get(1).getLastName() + " добавлен в базу данных");
        usrSrvImpl.saveUser("Billi", "Jean", (byte) 30);
        System.out.println("User с именем — " + usrSrvImpl.getAllUsers().get(2).getName() + " " +
                usrSrvImpl.getAllUsers().get(2).getLastName() + " добавлен в базу данных");
        usrSrvImpl.saveUser("Jeffrey", "Epshteyn", (byte) 66);
        System.out.println("User с именем — " + usrSrvImpl.getAllUsers().get(3).getName() + " " +
                usrSrvImpl.getAllUsers().get(3).getLastName() + " добавлен в базу данных");
        System.out.println(usrSrvImpl.getAllUsers().toString());
        usrSrvImpl.cleanUsersTable();
        usrSrvImpl.dropUsersTable();
    }
}
