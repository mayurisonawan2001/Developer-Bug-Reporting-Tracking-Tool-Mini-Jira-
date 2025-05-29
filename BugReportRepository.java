package com.example.bugtracker.repository;

import com.example.bugtracker.entity.BugReport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BugReportRepository extends JpaRepository<BugReport, Long> {
    List<BugReport> findByProjectId(Long projectId);
}
