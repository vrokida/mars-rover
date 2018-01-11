import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FactoryCommandTest {

    @Test
    public void shouldGetMoeCommand() {
        FactoryCommand factoryCommand = new FactoryCommand();

        Command command = factoryCommand.getCommand("M");

        assertTrue(command instanceof MoveCommand);
    }

    @Test
    public void shouldGetTurnLeftMove() {
        FactoryCommand factoryCommand = new FactoryCommand();

        Command command = factoryCommand.getCommand("L");

        assertTrue(command instanceof TurnLeftCommand);
    }

    @Test
    public void shouldGetTurnRightMove() {
        FactoryCommand factoryCommand = new FactoryCommand();

        Command command = factoryCommand.getCommand("R");

        assertTrue(command instanceof TurnRightCommand);
    }
}