
public class RoverNorthState implements RoverDirectionState {

    @Override
    public Position move(Rover rover) {
        return new Position(rover.getX(), rover.getY() + 1);
    }

    @Override
    public char turn(String instruction) {
        return instruction.equals("R") ? 'E' : 'W';
    }
}
