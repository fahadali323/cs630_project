// Controller
package com.example.fileupload.controller;

import com.example.fileupload.service.FileStorageService;
import com.example.fileupload.model.UploadedFile;
import com.example.fileupload.repository.UploadedFileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FileUploadController {

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private UploadedFileRepository uploadedFileRepository;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        fileStorageService.storeFileAsync(file);
        return ResponseEntity.ok("Upload request received. Processing asynchronously.");
    }

    @GetMapping("/files")
    public List<UploadedFile> listFiles() {
        return uploadedFileRepository.findAll();
    }
}
