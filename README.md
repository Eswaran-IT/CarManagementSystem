# Car Management System

## Objective
The Car Management System is a RESTful API built using **Spring Boot**. It allows users to manage car details, including creating, updating, viewing, and deleting car information. The system also supports global search, pagination, and sorting for efficient data retrieval.

## Tech Stack
- **Java** (Version 11+)
- **Spring Boot**
- **MySQL** (for database)
- **Maven** (for dependency management)

## Installation and Setup Guide

### Prerequisites
- Java 11 or higher
- MySQL database

### Steps
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Eswaran-IT/CarManagementSystem.git


###Postman API Collection - CRUD Operations


### C - Create a Car
- **Description**: Create a new car in the system by submitting the car details.
- **Request Type**: `POST`
- **Required Fields**:
  - `name`: Name of the car
  - `model`: Model of the car
  - `year`: Year of manufacture
  - `price`: Price of the car
  - `color`: Color of the car
  - `fuelType`: Type of fuel (e.g., Petrol, Diesel, Electric)
- **Response**: A new car object will be created and returned.

---

### R - Read (View) Cars
- **Description**: Retrieve a list of cars from the system.
- **Request Type**: `GET`
- **Optional Parameters**:
  - `page`: Page number for pagination (default `0`)
  - `size`: Number of cars per page (default `10`)
  - `sortBy`: Field to sort by (default `id`)
  - `direction`: Sorting direction (`ASC` or `DESC`, default `ASC`)
- **Response**: A paginated list of cars is returned.

---

### U - Update a Car
- **Description**: Update the details of an existing car in the system.
- **Request Type**: `PUT`
- **Required Fields** (in request body):
  - `name`: Updated name of the car
  - `model`: Updated model of the car
  - `year`: Updated year of manufacture
  - `price`: Updated price
  - `color`: Updated color
  - `fuelType`: Updated fuel type
- **Response**: The updated car object will be returned.

---

### D - Delete a Car
- **Description**: Delete an existing car from the system by providing its unique identifier.
- **Request Type**: `DELETE`
- **Required Parameter**:
  - `id`: The unique identifier (ID) of the car to be deleted.
- **Response**: No content will be returned. The car is removed from the system.

---
