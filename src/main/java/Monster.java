import java.util.HashMap;

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private HashMap<String, Integer> items;


    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHp;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString() {
        return "hp=" + hp +
                ", xp=" + xp +
                ", maxHP=" + maxHP +
                ", items=" + items +
                '}';
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
