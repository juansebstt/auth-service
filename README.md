# Authentication API

The Authentication API provides endpoints for user registration and login, utilizing JWT (JSON Web Tokens) for secure access. The API is designed to handle user authentication efficiently and securely. Spring Boot application that provides user authentication and JWT token generation. This service supports user registration and token management, using PostgreSQL for data storage and Spring Security for authentication.

## Features

- **User Registration**: Allows new users to register with an email and password.
- **JWT Authentication**: Generates JWT tokens for authenticated users.
- **Security**: Implements security best practices using Spring Security and JWT.
- **Database**: Uses PostgreSQL for storing user data.
- **REST API** with endpoints for user management.
- **Exception** handling via custom exceptions.
- **API documentation** available through Swagger UI.

## Getting Started

**Technologies Used**

- **Java 17**
- **Spring Boot 3.3.3**
- **Spring Web**
- **Spring Security**
- **Spring Data JPA**
- **PostgreSQL**
- **Swagger UI for API documentation**
- **Lombok to reduce boilerplate code**
- **JWT for token management**

### Prerequisites

- J**ava 17 or later**
- **PostgreSQL**
- **Maven for building the project**
- **Postman or any REST client for testing API endpoints**

### Setup

1. **Clone the Repository**
````
   git clone https://github.com/yourusername/your-repository.git
   cd your-repository
````

2. **Configure the application**

````
server:
  port: 8080
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/authentication
    username: postgres
    password: 1234
  jpa:
    hibernate:
      ddl-auto: create-drop
logging:
  level:
    org:
      hibernate:
        SQL: DEBUG
````
Also, ensure the jwt.secret value is securely configured.

3. **Build and run**
- Using Maven:
````
./mvnw clean package
java -jar target/authservice-0.0.1-SNAPSHOT.jar
````
- Using Gradle:
`````
./gradlew build
java -jar build/libs/authservice-0.0.1-SNAPSHOT.jar
`````

4. **Access the API**
   
The service will be available at http://localhost:8080

## API Endpoints

- **POST - Register a New User** `/v1/auth/register`
    - **Description**: Register a new user.
    - **Request Body (JSON)**:
    ````
      {
      "email": "user@example.com",
      "password": "password123"
      }
    ````
  **Response:**
    ```
  {
  "accessToken": "your_jwt_token"
    }
  ```
- **POST - User Login** `POST /v1/auth/login`
  - **Description: Authenticates a user and generates a JWT token if the credentials are valid.**
  - **Request Body (JSON)**:
  ````
  {
      "email": "user@example.com",
      "password": "your_password"
  }
  ````
  
  **Response**
  ````
  {
    "accessToken": "your_jwt_token"
  }
  ````

  - **Get user info**
    Endpoint: `GET /v1/auth`

    **Description:** Retrieves user information based on the provided JWT token.

    **Headers:**
    `Authorization: Bearer your_jwt_token`
  
    **Response:**
    `Success (200): Returns user information.`

**Security**

**The API uses Spring Security to handle authentication and authorization.
Passwords are hashed using BCrypt before being stored in the database.
JWT tokens are generated upon successful registration and login, and they are required for accessing protected endpoints.**

## Development

To contribute to the project, follow these steps:

1. **Fork the Repository**
2. **Create a New Branch**
3. **Make Your Changes**
4. **Submit a Pull Request**

## Created by
**Juan Sebastian Ibarra**