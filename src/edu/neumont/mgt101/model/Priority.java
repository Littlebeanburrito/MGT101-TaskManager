package edu.neumont.mgt101.model;

public class Priority {
    private String name;
    private Task task;

    public Priority(String name, Task task) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
