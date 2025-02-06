package edu.neumont.mgt101.model;

import java.util.ArrayList;

public class Project {
    private String projectName;
    ArrayList<Task> tasks;
    ArrayList<TeamMember> teamMembers;

    public Project(String projectName) {
        setProjectName(projectName);
        new ArrayList<Task>();
        new ArrayList<TeamMember>();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ArrayList<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public ArrayList<TeamMember> getTeamMembers() {
        return teamMembers;
    }
}
