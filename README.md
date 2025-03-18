# SpringBootJWTAuth

## Overview
SpringBootJWTAuth is a Spring Boot project that demonstrates how to implement JSON Web Token (JWT) based authentication and authorization. This project serves as a template for securing your Spring Boot applications with JWT.

## Features
- User registration and login
- JWT token generation and validation
- Role-based access control
- Secure REST API endpoints with JWT

## Technologies Used
- Spring Boot
- Spring Security
- JSON Web Tokens (JWT)
- Hibernate
- MySQL (or any other preferred database)
- Maven

## Prerequisites
- Java 11 or later
- Maven 3.6.0 or later
- MySQL server (or any other preferred database)

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/MaheshThaku/SpringBootJWTAuth.git
cd SpringBootJWTAuth

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.jpa.hibernate.ddl-auto=update

mvn clean install
mvn spring-boot:run

##API Endpoints
POST /public/add - Register a new user
POST /public/authenticate - Authenticate user and return JWT token
GET /admin/getAdmin - Get the authenticated API (secured endpoint)
