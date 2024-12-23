Hospital Tablet Display System
This project provides a hospital tablet display system that shows patient information (such as patient name, room number, and attending doctor's name) on Android tablets mounted at the entrance of each hospital room. It uses a Spring Boot backend for managing the data and a React Native frontend for displaying the information on tablets.

Features:
Displays patient details on the tablet screen.
Real-time updates when patient details are updated (using WebSockets or polling).
Easy-to-use backend for managing patients, doctors, and appointments.
Simple REST APIs to communicate between the backend and frontend.
Tech Stack
Backend:

Spring Boot: For building the backend RESTful APIs.
Spring Data JPA: For interacting with the database and managing entities.
MySQL: As the relational database for storing patient and doctor information.
WebSockets (optional): For real-time updates to the tablets when patient details change.
JWT Authentication: For securing the API endpoints.
Frontend:

React Native: For building the mobile/tablet app.
Axios: For making HTTP requests to the backend API.
WebSockets (optional): For receiving real-time updates on the frontend.
Other:

Docker: For containerizing the backend and database services (optional).
Swagger/OpenAPI: For API documentation and testing
