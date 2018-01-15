public class Rover {

    private Position position;
    private Direction direction;
    private RoverDirectionState state;

    public Rover(int x, int y, String direction) {
        this.position = new Position(x, y);
        this.direction = Direction.fromString(direction);
        this.state = new RoverDirectionStateFactory().getState(this);
    }

    public Position getPosition() {
        return position;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public String getDirection() {
        return direction.getDirection();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setState(RoverDirectionState state) {
        this.state = state;
    }

    public void followInstructions(String instructions) {
        String[] instructionsKeys = instructions.split("");
        for (String instructionKey : instructionsKeys) {
            Command command = new CommandFactory().getCommand(instructionKey);
            command.execute(this.state);
        }
    }
}
