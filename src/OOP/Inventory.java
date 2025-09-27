package OOP;

public class Inventory {

    protected Item[] inventory;
    private int itemsInInventory = 0;

    public Inventory(int size){
        //set size of inventory arr how many items a player can hold
        inventory = new Item[size];
    }

    public String getItems(){

        String items = "\n Inventory/Items: \n Name Damage Rarity UnlockedAt";

        for(int i = 0; i < itemsInInventory; i++){

            //System.out.println("looped trough item: " + inventory[i]);

            items += "\n" + inventory[i].toString();
        }

        return items;
    }


    public boolean addItem(Item item){
        if(itemsInInventory < inventory.length){
            inventory[itemsInInventory++] = item;
            return true;
        }

        return false;
    }

  /*  public Item clone(){

        Item[] clonedInv = new Item[inventory.length];

        for(int i = 0; i < itemsInInventory; i++){
            clonedInv[i] = new Item("sdf"); //inventory[i]
        }

        return clonedInv;
    }*/

}
