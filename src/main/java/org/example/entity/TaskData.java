package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String key) {
        if (key.equalsIgnoreCase("ann")) {
            return annsTasks;
        } else if (key.equalsIgnoreCase("bob")) {
            return bobsTasks;
        } else if (key.equalsIgnoreCase("carol")) {
            return carolsTasks;
        } else if (key.equalsIgnoreCase("all")) {
            Set<Task> allTasks = new HashSet<>();
            if (annsTasks != null) {
                allTasks.addAll(annsTasks);
            }
            if (bobsTasks != null) {
                allTasks.addAll(bobsTasks);
            }
            if (carolsTasks != null) {
                allTasks.addAll(carolsTasks);
            }
            if (unassignedTasks != null) {
                allTasks.addAll(unassignedTasks);
            }
            return allTasks;
        }
        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

}
