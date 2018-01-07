public class Rover {

    private int x;

    private int y;

    private char direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }


    public void followInstructions(String instructions) {
        if (instructions.equals("M")) {
            move();
        } else {
            turn();
        }
    }

    private void turn() {
        if(this.direction == 'N') {
            this.direction = 'E';
        }
        else if(this.direction == 'E') {
            this.direction = 'S';
        }
    }

    private void move() {
        if (this.direction == 'N') {
            this.x += 1;
        }
        if (this.direction == 'S') {
            this.x -= 1;
        }
    }
}
