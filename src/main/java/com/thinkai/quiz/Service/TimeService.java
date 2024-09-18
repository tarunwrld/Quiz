package com.thinkai.quiz.Service;

import com.thinkai.quiz.Entity.Model;
import com.thinkai.quiz.Repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    @Autowired
    private repository timeRangeRepository;
    public Model saveTimeRange(String startTime, String endTime) {
        // Delete the old entry (if exists)
        timeRangeRepository.deleteAll();

        // Create a new TimeRange
        Model timeRange = new Model();
        timeRange.setStartTime(startTime);
        timeRange.setEndTime(endTime);

        // Save the new entry
        return timeRangeRepository.save(timeRange);
    }

    public Model getTimeRange() {
        return timeRangeRepository.findById(1L).orElse(null); // Only one entry exists
    }
}