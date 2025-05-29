package com.example.bugtracker.service;

import com.example.bugtracker.entity.BugReport;
import com.example.bugtracker.repository.BugReportRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BugReportService {

    private final BugReportRepository bugReportRepository;

    public BugReportService(BugReportRepository bugReportRepository) {
        this.bugReportRepository = bugReportRepository;
    }

    public BugReport save(BugReport bugReport) {
        return bugReportRepository.save(bugReport);
    }

    public List<BugReport> findAll() {
        return bugReportRepository.findAll();
    }

    public List<BugReport> findByProjectId(Long projectId) {
        return bugReportRepository.findByProjectId(projectId);
    }
}
