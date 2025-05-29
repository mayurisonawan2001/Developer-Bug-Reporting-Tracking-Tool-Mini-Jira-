# Developer Bug Reporting & Tracking Tool (Mini Jira)

## Overview
This project is a simplified bug reporting and tracking system designed to help developers, testers, and project managers efficiently report, assign, and track bugs across multiple software projects. Built using Java and Spring Boot, it leverages Hibernate for ORM, MySQL for data storage, and Spring Security for role-based authentication and authorization.

## Features
- Role-based access control (Admin, Developer, Tester) with Spring Security
- User authentication and authorization
- Manage projects and assign bugs to users
- Create, update, and track bug reports with status and priority
- RESTful APIs for seamless integration with frontend or mobile applications
- Secure password handling and session management (can be extended with JWT)
- Easy database management with Hibernate and MySQL

## Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring Security
- MySQL
- Maven/Gradle (build tool)
- Lombok (optional for code simplification)
- Postman (for API testing)

## Getting Started

### Prerequisites
- Java 17 or higher installed
- MySQL server installed and running
- Maven or Gradle for building the project

### Setup Instructions
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/bug-tracker.git
   cd bug-tracker
