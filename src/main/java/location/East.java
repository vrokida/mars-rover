package location;

public class East  extends BaseLocation implements Location {



    public East(Position position) {
        this.position = position;
        this.direction = CardinalPoint.EAST;

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
