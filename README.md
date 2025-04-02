Multithreaded Web-Based Data Management Application

Table of Contents

Project Overview

OS Topics Covered

Group Members

Rationale

Features and Capabilities

Tech Stack

Project Plan

Submission

Project Overview

This project focuses on designing and implementing a web-based data management system that efficiently processes and stores user inputs using multithreading. The application will leverage modern operating system functionalities, such as process and thread management, file management, and synchronization, to ensure high-speed and low-latency data processing.

OS Topics Covered

This project incorporates the following OS topics:

Process and Thread States, Structures, and Functions

IPC Mechanisms

Synchronization

Memory Management

Group Members

Myself

Rationale

Web-based applications often require efficient handling of user inputs, data execution, and reliable storage. This project aims to create a multithreaded web-based data management system that:

Processes user inputs quickly using Java threads.

Logs data to files as a backup mechanism.

Prevents race conditions through synchronization techniques.

Manages system resources effectively with multithreading and concurrency control.

Features and Capabilities

1. Process and Thread Management

Java threads and ExecutorService will handle concurrent user requests.

Each request will be processed in a separate thread for better efficiency.

2. File Management

User inputs will be logged to files as a backup.

Ensures redundancy in case of database failures.

3. Synchronization

Prevents race conditions on shared resources (database, log files).

Implements locks and synchronized blocks for controlled resource access.

Tech Stack

Backend: Java (Spring Boot)

Database: MySQL

Concurrency: Java Threads, ExecutorService

Frontend: HTML, CSS, JavaScript

Project Plan

Week 1: Project Setup & Initial Development

Set up Spring Boot project.

Configure MySQL database.

Design database schema.

Implement basic backend endpoints.

Week 2: Multithreading & File Management

Implement Java threads for handling user input.

Introduce file logging for input backup.

Ensure database writes and file logs execute in separate threads.

Conduct initial concurrency testing.

Week 3: Synchronization & Data Consistency

Implement synchronization techniques (locks, synchronized blocks).

Manage concurrent database writes.

Optimize file logging system to prevent conflicts.

Week 4: Web-based Frontend

Develop a simple web-based UI.

Ensure correct HTTP communication between frontend and backend.

Validate user input handling.

Week 5: Optimization & Background Task Handling

Implement thread pooling to manage system resources.

Add background tasks for data validation and analytics.

Conduct load testing with multiple concurrent users.

Week 6: Testing & Finalization

Conduct extensive testing for system stability and performance.

Fix bugs and optimize performance.

Ensure full functionality of the application.

Submission

A single PDF file containing project details will be submitted upon completion.

How to Run the Project

Clone the repository:

git clone https://github.com/fahadali323/cs630_project.git
cd multithreaded-web-data-management

Set up the MySQL database and update the application properties.

Build and run the Spring Boot application:

mvn spring-boot:run

Access the application via http://localhost:8080/

Contributing

Feel free to fork the repository and submit pull requests to improve the project.

License

This project is licensed under the MIT License - see the LICENSE file for details.