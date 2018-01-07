
public class RoverWestState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
        position.moveBackInX();
        return position;
    }

    @Override
    public char turn(String instruction) {

        return instruction.equals("R") ? 'N' : 'S';
    }
}
