# Application Management System – Spring Data JPA Learning Project

This project is built to master **Spring Data JPA** concepts by implementing real CRUD operations and advanced repository features in a practical application.

The application simulates an **Application Management System**, where application records are stored, retrieved, updated, and managed using Spring Boot and Spring Data JPA.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / PostgreSQL / H2
- Maven
- REST APIs
- Lombok
- Postman for testing

---

## 📚 Learning Goals Covered

This project demonstrates the following Spring Data JPA concepts:

### ✔ Entity Creation
- Creating JPA Entities
- Mapping tables using `@Entity`
- Column mapping with `@Column`

### ✔ Primary Key Generation
- Using `@Id`
- Using `@GeneratedValue`

### ✔ Repository Layer
- Creating repositories using:
    - `CrudRepository`
    - `PagingAndSortingRepository`
    - `JpaRepository`

---

## 🔧 Implemented Features

### 1. CRUD Operations
- Create application
- Read applications
- Update application
- Delete application

---

### 2. CrudRepository Usage
- save()
- findById()
- findAll()
- deleteById()

Tested using REST endpoints.

---

### 3. Paging & Sorting
Using `PagingAndSortingRepository` to:
- Fetch paginated results
- Sort records by fields

---

### 4. JpaRepository Features
Additional features from JpaRepository:
- Pagination
- Sorting
- Batch operations
- List-based repository return types (Spring Data 3.0)

---

### 5. Query Methods
Custom queries using method naming:

Examples:
- findByApplicantName()
- findByStatus()
- findByEmailContaining()

---

### 6. @Query Annotation
Custom JPQL and native queries implemented.

Example:
- Fetch applications by custom conditions
- Complex query handling

---

### 7. Repository Comparison
| Repository Type | Features |
|-----------------|----------|
| CrudRepository | Basic CRUD |
| PagingAndSortingRepository | CRUD + Pagination + Sorting |
| JpaRepository | Full JPA features + batch operations |

---
