package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {

    private final String title;
    private final String description;
    private final User assigneedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadLline;

    public Task(String title, String description,
                User assigneedUser, User creator,
                LocalDate created, LocalDate deadLline) {
        this.title = title;
        this.description = description;
        this.assigneedUser = assigneedUser;
        this.creator = creator;
        this.created = created;
        this.deadLline = deadLline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssigneedUser() {
        return assigneedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadLline() {
        return deadLline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assigneedUser=" + assigneedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadLline=" + deadLline +
                '}';
    }
}
