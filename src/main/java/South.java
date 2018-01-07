import location.CardinalPoint;

public class South extends BaseDirection implements Direction {

    @Override
    public CardinalPoint getCardinalPoint() {
        return CardinalPoint.SOUTH;
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX(), position.getY() - 1);
    }

    @Override
    public Direction turn(String instruction) {
        return instruction.equals("R") ? new West() : new East();
    }


}
