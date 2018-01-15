
public class RoverEastState implements RoverDirectionState {

    private Rover rover;

    public RoverEastState(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void move() {
        rover.getPosition().moveForwardInX();
    }

    @Override
    public void turnRight() {
        this.rover.setState(new RoverSouthState(rover));
        this.rover.setDirection(Direction.SOUTH);
    }

    @Override
    public void turnLeft() {
        this.rover.setState(new RoverNorthState(rover));
        this.rover.setDirection(Direction.NORTH);
    }
}
