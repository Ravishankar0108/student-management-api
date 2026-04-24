# 🎓 Student Management API

[![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=openjdk)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=flat-square&logo=docker)](https://www.docker.com/)
[![Live Demo](https://img.shields.io/badge/Live%20Demo-Render-46E3B7?style=flat-square&logo=render)](https://student-management-api-7yew.onrender.com)

A lightweight **RESTful API** to manage student records — built with Spring Boot, JPA, H2 Database, and deployed live on Render.

---

## 🌐 Live Demo

🔗 **[https://student-management-api-7yew.onrender.com](https://student-management-api-7yew.onrender.com)**

> ⚠️ Free tier — may take **30–60 seconds** to wake up if idle.

---

## ✨ Features

- 📄 Get all students
- ➕ Add a new student
- ❌ Delete a student by ID
- 🐳 Fully Dockerized
- ☁️ Deployed on Render

---

## 🛠 Tech Stack

| Technology | Role |
|---|---|
| Java 17 | Core language |
| Spring Boot | Framework |
| Spring Data JPA | Database layer |
| H2 Database | In-memory DB |
| Docker | Containerization |
| Render | Cloud deployment |

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/students` | Get all students |
| `POST` | `/students` | Add a new student |
| `DELETE` | `/students/{id}` | Delete by ID |

---

## 📦 Sample Requests

### Get All Students
```bash
curl https://student-management-api-7yew.onrender.com/students
```

### Add a Student
```bash
curl -X POST https://student-management-api-7yew.onrender.com/students \
  -H "Content-Type: application/json" \
  -d '{"name": "Ravi", "email": "ravi@gmail.com", "course": "Java"}'
```

### Delete a Student
```bash
curl -X DELETE https://student-management-api-7yew.onrender.com/students/1
```

---

## ⚙️ Run Locally

```bash
git clone https://github.com/Ravishankar0108/student-management-api.git
cd student-management-api
./mvnw spring-boot:run
```
API runs at `http://localhost:8080`

---

## 🐳 Run with Docker

```bash
docker build -t student-api .
docker run -p 8080:8080 student-api
```

---

## 👨‍💻 Author

Made by **[Ravi Shankar](https://github.com/Ravishankar0108)**

⭐ Star this repo if you found it helpful!
