# Hospital Tablet Display System

This project provides a hospital tablet display system that shows patient information (such as patient name, room number, and attending doctor's name) on Android tablets mounted at the entrance of each hospital room. The system is built using **Spring Boot** for the backend and **React Native** for the frontend, ensuring efficient communication between the hospital management system and the tablet display devices.

## Features
- Displays patient details (name, room, doctor) on hospital tablets.
- Real-time updates using WebSockets (optional) when patient details change.
- RESTful API to manage and fetch patient and doctor information.
- Simple and intuitive tablet interface.

## Tech Stack

- **Backend:**
  - **Spring Boot**: For building RESTful APIs and handling backend logic.
  - **Spring Data JPA**: For interacting with the MySQL database.
  - **MySQL**: Database to store patient and doctor information.
  - **Spring WebSockets** (optional): For real-time updates to the tablet displays.
  - **JWT Authentication** (optional): For securing API endpoints.

- **Frontend:**
  - **React Native**: For building the tablet application (Android and iOS).
  - **Axios**: For making HTTP requests to the backend API.
  - **WebSockets** (optional): For real-time communication between the backend and frontend.

- **Other Tools:**
  - **Docker**: For containerizing the backend and MySQL database (optional).
  - **Swagger/OpenAPI**: For API documentation and testing.

## Getting Started

### Prerequisites

To run the project locally, you need to have the following installed:

1. **Java 11+** (for Spring Boot backend)
2. **Node.js** and **npm** (for React Native frontend)
3. **MySQL** or another relational database
4. **Android Studio** (for running the React Native app on Android)
5. **Xcode** (for running the React Native app on iOS, optional)

### 1. Backend Setup (Spring Boot)

#### Clone the Repository
Clone the backend repository:

```bash
git clone https://github.com/your-username/hospital-tablet-display-backend.git
cd hospital-tablet-display-backend
