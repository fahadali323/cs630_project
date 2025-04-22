// Service
package com.example.fileupload.service;

import com.example.fileupload.model.UploadedFile;
import com.example.fileupload.repository.UploadedFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class FileStorageService {

    private static final String UPLOAD_DIR = "upload-dir/";
    private final ExecutorService executorService = Executors.newFixedThreadPool(5);

    @Autowired
    private UploadedFileRepository repository;

    public FileStorageService() {
        File dir = new File(UPLOAD_DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    public void storeFileAsync(MultipartFile file) {
    executorService.submit(() -> {
        try {
            // Create directory if not exists (thread-safe fallback)
            Path uploadPath = Paths.get(UPLOAD_DIR).toAbsolutePath().normalize();
            Files.createDirectories(uploadPath);

            // Final file path
            Path filePath = uploadPath.resolve(file.getOriginalFilename());

            // Write the file
            Files.write(filePath, file.getBytes(), StandardOpenOption.CREATE);

            // Save metadata to database
            UploadedFile uploadedFile = new UploadedFile();
            uploadedFile.setFileName(file.getOriginalFilename());
            uploadedFile.setUploadTime(LocalDateTime.now());
            uploadedFile.setFilePath(filePath.toString());
            repository.save(uploadedFile);

            System.out.println("✅ File saved to: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    });
}

}
