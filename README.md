# AuthService

AuthService is a Spring Boot application that provides user authentication and JWT token generation. This service supports user registration and token management, using PostgreSQL for data storage and Spring Security for authentication.

## Features

- **User Registration**: Allows new users to register with an email and password.
- **JWT Authentication**: Generates JWT tokens for authenticated users.
- **Security**: Implements security best practices using Spring Security and JWT.
- **Database**: Uses PostgreSQL for storing user data.

## Getting Started

### Prerequisites

- Java 17 or later
- PostgreSQL
- Maven (or Gradle)

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

- **POST** `/v1/auth/register`
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
## Development

To contribute to the project, follow these steps:

1. **Fork the Repository**
2. **Create a New Branch**
3. **Make Your Changes**
4. **Submit a Pull Request**

## Created by
**Juan Sebastian Ibarra**