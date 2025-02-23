# ExceptionHandler Project

## Overview
ExceptionHandler is a Spring Boot-based service that provides error handling and API request validation.

## Project Structure
```
ExceptionHandler
│── src/main/java/uz/nodir/exceptionhandler
│   ├── config/         # Configuration files
│   ├── controller/     # API controllers
│   ├── exception/      # Custom exception handling
│   ├── model/          # DTOs and entity models
│   ├── service/        # Business logic services
│   ├── ExceptionHandlerApplication.java  # Main application class
│── src/main/resources/ # Resource files (properties, etc.)
│── build.gradle.kts    # Gradle build script
│── settings.gradle.kts # Gradle settings
```

## API Endpoints

### 1. Fetch Client Cards
- **Endpoint:** `POST /api/v1/test/client/cards`
- **Request Body:**
```json
{
    "client_id": "string"
}
```
- **Response:**
```json
{
    "code": 400,
    "message": "Client ID is invalid"
}
```

## Test Cases & Screenshots

### Test Case 1: Empty Request Body
- **Request:**
  - `POST http://localhost:8585/api/v1/test/client/cards`
  - Body: *(empty)*
- **Response:**
```json
{
    "code": -100012,
    "message": "HTTP message not readable"
}
```
- **Explanation:** If the request body is missing, the API returns an error indicating that the message is unreadable.

![Test Case 1](image1.png)

### Test Case 2: Invalid Client ID
- **Request:**
  - `POST http://localhost:8585/api/v1/test/client/cards`
  - Body:
```json
{
    "client_id": "POST_23SS54F"
}
```
- **Response:**
```json
{
    "code": 400,
    "message": "Client ID is invalid"
}
```
- **Explanation:** The API validates the `client_id` field, and if it doesn’t meet expected criteria, it returns an error.

![Test Case 2](image2.png)

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/ExceptionHandler.git
   ```
2. Navigate to the project directory:
   ```sh
   cd ExceptionHandler
   ```
3. Build and run the application:
   ```sh
   ./gradlew bootRun
   ```

## License
This project is licensed under the MIT License.
