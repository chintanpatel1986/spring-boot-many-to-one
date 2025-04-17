# Many-To-One Employee Management System

A Spring Boot web application demonstrating a Many-To-One relationship between Employees and Departments. This application allows users to manage employee and department data with a user-friendly web interface.

## Features

- **Department Management**
  - Create, read, update, and delete departments
  - View a list of all departments

- **Employee Management**
  - Create, read, update, and delete employees
  - Assign employees to departments (Many-To-One relationship)
  - View a list of all employees with their department information
  - Validate employee data (email, required fields, password length, etc.)

## Technologies Used

- **Backend**
  - Java 21
  - Spring Boot
  - Spring MVC
  - Spring Data JPA
  - Hibernate
  - Jakarta Validation

- **Frontend**
  - Thymeleaf template engine
  - Bootstrap 5
  - HTML/CSS

- **Database**
  - PostgreSQL

## Project Structure

The application follows a standard Spring MVC architecture:

- **Model**: Contains entity classes (Employee, Department)
- **Repository**: JPA repositories for database operations
- **Service**: Business logic layer
- **Controller**: Handles HTTP requests and responses
- **View**: Thymeleaf templates for the user interface

## Prerequisites

- Java 21 or higher
- Maven
- PostgreSQL database

## Setup and Installation

1. **Clone the repository**
   ```
   git clone https://github.com/yourusername/Many-To-One.git
   cd Many-To-One
   ```

2. **Configure the database**
   
   Update the `src/main/resources/application.properties` file with your PostgreSQL credentials:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build the project**
   ```
   mvn clean install
   ```

4. **Run the application**
   ```
   mvn spring-boot:run
   ```

5. **Access the application**
   
   Open your browser and navigate to `http://localhost:8080`

## Usage

1. **Department Management**
   - Navigate to the Department page from the home screen
   - Add new departments by filling out the form
   - Edit or delete existing departments using the action links

2. **Employee Management**
   - Navigate to the Employee page from the home screen
   - Add new employees by filling out the form, including selecting a department
   - Edit or delete existing employees using the action links

## Entity Relationship

- **Department**: Contains departmentId and departmentName
- **Employee**: Contains employee details (name, gender, skills, contact info, etc.) and a reference to Department

The relationship is Many-To-One, meaning many employees can belong to one department.

## Validation

The application includes validation for:
- Required fields
- Email format
- Password length (8–15 characters)
- And more

## License

[MIT License](LICENSE)

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.