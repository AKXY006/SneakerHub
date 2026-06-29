# SneakerHub

SneakerHub is a Spring Boot REST API project for managing sneakers, inventory, and related operations. The application is built using Java, Spring Boot, Spring Data JPA, Hibernate, and PostgreSQL following a clean layered architecture.

---

## Features

* Add Sneaker
* View All Sneakers
* Get Sneaker by ID
* Update Sneaker Details
* Delete Sneaker
* Inventory Management
* RESTful APIs
* Global Exception Handling
* Generic Response Structure
* PostgreSQL Database Integration

---

## Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* REST API
* Git
* GitHub

---

## Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── exception
├── util
└── resources
```

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/AKXY006/SneakerHub.git
```

### Configure Database

Update the PostgreSQL database configuration in the `application.properties` file.

### Run the Application

Run the Spring Boot application using your IDE or Maven.

The application will start at:

```text
http://localhost:8080
```

---

## API Endpoints

| Method | Endpoint        | Description       |
| ------ | --------------- | ----------------- |
| POST   | `/sneaker`      | Add Sneaker       |
| GET    | `/sneaker`      | Get All Sneakers  |
| GET    | `/sneaker/{id}` | Get Sneaker By ID |
| PUT    | `/sneaker/{id}` | Update Sneaker    |
| DELETE | `/sneaker/{id}` | Delete Sneaker    |

---

## Future Enhancements

* Authentication and Authorization
* JWT Security
* Swagger API Documentation
* Pagination and Sorting
* Image Upload
* Docker Deployment

---

## Author

**Akshay Kumar**

GitHub: https://github.com/AKXY006
