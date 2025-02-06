package edu.neumont.mgt101.model;

public class TeamMember {
    private String name;
    private Task task;

    public TeamMember(String name, Task task) {
        setTeamName(name);
    }

    public String getName() {
        return name;
    }

    public void setTeamName(String name) {
        this.name = name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", task=" + task +
                '}';
    }
}
