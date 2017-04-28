package command.factory;

import command.ActionCommand;
import command.CommandEnum;
import command.EmptyCommand;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Администратор on 28.04.2017.
 */
public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        // извлечение имени команды из запроса
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            // если команда не задана в текущем запросе
            return current;
        }
        // получение объекта, соответствующего команде
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", "command not found or wrong");
        }
        return current;
    }
}
