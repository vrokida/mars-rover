package location;

public class South extends BaseLocation implements Location {

    private Position position;
    private CardinalPoint direction = CardinalPoint.SOUTH;

    public South(Position position) {
        this.position = position;

    }

    @Override
    public CardinalPoint facingTo() {
        return direction;
    }



    @Override
    public Location move(String command) {
        return new South(new Position(position.getX(), position.getY() - 1));
    }

//    @Override
//    public Direction turn(String instruction) {
//        return instruction.equals("R") ? new West() : new East();
//    }


}
