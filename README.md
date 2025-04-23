# Multithreaded Web-Based Data Management Application

## Table of Contents
- [Project Overview](#project-overview)
- [OS Topics Covered](#os-topics-covered)
- [Group Members](#group-members)
- [Rationale](#rationale)
- [Features and Capabilities](#features-and-capabilities)
- [Tech Stack](#tech-stack)
- [Project Plan](#project-plan)
- [Submission](#submission)
- [How to Run the Project](#how-to-run-the-project)
- [Environment Variable Setup](#environment-variable-setup)
- [Contributing](#contributing)
- [License](#license)

## Video
Video: https://drive.google.com/file/d/1AdG5_QCZmZpEhEJysXG4tnm-fDGnX4-5/view?usp=sharing


## Project Overview
This project focuses on designing and implementing a multithreaded web-based data management system that efficiently processes and stores user inputs. The application leverages modern operating system functionalities such as thread management, file logging, and synchronization for high-speed and reliable data storage.

## OS Topics Covered
This project incorporates the following OS topics:
- **Process and Thread States, Structures, and Functions**
- **Synchronization**
- **File Management**

## Group Members
- Fahad Ali

## Rationale
Web-based applications frequently need to manage user data input with low latency and reliability. This project aims to create a multithreaded backend that:
- Processes uploads using Java threads.
- Stores metadata in a MySQL database.
- Logs file data redundantly to disk.
- Prevents concurrency issues using thread-safe code.

## Features and Capabilities

### Process and Thread Management
- Uses `ExecutorService` for multithreaded upload handling.
- Separates file writing and DB operations into background threads.

### File Management
- Uploaded files are saved to disk (`upload-dir/`).
- Metadata including filename, timestamp, and file path is stored in MySQL.

### Synchronization
- Ensures threads operate safely without race conditions.
- Upload processing is thread-safe and resource-isolated.

### Web-Based Frontend 
- Clean HTML/CSS/JS interface for selecting and uploading files.
- Displays uploaded file metadata in real time.

## Tech Stack
- **Backend:** Java (Spring Boot)
- **Database:** MySQL
- **Concurrency:** Java Threads, ExecutorService
- **Frontend:** HTML, CSS, JavaScript 

## Project Plan

### Week 1: Project Setup & Initial Development
- Set up Spring Boot project.
- Configure MySQL.
- Design schema and base endpoint.

### Week 2: Multithreading & File Logging
- Implement file uploads in a separate thread.
- Add disk logging for file content.

### Week 3: Synchronization
- Ensure database/file writes are thread-safe.
- Use `Files.createDirectories()` and isolated file writes.

### Week 4: Frontend
- Create HTML+CSS upload form.
- Add JS function to upload file via `fetch()`.
- Dynamically load uploaded files from backend.

### Week 5: Optimization
- Improve thread pool use.
- Add unique file naming or metadata improvements.

### Week 6: Final Testing
- Run full system tests.
- Polish frontend and backend responses.

## Submission
A single PDF with project overview, diagrams, and source code architecture will be submitted.

## How to Run the Project

### 1. **System Requirements**
- Java JDK 17 or later
- Maven 3.6+
- MySQL 8+

### 2. **Clone the Repository**
```sh
https://github.com/your-username/multithreaded-web-data-management.git
cd multithreaded-web-data-management
```

### 3. **Set Up MySQL Database**
- Create a database named `fileupload_db`
- Update `src/main/resources/application.properties` with:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fileupload_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

### 4. **Build and Run**
```sh
./mvnw clean install
./mvnw spring-boot:run
```

### 5. **Frontend Usage**
- Open `index.html` in your browser
- Select and upload a file
- View uploaded files listed dynamically

### 6. **Verify Uploads**
- Files saved in `/upload-dir/`
- Metadata saved in `uploaded_files` table in MySQL

## Environment Variable Setup

### Java Environment Setup (Windows)

1. **Install Java JDK (Version 17+)**
   - Download from: https://adoptium.net/en-GB/temurin/releases/
   - Install to: `C:\Program Files\Java\jdk-17.0.x`

2. **Set JAVA_HOME**
   - Open System Environment Variables → Add new:
     - `JAVA_HOME = C:\Program Files\Java\jdk-17.0.x`

3. **Update PATH**
   - Add: `%JAVA_HOME%\bin`

4. **Verify Installation**
   ```sh
   java --version
   javac --version
   ```

### Optional: Maven Setup

If Maven is not installed, use `mvnw` script. Otherwise:
1. Install Maven: https://maven.apache.org/download.cgi
2. Set `MAVEN_HOME = C:\Apache\Maven`
3. Add `%MAVEN_HOME%\bin` to PATH

### MySQL Setup
1. Install MySQL Server 8+: https://dev.mysql.com/downloads/installer/
2. Create DB:
   ```sql
   CREATE DATABASE fileupload_db;
   ```
3. Set credentials in `application.properties`.

## Contributing
Fork the repository and submit pull requests to contribute enhancements or fixes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
