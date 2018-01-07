public class Rover {

    private Position position;

    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.position = new Position(x, y);
        this.direction = direction;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public Direction getDirection() {
        return direction;
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
//        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();
//        this.direction = roverDirectionStatePrototype.prototype(this.direction).turn(instruction);
        this.direction = this.direction.turn(instruction);
    }

    private void move() {
//        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();
//        this.position = roverDirectionStatePrototype.prototype(this.direction).move(this);
        this.position = this.direction.move(this.position);
    }
}
