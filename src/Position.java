public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveForwardInX() {
        this.x += 1;
    }

    public void moveBackInX() {
        this.x -= 1;
    }

    public void moveForwardInY() {
        this.y += 1;
    }

    public void moveBackInY() {
        this.y -= 1;
    }
}