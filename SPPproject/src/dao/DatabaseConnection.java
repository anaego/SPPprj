package dao;

import org.apache.commons.dbcp2.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Администратор on 28.04.2017.
 */
public class DatabaseConnection {
    private static final BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3307/finalschema");
        dataSource.setUsername("root");
        dataSource.setPassword("1");
    }

    private DatabaseConnection() {
        //
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
