package dao;

import entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

/**
 * Created by Администратор on 28.04.2017.
 */
public class UserDao {
    private static final String SELECT_USER_BY_ID = "SELECT * FROM sppschema.user WHERE u_id=?";

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

    public static HashSet<User> getAllUsers() {
        return null;
    }

}
