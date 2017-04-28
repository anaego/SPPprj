package command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Администратор on 28.04.2017.
 */
public interface ActionCommand {
    String execute(HttpServletRequest request);
}
