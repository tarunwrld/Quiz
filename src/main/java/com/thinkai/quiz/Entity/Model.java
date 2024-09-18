package com.thinkai.quiz.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Model {

    @Id
    private Long id = 1L; // Only one entry will exist

    private String startTime; // Start time in 24-hour format
    private String endTime;   // End time in 24-hour format

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}