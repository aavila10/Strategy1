public interface Attack extends Ability{
    public default Integer attack(Monster m){
        return null;
    }
}