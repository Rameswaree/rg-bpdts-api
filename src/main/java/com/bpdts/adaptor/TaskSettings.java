package com.bpdts.adaptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskSettings {

    @JsonProperty("description")
    String description;

    @JsonProperty("priority")
    int priority;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskSettings that = (TaskSettings) o;
        return priority == that.priority &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, priority);
    }

    @Override
    public String toString() {
        return "TaskSettings{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
