package edu.neumont.mgt101.model;

import java.util.ArrayList;

public class Task {
    private String taskName;
    private String taskDescription;
    private Statuses taskStatus;
    private ArrayList<TeamMember> teamMember;
    private Priority priority;

    public Task(String taskName, String taskDescription, Statuses taskStatus, Priority priority) {
        setTaskName(taskName);
        setTaskDescription(taskDescription);
        setTaskStatus(taskStatus);
        setPriority(priority);
        new ArrayList<TeamMember>();
    }

    //region Getter/Setters

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        if (taskName == null || taskName.isBlank()) {
            throw new IllegalArgumentException("Task name cannot be null or empty");
        }
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        if (taskDescription == null || taskDescription.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be null or empty");
        }
        this.taskDescription = taskDescription;
    }

    public Statuses getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Statuses taskStatus) {
        if (taskStatus == null) {
            throw new IllegalArgumentException("Task status cannot be null");
        }
        this.taskStatus = taskStatus;
    }

    public ArrayList<TeamMember> getTeamMember() {
        return new ArrayList<>(teamMember);
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    //endregion

    public void addTeamMember(TeamMember teamMember) {
        if (teamMember == null) {
            throw new IllegalArgumentException("Team member cannot be null");
        }
        this.teamMember.add(teamMember);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus=" + taskStatus +
                ", teamMember=" + teamMember +
                ", priority=" + priority +
                '}';
    }
}
