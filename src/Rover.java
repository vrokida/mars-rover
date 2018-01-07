public class Rover {

    private Position position;

    private char direction;

    public Rover(int x, int y, char direction) {
        this.position = new Position(x, y);
        this.direction = direction;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public char getDirection() {
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
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();
        this.direction = roverDirectionStatePrototype.prototype(this.direction).turn(instruction);
    }

    private void move() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();
        this.position = roverDirectionStatePrototype.prototype(this.direction).move(this);
    }
}
