
public class RoverSouthState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
        position.moveBackInY();
        return position;
    }

    @Override
    public char turn(String instruction) {
        return instruction.equals("R") ? 'W' : 'E';
    }
}
