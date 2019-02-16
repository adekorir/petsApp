package com.felix.pets;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class DB {

    public static Connection connect() throws SQLException {
        return getConnection("jdbc:mysql://localhost:3306/pet", "root", "");
    }
}
