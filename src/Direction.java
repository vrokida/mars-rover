public enum Direction {

    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public static Direction fromString(String directionText) {
        for (Direction direction : Direction.values()) {
            if (direction.direction.equalsIgnoreCase(directionText)) {
                return direction;
            }
        }
        return null;
    }
}
