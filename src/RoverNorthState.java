
public class RoverNorthState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
       position.moveForwardInY();
        return position;
    }

    @Override
    public char turn(String instruction) {

        return instruction.equals("R") ? 'E' : 'W';
    }
}
