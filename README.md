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