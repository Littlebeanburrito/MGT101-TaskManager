package edu.neumont.mgt101.model;

import java.util.ArrayList;

public class Task {
    private String taskName;
    private String taskDescription;
    private Statuses taskStatus;
    private TeamMember teamMember;
    private ArrayList<Priority> priorityLevel;

    public Task(String taskName, String taskDescription, Statuses taskStatus) {
        setTaskName(taskName);
        setTaskDescription(taskDescription);
        setTaskStatus(taskStatus);
        new ArrayList<Priority>();
    }

    //region Getter/Setters

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Statuses getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Statuses taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ArrayList<Priority> getPriority() {
        return new ArrayList<>(priorityLevel);
    }

    public TeamMember getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(TeamMember teamMember) {
        this.teamMember = teamMember;
    }

    //endregion

    public void addPriorityLevel(Priority priorityLevel) {
        this.priorityLevel.add(priorityLevel);
    }
}
