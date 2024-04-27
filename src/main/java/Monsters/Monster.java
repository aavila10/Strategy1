package Monsters;

import Abilities.*;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp;

    Integer agi = 10;

    Integer str = 10;

    Integer def = 10;

    Attack attack;

    public Integer getAgi() {
        return agi;
    }

    public Integer getStr() {
        return str;
    }

    public Integer getDef() {
        return def;
    }

    private Integer maxHP;
    private HashMap<String, Integer> items = new HashMap<>();


    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHp;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (getHp() != null ? !getHp().equals(monster.getHp()) : monster.getHp() != null) return false;
        if (getXp() != null ? !getXp().equals(monster.getXp()) : monster.getXp() != null) return false;
        if (getMaxHP() != null ? !getMaxHP().equals(monster.getMaxHP()) : monster.getMaxHP() != null) return false;
        return getItems() != null ? getItems().equals(monster.getItems()) : monster.getItems() == null;
    }

    @Override
    public int hashCode() {
        int result = getHp() != null ? getHp().hashCode() : 0;
        result = 31 * result + (getXp() != null ? getXp().hashCode() : 0);
        result = 31 * result + (getMaxHP() != null ? getMaxHP().hashCode() : 0);
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }


    boolean takeDamage(Integer dam){
        if(dam > 0) {
            this.setHp(this.getHp() - dam);
            System.out.println("The creature was hit for " + dam + " damage");


            if (this.getHp() <= 0) {
                System.out.println("Oh no! the creature has perished");
                System.out.println(toString());
                return false;
            }

        }
        return true;
    }


    public Integer attackTarget(Monster target){
        int damage = attack.attack(target);
        return damage;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }


    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
}
