package com.bpdts.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"description", "priority"})
@JsonPropertyOrder({"description", "priority"})
@XmlRootElement(name = "task", namespace = "##default")
public class TaskDto {

    String description;

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
        TaskDto taskDto = (TaskDto) o;
        return priority == taskDto.priority &&
                description.equals(taskDto.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, priority);
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
