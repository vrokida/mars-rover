import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CommandFactoryTest {

    @Test
    public void shouldGetMoeCommand() {
        CommandFactory commandFactory = new CommandFactory();

        Command command = commandFactory.getCommand("M");

        assertTrue(command instanceof MoveCommand);
    }

    @Test
    public void shouldGetTurnLeftMove() {
        CommandFactory commandFactory = new CommandFactory();

        Command command = commandFactory.getCommand("L");

        assertTrue(command instanceof TurnLeftCommand);
    }

    @Test
    public void shouldGetTurnRightMove() {
        CommandFactory commandFactory = new CommandFactory();

        Command command = commandFactory.getCommand("R");

        assertTrue(command instanceof TurnRightCommand);
    }
}