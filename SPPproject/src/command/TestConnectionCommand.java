package command;

import dao.UserDao;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by Администратор on 28.04.2017.
 */
public class TestConnectionCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        HttpSession session = request.getSession(true);

        String page = null;

        try {
            ArrayList<User> allUsers = UserDao.getAllUsers();
            if (allUsers.size() != 0) {
                request.setAttribute("users", allUsers);
                // определение пути к main.jsp
                page = "/jsp/test.jsp";
            } else {
                request.setAttribute("errorMessage", "test command error");
                page = "/jsp/test.jsp";
            }
        } catch (Exception e) {
            request.setAttribute("errorMessage", "test logic error");
            page = "/jsp/test.jsp";
        }
        return page;
    }
}
