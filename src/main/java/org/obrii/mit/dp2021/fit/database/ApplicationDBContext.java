package org.obrii.mit.dp2021.fit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ApplicationDBContext {

    private static ApplicationDBContext dbContext;

    public static final String driverClassName = "org.postgresql.Driver";

    //local
    //private static final String connectionUrl = "jdbc:postgresql://localhost:5432/qwerty";
    //private static final String user = "postgres";
    //private static final String password = "1234";

    //obrii
    private static final String connectionUrl = "jdbc:postgresql://obrii.org:5432/db2021mit21s17";
    private static final String user = "s17";
    private static final String password = "4166";

    private ApplicationDBContext() {
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ApplicationDBContext getDbContext() {
        if (dbContext == null) {
            dbContext = new ApplicationDBContext();
        }
        return dbContext;
    }

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, user, password);
    }
}
