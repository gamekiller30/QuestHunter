package OOP;

public class Level {

    private int level;
    private double baseXP; // used to calculate level
    private XP xp;

    public Level(XP xp){
        this.xp = xp;
        this.baseXP = 1100;
        calculateLevel();
    }

    public void addXP(double xp){
       this.xp.setXP(this.xp.getXP() + xp);
       calculateLevel();
    }

    public void removeXP(int xp){
        this.xp.setXP(this.xp.getXP() - xp);
        calculateLevel();
    }

    private void calculateLevel(){
        //we have for certain level now we need the lvl but we have the XP
        double lvl = (Math.log(xp.getXP() / this.baseXP) / Math.log(1.1));
        int newLvl = (int) lvl;

        setLevel(Math.max(newLvl, 1));

    }

    public double getXPforLevel(int level){
        return  baseXP * Math.pow(1.1, level); //get XP for level
    }

    public XP getXp(){
        return xp;
    }

    public void setExactLevel(int level){
        //check how much XP we need to reach this level and add that XP

       double XPweNeed = getXPforLevel(level);
       double XPweHave = this.xp.getXP();

       double XPNeeded = Math.max(0, XPweNeed - XPweHave);

        addXP(XPNeeded);

    }

    public void setLevel(int level){
        this.level = level;
    }


    public double getLevel(){
        return level;
    }


}
