
public class TurnRightCommand implements Command {
    @Override
    public void execute(RoverDirectionState state) {
        state.turnRight();
    }
}
