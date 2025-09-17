# Reactive Student API

A reactive REST API for managing student data using Spring WebFlux, R2DBC, and PostgreSQL.

## Features

- Reactive CRUD operations (save, find by ID, stream all students)
- Server-Sent Events (SSE) with 1-second delay for streaming
- Automatic seeding of 100 students on startup
- Case-insensitive search by first name
- Database schema management with Flyway

## Tech Stack

- Java 21
- Spring Boot 3.5.5 (Spring 6)
- Spring WebFlux, Reactor
- PostgreSQL with R2DBC
- Flyway 11.12.0
- Maven
- Lombok

## Quick Start

1. **Prerequisites**:
   - Java 21 JDK
   - PostgreSQL 17+ on `localhost:5432`
   - Create database: `CREATE DATABASE studentdb;`

2. **Setup**:
   - Clone: `git clone <repo-url>`
   - Set environment variables: `DB_USERNAME=postgres`, `DB_PASSWORD=<your-password>`

3. **Run**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Test Endpoints**:
   - `POST /api/v1/students`: Save a student (JSON body)
   - `GET /api/v1/students`: Stream all students (SSE)
   - `GET /api/v1/students/{id}`: Get student by ID

   Example:
   ```bash
   curl http://localhost:8080/api/v1/students
   ```
