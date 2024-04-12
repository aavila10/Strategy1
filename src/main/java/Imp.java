import java.util.HashMap;

public class Imp extends Monster{


    public Imp(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        super(maxHp, xp, items);
    }

    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
