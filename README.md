## 🚀 Live Demo

[![Deployed on Render](https://img.shields.io/badge/Deployed%20on-Render-46E3B7?style=for-the-badge&logo=render)](https://student-management-api-7yew.onrender.com)

> **Base URL:** https://student-management-api-7yew.onrender.com

> ⚠️ Note: This service is hosted on Render's free tier. It may take **~30–60 seconds** to spin up if idle.



# Student Management API

A simple REST API built using Java, Spring Boot, Spring Data JPA, H2 Database, and Docker.

## Features
- Get all students
- Add a student
- Delete a student
- Runs locally and inside Docker

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Docker

## Run Locally
```bash
mvnw.cmd spring-boot:run

mvnw.cmd clean package
docker build -t student-api .
docker run -p 8080:8080 student-api


API Endpoints
GET /students
POST /students
DELETE /students/{id}


Sample POST Request
{
  "name": "Ravi",
  "email": "ravi@gmail.com",
  "course": "Java"
}

