import OOP.*;

public class Main{

  public static void main(String[] args){
        System.out.println("Hello World");

        var player = new Player(1, "Player1", 100, 20, new Inventory(10), new Level(new XP()));
        var enemy = new Mob(2, "Cow", 50, 3, true); //health, name, damageDealer, isfreindly

      System.out.println(player.toString());
      System.out.println(enemy.toString());

      System.out.println("Player attacking enemy for " + player.getDamageDealer() + " damage.");

      //damage from the player is accounted from the equipped Item eg sword will be 10 damage

      player.damage(enemy);
      player.getInventory().addItem(new Item("Sword", 10, "Rare", 50));
      player.getInventory().addItem(new Item("Shield", 1, "Normal", 10));
      System.out.println(player.toString());
      System.out.println(enemy.toString());


    //  player.getPlayerLevel().getXp().toString();
     player.getPlayerLevel().setExactLevel(42);
      System.out.println("Player XP: " + player.getPlayerLevel().getXp());
      System.out.println("Player Level: " + player.getPlayerLevel().getLevel());
      player.getPlayerLevel().addXP(8000);
      System.out.println("NEW Player XP: " + player.getPlayerLevel().getXp());
      System.out.println("NEW Player Level: " + player.getPlayerLevel().getLevel());
    }

}