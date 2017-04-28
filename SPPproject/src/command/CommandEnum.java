package command;

/**
 * Created by Администратор on 28.04.2017.
 */
public enum CommandEnum {

    TEST {
        {
            this.command = new TestConnectionCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
