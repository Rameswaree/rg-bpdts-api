package com.bpdts.adaptor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
     @Table(name = "task")
     class Task {

         @Column(name = "id", nullable = false)
         @Id
         int id;

         @Column(name = "description", nullable = false)
         String description;

         @Column(name = "priority")
         int priority;

         public int getId() {
             return id;
         }

         public void setId(int id) {
             this.id = id;
         }

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
        Task task = (Task) o;
        return id == task.id &&
                priority == task.priority &&
                description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}

