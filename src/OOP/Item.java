package OOP;

public class Item {

    private String name;
    private int damage;
    private String rarity;
    private int lockedUntilLvl;

    public Item(String name, int damage, String rarity, int lockedUntilLvl){
        this.name = name;
        this.damage = damage;
        this.rarity = rarity;
        this.lockedUntilLvl = lockedUntilLvl;
    }

    public String toString(){
        return name + " " + damage +  " " + rarity+  " "  + lockedUntilLvl;
    }

}
