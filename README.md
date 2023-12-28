# Spring Boot JWT REST API Security

![Java](https://img.shields.io/badge/Java-17-brightgreen)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.1-blue)
![Gradle](https://img.shields.io/badge/Gradle-7.2-rose)

This project is a simple example of JWT-based REST API security developed using Spring Boot and built with Gradle.

## Features

- **JWT Authentication:** Secure user authentication using JSON Web Tokens.
- **Roles:** Access control based on user roles.
- **Refresh Token:** Extend user sessions with refresh tokens.
- **RESTful API:** Clean and efficient RESTful services.

## Requirements

- Java 17
- Gradle 7.2

## Installation

1. Clone the project to your local machine:

    ```bash
    git clone https://github.com/caglayantolga/springboot-role-based-jwt-security-rest-api.git
    ```

2. Edit the `application.yaml` file and add your JWT secret key and password:

    ```yaml
    token:
      signing:
        key: SECRET_KEY
      refresh:
        signing:
          key: SECRET_KEY
    ```

3. Compile and run the project:

    ```bash
    cd springboot-role-based-jwt-security-rest-api
    ./gradlew bootRun
    ```

## Usage

1. **Generate Token:**
   ```http
   POST /api/v1/auth/login
   ```
2. **Request Body:**

   ```json
    {
    "username": "yourUsername",
    "password": "yourPassword"
    }
   ```
3. **Response:**

   ```json
    {
    "token": "TOKEN",
    "refreshToken": "REFRESH_TOKEN",
    "expiresAt": "EXPIRES_AT"
    }
   ```   
4. **Access Secure Endpoint:**
     ```http
     GET /api/v1/admin/hello
     ```
   **HEADER**
   ```http
   Authorization: Bearer TOKEN
   ```  
   **RESPONSE**
   ```http
   Hello Admin
   ```  
## Refresh Token

1. **Refresh Token:**
   ```http
    POST /api/v1/auth/refresh/access
   ```
2. **Request Body:**

   ```json
    {
       "refreshToken": "REFRESH_TOKEN"
    }
   ```
3. **Response:**
    
   ```json
    {
    "token": "NEW_TOKEN",
    "refreshToken": "NEW_REFRESH_TOKEN",
    "expiresAt": "NEW_EXPIRES_AT"
    }
   ```      