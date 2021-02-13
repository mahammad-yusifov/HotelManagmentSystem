package com.dev.hoteldb.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractConnect {
    public Connection connect() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hotel_management?serverTimezone=UTC";
        String username = "root";
        String password = "zero0";
        return DriverManager.getConnection(url, username, password);
    }

}
