package OOP;

public class Reward {

    //get the player and from his object update the others
    private Player player;
    //private Level lvl;
    //private Currency gold; //create superclass currency?!
    private double xp;
    private int gold;
    private int gems;

    public Reward(double xp, int gold, int gems){
        this.xp = xp;
        this.gold = gold;
        this.gems = gems;
    }

    public void setXp() {
        //set xp of the players level
        player.getPlayerLevel().addXP(this.xp);
    }

    public void setCurrency(){
        //...
        player.getPlayerCurrency().addGold(); //write this Currency Class
    }
}
