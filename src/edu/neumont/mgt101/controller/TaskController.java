package edu.neumont.mgt101.controller;

import edu.neumont.mgt101.model.*;
import edu.neumont.mgt101.view.TaskUI;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskController {
    Scanner taskScanner = new Scanner(System.in);
    ArrayList<Task> tasks = new ArrayList<Task>();
    Task task;
    TeamMember teamMember;
    Project project;
    TaskUI taskUI;

    public void run() {

        do {
            System.out.println("""
                    1.Add Task
                    2.Assign Task
                    3.Get Summary
                    4.exit
                    """);
            switch (taskScanner.nextLine()) {
                case "1":
                    addTask();
                    break;
                case "2":
                    assignTask();
                    break;
                case "3":
//                    taskUI.getSummary();
                    break;
                default:
                    return;
            }
        } while (true);
    }

    private void assignTask() {
    }

    private void addTask() {
        System.out.println("What is the name of the task?");
        String taskName = taskScanner.nextLine();
        System.out.println("What is the description of the task?");
        String taskDescription = taskScanner.nextLine();
        System.out.println("What is the tasks status of the task?");
        System.out.println("""
                1. Completed
                2. To Do
                3. In Progress
                """);
        Statuses statuses;
        switch (taskScanner.nextLine()) {
            case "1":
                statuses = Statuses.COMPLETED;
                break;
            case "2":
                statuses = Statuses.TO_DO;
                break;
            default:
                statuses = Statuses.IN_PROGRESS;
                break;
        }
        System.out.println("Who are your team members");
        String teamMemberName = taskScanner.nextLine();

        Priority priority;
        System.out.println("What is the priority of the task?");
        System.out.println("""
                1.Low
                2.Medium
                3.High
                4.Urgent
                5.Critical
                """);
        switch (taskScanner.nextLine()) {
            case "1":
                priority = Priority.LOW;
                break;
            case "2":
                priority = Priority.MEDIUM;
                break;
            case "3":
                priority = Priority.HIGH;
                break;
            case "4":
                priority = Priority.URGENT;
                break;
            default:
                priority = Priority.CRITICAL;
        }


        tasks.add(new Task(taskName, taskDescription, statuses, priority));
        taskUI.task(tasks.get(tasks.size() - 1));
    }


}
