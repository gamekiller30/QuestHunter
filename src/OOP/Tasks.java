package OOP;

public class Tasks {

    private String name;
    private Reward reward; //reward will be a class that takes gold an Xp
    private int isCompleted; //percentage of task completion, could also be bool


    public Tasks(String name, Reward reward, int isCompleted){
        this.name = name;
        this.reward = reward;
        this.isCompleted = isCompleted;
    }

    public String getName(){
        return this.name;
    }

    public Reward getRewards(){
        return this.reward;
    }

    public int getIsCompleted(){
        return this.isCompleted;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setReward(Reward reward){
        this.reward = reward;
    }

    public void setIsCompleted(int isCompleted){
        this.isCompleted = isCompleted;
    }

    public String toString(){
        return "";
    }

}
