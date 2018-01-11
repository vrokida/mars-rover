
public class MoveCommand implements Command {
    @Override
    public void execute(RoverDirectionState state) {
        state.move();
    }
}
