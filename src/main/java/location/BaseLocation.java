package location;

public abstract class BaseLocation implements Location {

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Direction) {
//            return getCardinalPoint().equals(((Direction) (obj)).getCardinalPoint());
//        }
//        return false;
//    }
protected Position position;
    protected  CardinalPoint direction;

    @Override
    public String toString() {
        return "X:"+position.x +" Y:"+position.y +" "+direction;
    }
}
