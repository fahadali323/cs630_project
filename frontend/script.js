function uploadFile(){
    const fileInput = document.getElementById("fileInput");
    const status = document.getElementById("status");

    if (fileInput.files.length ==0) {
        status.textContent = "Please select a file!";
        status.style.color = "red";
        return;
    }

    let file = fileInput.files[0];
    let formData = new FormData();
    formData.append("file", file);

    fetch("http://localhost:8080/api/upload" , {
        method: "POST",
        body: formData
    })
    .then(response => response.text())
    .then(data => {
        status.textContent = data;
        status.style.color = "green";
    })
    .catch(error => {
        status.textContent = "Upload failed!";
        status.style.color = "red";
    })
}