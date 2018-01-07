public class Rover {

    private Position position;

    private Direction direction;

    public Rover(int x, int y, String direction) {
        this.position = new Position(x, y);
        this.direction = Direction.fromString(direction);
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

    public void followInstructions(String instructions) {
        String[] instructionsKeys = instructions.split("");
        for (String instructionKey : instructionsKeys) {
            if (instructionKey.equals("M")) {
                move();
            } else {
                turn(instructions);
            }
        }
    }

    private void turn(String instruction) {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();
        if(instruction.equals("R")) {
            this.direction = roverDirectionStatePrototype.prototype(this.direction).turnRight();
        }else {
            this.direction = roverDirectionStatePrototype.prototype(this.direction).turnLeft();
        }
    }

    private void move() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();
        this.position = roverDirectionStatePrototype.prototype(this.direction).move(this.position);
    }
}
