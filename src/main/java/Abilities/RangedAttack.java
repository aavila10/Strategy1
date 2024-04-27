package Abilities;
import Monsters.*;
public class RangedAttack implements Attack {
    Monster attacker;
    public RangedAttack(Monster attacker){
        this.attacker = attacker;
    }



    @Override
    public Integer attack(Monster target){
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getDef();
    }
}