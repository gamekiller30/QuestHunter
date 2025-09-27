package OOP;

public class Player extends  Entity{

    private Inventory inventory;
    private Level level;

    public Player(int ID, String name, int health, int damageDealer, Inventory inventory, Level level){
        super(ID, name, health, damageDealer);
        this.inventory = inventory;
        this.level = level;
    }

    public Inventory getInventory(){
      return this.inventory;
    }

    public Level getPlayerLevel(){
        return this.level;
    }

    public String toString(){
        return super.toString() + getInventory().getItems();
    }

}

