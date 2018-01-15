
public class TurnLeftCommand implements Command {
    @Override
    public void execute(RoverDirectionState state) {
        state.turnLeft();
    }
}
