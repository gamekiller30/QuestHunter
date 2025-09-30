package OOP;

public class Quests {

    //10 daily tasks that change over time
    private Tasks Tasks[] = new Tasks[10];
    private int pointer = 0;

    public void getTasks(){
        for(int i = 0; i < pointer; i++){
           System.out.println(Tasks[i].getName());
        }
    }

    public void addTask(Tasks task){
        if(pointer < 10){
            Tasks[pointer++] = task;
        }
    }

    public void removeTask(){
        //search for taskname we want to remove ...
    }

    public void checkTaskCompletion(){
        //check if a task is completed -> remove task and add rewards to player
        //we call this every while true iteration ?
        //check how far task was completed -> update the isCompleted for the task

    }



}
