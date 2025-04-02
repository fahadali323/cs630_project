#CS630 Project

For this assignment, you will design and implement a programming project that covers at 
least two of the following OS topics: 
● Interrupt and Trap Handling 
● Process and Thread States, Structures, and Functions 
● IPC Mechanisms 
● Synchronization 
● Memory Management 
● Job Scheduling 
1. Topic – Multithreaded Web-Based Data Management Application. 
2. Group Members – MySelf  
3. Rationale – The goal of this application is to be able to store data efficiently and 
seamlessly. Most web-based solutions have alot of complex tasks such as user input 
management/validation, execution and persistence of new/old data, and as well as reliable 
data storage. The goal of this project is to create a multi-threaded web-based data 
management system that processes and stores user input with high speeds and low 
latency. Some problems that this application will solve includes storing input into a 
database, writing logs to files for backup, and completing background tasks on data 
processing and validation.  
4. What Functions the Program Provides – Describe the features and capabilities of your 
project. 
This project will use some of the several functions that are used in modern Operating 
Systems such as process and thread management, file management, and syncronization. 
1. Process And Thread Management: My application will be using Java threads and 
the ExecutorService framework which allows programmers to take advantage of 
multi-threading capabilities of the OS. By doing so, each user request will be 
processed in a separate thread which results in faster completing of multiple tasks 
simultaneously. 
2. File Management: User inputs will be logged to files for backup in-case of any 
issues that could arise with data persistence in a database environment. Generally, 
this isn’t an issue with a production application so logging files is unnecessary. 
However, in our case, this is possibility of errors due to lack of skills or there of, so 
its better to have two forms of persistent storage. 
3. Synchronization: The ability to lock out and block certain actions in the application 
will ensure that certain shared resources like database and log files don’t run into 
race conditions. This will allow us as the developers to be able to control how the 
program should behave in normal conditions since using multiple threads tend to 
lead to such issues. 
Tech Stack: 
● Backend: Java (Spring Boot) 
● Database: MySQL 
● Concurrency: Java Threads, ExecutorService for managing threads 
● Frontend: Web-based: HTML, CSS, JavaScript 
5. Project Plan – Outline the milestones and their expected completion dates. 
Week 1: Project Setup/Initial Development 
● Setup project with Spring Boot 
● Configure MySql and add test conditions. 
● Design a database schema for different user operations 
● Implement some basic endpoints on the backend 
Week 2: Implement Multithreading & File Management 
● Implement java threads to handle user inputs. 
● Introduce file management for logging inputs 
● Check to see that certain logging like database writes and file writes happen in 
separate threads. 
● Test basic concurrency handling with multiple simulated users.  
Week 3: Synchronization & Data Consistency 
● Add synchronization to prevent race conditions. 
● Use blocks, locks, to manage database writes. 
● Optimzie loggin systems for avoiding of file access. 
Week 4: Web-based frontend 
● Develop a simple frontend for the users to be able to perform simple operations 
using HTTP endpoints 
● Ensure that user inputs are send correctly to the backend. 
● Checks to make sure that communication between frontend and backend is 
working properly. 
Week 5: Optimize & background task handling 
● Using thread pooling to manage system resources. 
● Adding background tasks for data validation and analytics. 
● Perform a load testing with multiple concurrent users. 
Week 6: Testing 
● Last week is to check that everything in the application is working as intended. 
● Fixing any issues or performance issues. 
● Making sure that the application is working properly 
Submission – Upload a single PDF file containing your project details.