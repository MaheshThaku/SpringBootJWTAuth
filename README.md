# SpringBootJWTAuth

## Overview
SpringBootJWTAuth is a Spring Boot project that demonstrates how to implement JSON Web Token (JWT) based authentication and authorization. This project serves as a template for securing your Spring Boot applications with JWT.

## Features
- User registration, login and Forgot Password
- JWT token generation and validation
- Role-based access control
- Secure REST API endpoints with JWT
- Sending mail to Validate a User while forgot password 

## Technologies Used
- Spring Boot
- Spring Security
- Spring Boot Mail Sender
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

spring.mail.username = your-email@gmail.com
spring.mail.password = your-app-password

jwt.secret.key = provide_atleast_64_character_Hash_Key_for_Encryption
jwt.exp.time = 10 #[minutes to expired the JWT Token]

mvn clean install
mvn spring-boot:run

##API Endpoints
GET  /public/welcome - Return Welcome message on browser screen

POST /public/add - Register a new user
      {
        "email":"userEmail",
        "Password":"userPassword"
        "roles":"employeer/admin"
      }

POST /public/authenticate - Authenticate user and return JWT token to validate API's
      {
      "username":"userEmail",
      "password":"userPassword"
      }

GET  /admin/getAdmin - Get the authenticated API (secured endpoint) through JWT token

POST /otp/forgot-password - Query Parameter required: email
      eg - /otp/forgot-password?email=your_email

POST /otp/reset-password - Query Parameter required: email, otp, password
      eg - /otp/reset-password?email=you_email&otp=genratedOtp&password=newPassword
