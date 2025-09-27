package OOP;

public class Entity {

    private int ID;
    private String name;
    private int health;
    private int damageDealer;


    public Entity(int ID, String name, int health, int damageDealer){
        this.ID = ID;
        this.name = name;
        this.health = health;
        this.damageDealer = damageDealer;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
      return health;
    }

    public void setHealth(int health){

        if(this.health > 0){
            this.health = health;
        }
    }

    public int getDamageDealer(){
        return damageDealer;
    }

    public void setDamageDealer(int damageDealer){
        this.damageDealer = damageDealer;
    }

    public void damage(Entity entity){
        //insert the entity u want to damage
        entity.lowerHealth(this.damageDealer);
    }

    public void lowerHealth(int damage){
        setHealth(this.health -= damage); //change the health and get current health of entity in next step
    }

    public String toString(){
        return "Name: " + name + " Health: " + health + " dealing " + damageDealer + " Damage";
    }

}
