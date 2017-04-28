package dao;

import entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Администратор on 28.04.2017.
 */
public class UserDao {
    /*static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/";*/

    private static final String SELECT_ALL_USERS = "SELECT * FROM sppschema.user";

    private static User extractUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();

        user.setId( rs.getInt("u_id") );
        user.setLogin( rs.getString("u_login") );
        user.setPassword( rs.getString("u_password") );
        user.setEmail( rs.getString("u_email") );
        user.setName( rs.getString("u_name") );
        user.setSurname( rs.getString("u_surname") );
        user.setFathersName( rs.getString("u_fathers_name") );
        user.setRoleId(rs.getInt("u_role") );
        user.setPassportNumber( rs.getString("u_passport_number") );

        return user;
    }

    public static ArrayList<User> getAllUsers() {
        Connection connection = null;
        PreparedStatement ps = null;
        ArrayList<User> result = new ArrayList<>();
        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result.add(extractUserFromResultSet(rs));
            }
        } catch (Exception e) {
            //throw new DAOException(e);
        } finally {
            close(ps);
            close(connection);
        }
        return result;
    }

    public static void close(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            // лог о невозможности закрытия Statement
        }
    }

    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            //throw new DAOException(e);
        }
    }

}
