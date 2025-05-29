package com.example.bugtracker.controller;

import com.example.bugtracker.entity.BugReport;
import com.example.bugtracker.service.BugReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bugs")
public class BugReportController {

    private final BugReportService bugReportService;

    public BugReportController(BugReportService bugReportService) {
        this.bugReportService = bugReportService;
    }

    @GetMapping
    public ResponseEntity<List<BugReport>> getAllBugs() {
        return ResponseEntity.ok(bugReportService.findAll());
    }

    @GetMapping("/project/{projectId}")
    public ResponseEntity<List<BugReport>> getBugsByProject(@PathVariable Long projectId) {
        return ResponseEntity.ok(bugReportService.findByProjectId(projectId));
    }

    @PostMapping
    public ResponseEntity<BugReport> createBug(@RequestBody BugReport bugReport) {
        return ResponseEntity.ok(bugReportService.save(bugReport));
    }
}
