public abstract class BaseDirection implements Direction{

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Direction) {
            return getCardinalPoint().equals(((Direction) (obj)).getCardinalPoint());
        }
        return false;
    }
}
