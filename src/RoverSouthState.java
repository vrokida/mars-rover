public class RoverSouthState implements RoverDirectionState {

    private Rover rover;

    public RoverSouthState(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void move() {
        rover.getPosition().moveBackInY();
    }

    @Override
    public void turnRight() {
        this.rover.setState(new RoverWestState(rover));
        this.rover.setDirection(Direction.WEST);
    }

    @Override
    public void turnLeft() {
        this.rover.setState(new RoverEastState(rover));
        this.rover.setDirection(Direction.EAST);
    }
}
