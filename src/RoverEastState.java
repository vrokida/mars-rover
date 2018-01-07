
public class RoverEastState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
        position.moveForwardInX();
        return position;
    }

    @Override
    public char turn(String instruction) {

        return instruction.equals("R") ? 'S' : 'N';
    }
}
