package command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Администратор on 28.04.2017.
 */
public class EmptyCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        /* в случае ошибки или прямого обращения к контроллеру
        * переадресация  */
        String page = "/jsp/test.jsp";
        return page;
    }
}
