import java.util.HashMap;
import java.util.Map;

public class FactoryCommand {

    private Map<String, Command> mapOfCommands;

    public FactoryCommand() {
        this.mapOfCommands = new HashMap<>();
        this.mapOfCommands.put("M", new MoveCommand());
        this.mapOfCommands.put("L", new TurnLeftCommand());
        this.mapOfCommands.put("R", new TurnRightCommand());
    }

    public Command getCommand(String commandKey) {

        return this.mapOfCommands.get(commandKey);
    }
}
