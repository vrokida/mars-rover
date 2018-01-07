package location;

public class East  extends BaseLocation implements Location {


    private Position position;
    private CardinalPoint direction = CardinalPoint.EAST;

    public East(Position position) {
        this.position = position;

    }

    @Override
    public CardinalPoint facingTo() {
        return direction;
    }



    @Override
    public Location move(String command) {
        return new East(new Position(position.getX()+1, position.getY()));
    }

//    @Override
//    public Direction turn(String instruction) {
//
//        return instruction.equals("R") ? new South() : new North();
//    }


}
