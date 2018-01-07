import location.CardinalPoint;

public class North extends BaseDirection implements Direction  {

    @Override
    public CardinalPoint getCardinalPoint() {
        return CardinalPoint.NORTH;
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX(), position.getY() + 1);
    }

    @Override
    public Direction turn(String instruction) {
        return instruction.equals("R") ? new East() : new West();
    }


}
