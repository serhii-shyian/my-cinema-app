<p align="center">
  <img alt="Taxi service" height="200" src="logo-ca.svg">
</p>

## 🎬 Project description

---
**This project is designed to for buying tickets to the cinema.
It represents the work of a cinema service
and providing the possibility of user registration and authentication,
as well as all CRUD operations with order, shopping cart, movie, movie session and cinema hall.
The web application consists of backend part,
it implemented using n-tired architecture in accordance with SOLID and REST principles.**

## 🎯️ Features

---
**Realised the ability to perform the following operations:**

- registration of new user with role USER by default
- logging user by entering email and password
- logging out to log by another user
- adding new movies and cinema halls
- adding new movie sessions, which contains a movie and a cinema hall
- buying new tickets with movie sessions by adding them to user shopping cart
- completion of the purchase of tickets with the formation of orders
- finding available movie sessions
- getting history of orders for logged user

## 🌳 Project structure

---
**Implemented a 3-level architectural model:**
- DAO - Data access layer
- Service - Application logic layer
- Controllers - Presentation layer

## 🧬 Used technologies

---
**The following technologies were used during creation:**
- Apache Maven
- Apache Tomcat
- MySQL
- JDBC
- Hibernate
- Spring Framework
- Spring Security
- Postman

## ⚙️ How to run the project

---
**To start the project you need to do the following:**
1. Download the [Project](https://github.com/serhii-shyian/my-cinema-app) from GitHub and save it
2. Download [JDK](https://www.oracle.com/java/technologies/downloads/) and install it on computer
3. Download [IntelliJ IDEA](https://www.jetbrains.com/idea/download) and install it on computer
4. Download [MySQL](https://dev.mysql.com/downloads/installer/) and install it on computer
5. Download [Workbench](https://dev.mysql.com/downloads/workbench/) and install it on computer
6. Open MySql Workbench, copy and run **init_db.sql** (/src/main/resources/init_db.sql) SQL script
7. Open IntelliJ IDEA and load the previously saved project
8. Open the db.properties file (/src/main/resources/db.properties) and fill in the appropriate fields
   <br> for settings connecting the project to the database
```java
db.driver=YOUR_DRIVER;
db.url=YOUR_DATABASE_URL;
db.user=YOUR_USERNAME;
db.password=YOUR_PASSWORD;
```
9. Download [Tomcat](https://tomcat.apache.org/download-90.cgi) web server and save it
10. Add Tomcat server to the project
- click "Edit Configurations" at the top, near to the "run" button
- choose "Add new Configuration"("+") in the upper left corner
- select "Tomcat Server - local"
- click "Fix" and select "cinema-app:war exploded"
- then delete link that appeared after the "/"
- to save the results press "OK"
11. To run the project press the Run button
12. Enter login and password:
```java
#Admin role
login: john@me.com;
password: 12345678;

#User role
login: emma@me.com;
password: 87654321;
```

## 🤖 How to test the project

---
Register at [Postman](https://www.postman.com/) and start testing the service

| **Http** | **Endpoint**                   | **Roles**   | **Description**                                               |
|----------|--------------------------------|-------------|---------------------------------------------------------------|
| POST     | /register                      | ALL         | Register new user with email and password                     |
| POST     | /cinema-halls                  | ADMIN       | Add new cinema hall with capacity and description             |
| POST     | /movies                        | ADMIN       | Add new movie with title and description                      |
| POST     | /movie-sessions                | ADMIN       | Add new movie session with movieId, cinemaHallId and showTime |
| PUT      | /movie-sessions/{id}           | ADMIN       | Update movie session                                          |
| DELETE   | /movie-sessions/{id}           | ADMIN       | Delete movie session                                          |
| GET      | /users/by-email                | ADMIN       | Get user by email                                             |
| GET      | /movie-sessions/available      | ADMIN /USER | Get available movie session by id and showtime                |
| GET      | /movies                        | ADMIN /USER | Get all movies                                                |
| GET      | /cinema-halls                  | ADMIN /USER | Get all cinema halls                                          |
| POST     | /orders/complete               | USER        | Complete order - tickets from shopping cart moves to order    |
| PUT      | /shopping-carts/movie-sessions | USER        | Add tickets to shopping cart                                  |
| GET      | /orders                        | USER        | Get user's order history                                      |
| GET      | /shopping-carts/by-user        | USER        | Get user's shopping cart                                      |
