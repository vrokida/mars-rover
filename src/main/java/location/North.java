package location;

public class North extends BaseLocation implements Location {

    private Position position;
    private CardinalPoint direction = CardinalPoint.NORTH;

    public North(Position position) {
        this.position = position;

    }

    @Override
    public CardinalPoint facingTo() {
        return direction;
    }

    @Override
    public Location move(String  command) {
        return new North(new Position(position.getX(), position.getY() + 1));
    }

//    @Override
//    public Direction turn(String instruction) {
//        return instruction.equals("R") ? new East() : new West();
//    }


}
