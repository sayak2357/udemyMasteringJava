
import java.util.*;

public class Monster implements ISaveable{
    private String name;
    private int strength,hitPoints;

    public Monster(String name, int strength, int hitPoints) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(Integer.toString(this.hitPoints));
        values.add(Integer.toString(this.strength));

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + "'" +

                ", hitPoints=" + hitPoints +
                ", strength=" + strength+
                '}';
    }
}
