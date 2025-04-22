function uploadFile(event) {
    // Safely check if the event is passed (for future-proofing)
    if (event) event.preventDefault();

    const fileInput = document.getElementById("fileInput");
    const status = document.getElementById("status");

    if (fileInput.files.length === 0) {
        status.textContent = "Please select a file!";
        status.style.color = "red";
        return;
    }

    let file = fileInput.files[0];
    let formData = new FormData();
    formData.append("file", file);

    fetch("http://localhost:8080/api/upload", {
        method: "POST",
        body: formData
    })
    .then(response => response.text())
    .then(data => {
        status.textContent = data;
        status.style.color = "green";
        loadUploadedFiles();
    })
    .catch(error => {
        status.textContent = "Upload failed!";
        status.style.color = "red";
    });
}
function loadUploadedFiles() {
    fetch("http://localhost:8080/api/files")
        .then(response => response.json())
        .then(data => {
            const list = document.getElementById("fileList");
            list.innerHTML = "";

            if (data.length === 0) {
                list.innerHTML = "<li>No files uploaded yet.</li>";
                return;
            }

            data.forEach(file => {
                const li = document.createElement("li");
                li.textContent = `${file.fileName} — uploaded at ${file.uploadTime}`;
                list.appendChild(li);
            });
        })
        .catch(error => {
            console.error("Error loading files:", error);
        });
}

