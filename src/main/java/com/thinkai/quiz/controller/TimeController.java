package com.thinkai.quiz.controller;

import com.thinkai.quiz.Entity.Model;
import com.thinkai.quiz.Service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/time")
public class TimeController {
    @Autowired
    private TimeService timeRangeService;

    @PostMapping
    public ResponseEntity<Model> addTimeRange(@RequestParam String startTime, @RequestParam String endTime) {
        Model savedTimeRange = timeRangeService.saveTimeRange(startTime, endTime);
        return ResponseEntity.ok(savedTimeRange);
    }

    @GetMapping
    public ResponseEntity<Model> getTimeRange() {
        Model timeRange = timeRangeService.getTimeRange();
        return timeRange != null ? ResponseEntity.ok(timeRange) : ResponseEntity.notFound().build();
    }
}