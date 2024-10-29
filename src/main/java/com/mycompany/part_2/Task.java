/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part_2;

//import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Task {
   
  private  String taskName, taskDescription, developerName, t,  taskNam,taskId,taskD,developer,task,tas, durationInput,
          status="To do";
    private int taskDuration,taskNum;

    private static int totalTaskDuration = 0, estimatedDuration;
   
    
        public boolean checkDescription(String taskD){
//Checking the description meet the requirements
if(taskD.length()>50){
    JOptionPane.showMessageDialog(null,"Reach the maximum character");
}
if(taskD.length()<50){
   JOptionPane.showMessageDialog(null,"Sucessfully Captured");
}
   return true;  }

    /**
     *
     * @return
     */
    public String createTaskID(String taskNam,int taskNum,String developer){
        //String manipulation for task ID
        return String.format("%s:%d:%s", taskNam.substring(0,2).toUpperCase(),taskNum,
                developer.substring(developer.length()-3).toUpperCase());
    }
     public String printTaskDetails(String taskNam, String taskId, String taskD, String developer, int taskNum, String status,String durationInput ){
          // the order the information should display
        return 
                     
"Task Status :"+  status+"\n"
                + "Task Name :"+taskNam+"\n"
                        + "Task Number :"+taskNum+"\n"
                                + "Task Description :"+taskD+"\n"
                                        + " Developer Details :"+developer+"\n"
                                                + "Task Duration :"+  durationInput +"\n"
                                                        + "Task ID:"+createTaskID(taskNam,taskNum,developer) ;   }
     

 
     public int time(){
        
       
      return estimatedDuration;
              }
  
    public void Task(String taskNam, String taskId, String taskD, String developer, int taskNum, String status){
        this.taskNam = taskName;
        this.taskNum = taskNum;
        this.taskD = taskDescription;
        this.developer = developerName;
        this.taskDuration = taskDuration;
        this.status = status;
        this.taskId = createTaskID(taskNam,taskNum,developer);
    }

    
     public void display(){
         //Show the user is in development
         JOptionPane.showMessageDialog(null, "Coming Soon", "Report",
                 JOptionPane.INFORMATION_MESSAGE);
       
      
    
      }


       public void addTask(){
           //Prompt the user to enter the number of tasks
       String task= JOptionPane.showInputDialog(null,"Number of Tasks"
            );
 int  t= Integer.parseInt(task);
  String[] tas=new String[t];
    for(int i=0;i<t;i++){
        //Prompting user to enter their task
        String[] statusOptions = {"To Do", "Doing", "Done"};
             status = (String) JOptionPane.showInputDialog(null, "Select task status:", "Task Status", 
                                                                      JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);
      taskName  =JOptionPane.showInputDialog(null, "Enter task name "+(i+1));
        taskDescription = JOptionPane.showInputDialog(null,"Enter task description"); 
      checkDescription( taskDescription);
          developerName   =JOptionPane.showInputDialog(null, "Enter developer name");
          //JOptionPane.showMessageDialog(null, createTaskID(taskNam, t, developer));
         durationInput     =JOptionPane.showInputDialog(null, "Enter Time");
        estimatedDuration  =Integer.parseInt(durationInput);
        JOptionPane.showMessageDialog(null ,printTaskDetails(taskName, taskId, taskDescription, developerName, i+1, status,durationInput ));
      // Task ad= new Task();
      // Task(taskName, taskId, taskDescription, developerName, i+1, status);
       int totalHours=0;
       for (Task tas:task){
           totalHours+=time();
       }
       }
       }
}

