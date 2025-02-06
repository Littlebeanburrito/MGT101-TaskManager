package edu.neumont.mgt101.view;

import edu.neumont.mgt101.model.*;

public class TaskUI {

    //Create tasks with descriptions, due dates, and priorities.
    //task.getName() - gets String name of task
    //task.getDescription() - gets String Description of the task
    //task.getPriority()<String> - gets an ArrayList of the priority that we need done - Array has String priority and String Due Date
    //Ex: Lay Rebar, Due Date: 07/21/2025
    public void task(Task task) {
        System.out.println(task.getTaskName());
        System.out.println(task.getTaskDescription() + "\n");
        System.out.println("Task:");

        for (int i = 0; i < task.getPriority().size(); i++) {
            System.out.println(task.getPriority().get(i));
        }
    }

    //Shows teamMember
    //TeamMember.getName() - returns the String name of the team member
    //TeamMember.getTask() - returns the Task that the teamMember is working on
    public void teamMember(TeamMember tm) {
        System.out.println("Team Member: " + tm.getName());
        System.out.println("Task: " + tm.getTask().getTaskName());
    }

    //Track task statuses (e.g., To Do, In Progress, Done).
    //Task.getName() - returns String task Name
    //Task.getTeamMember() - returns TeamMember working on the project
    //Task.getStatuses() - returns Enum statuses of the task
    public void taskStatuses(Task task) {
        System.out.println("Task: " + task.getTaskName() + ", Team Member: " + task.getTeamMember().getName() + ", Statuses: " + task.getTaskStatus());
    }


    //prints out the summary of the Project
    //Project.getName() - returns String Name of the project
    //Project.getProjectTask() - returns ArrayList of the task added to the project
    public void getSummary(Project project) {
        System.out.println(project.getProjectName() + "\n");
        System.out.println("Tasks: ");

        for (int i = 0; i < project.getTasks().size(); i++) {
            System.out.println(project.getTasks().get(i));
        }
    }
}
