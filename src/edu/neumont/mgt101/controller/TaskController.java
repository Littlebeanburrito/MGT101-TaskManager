package edu.neumont.mgt101.controller;

import edu.neumont.mgt101.model.*;
import edu.neumont.mgt101.view.TaskUI;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskController {
    ArrayList<Task> tasks = new ArrayList<Task>();
    Task task;
    TeamMember teamMember;
    Project project;
    TaskUI taskUI;
    public void run(){
        Scanner taskScanner = new Scanner(System.in);

        do {
            System.out.println("""
                    1.Add Task
                    2.Assign Task
                    3.exit
                    """);
            switch (taskScanner.nextLine()) {
                case "1":
                    addTask();
                    break;
                case "2":
                    assignTask();
                    break;
                case "3":
                    break;
//                case :
//                    break;
                default:
                    break;
            }
        }while(true);
    }

    private void assignTask() {
    }

    private void addTask() {

    }


}
