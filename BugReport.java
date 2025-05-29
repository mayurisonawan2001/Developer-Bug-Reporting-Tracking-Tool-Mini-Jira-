package com.example.bugtracker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bug_reports")
public class BugReport {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String priority; // Low, Medium, High
    private String status; // Open, In Progress, Closed

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "reporter_id")
    private User reporter;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    private User assignee;
}
