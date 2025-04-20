package com.example.fileupload.controller;

import com.example.fileupload.service.FileStorageService;
import com.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class FileUploadController {
    
    @Autowired
    private FileStorageService filestorageservice;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        filestorageservice.storeFileAsync(file);
        return ResponseEntity.ok("Upload request receieved. Processing asynchronously.");
    }
}