package OOP;

public class Mob extends  Entity{

    private boolean isFriendly;

    public Mob(int ID, String name, int health, int damageDealer, boolean isFriendly){

        super(ID, name, health, damageDealer);
        this.isFriendly = isFriendly;

    }

}
