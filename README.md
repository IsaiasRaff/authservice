<h3>This project is an application developed using the Spring ecosystem, focused on building secure, well-structured, and scalable REST APIs. The application follows best practices for layered architecture and implements authentication and authorization using Spring Security.</h3>
<br><br>

🛠️ <b>Technologies Used</b><br>
☕ Java 17+<br>
🌱 Spring Boot<br>
🌐 Spring Web<br>
🔐 Spring Security<br>
🗄️ Spring Data JPA<br>
🐘 PostgreSQL Database<br>
📦 Maven<br>
🔄 Lombok<br>
🧪 Postman
<br><br>

🏗️ <b>Architecture</b><br>
The project follows a layered architecture pattern, promoting separation of concerns:
<br><br>

📦 src/main/java<br>
┣ 📂 controller → Entry layer (REST API)<br>
┣ 📂 service → Business logic<br>
┣ 📂 repository → Data access (JPA)<br>
┣ 📂 dto → Data Transfer Objects<br>
┣ 📂 entity → Database entities<br>
┣ 📂 config → Configurations (Security, Beans, etc.)<br>
┗ 📂 exception → Exception handling<br><br>

🔁 <b>Application Flow:</b>
<br>
Controller → Service → Repository → Database
<br><br>

🔐 <b>Security (Spring Security)</b><br>
The application uses Spring Security for authentication and authorization control.
<br><br>

<b>Implemented features:</b><br>
Authentication based on email and password<br>
Password encryption<br>
Endpoint protection<br>
JWT-based authentication<br><br>

📡 <b>Endpoints</b><br>
Method	| Endpoint	| Description<br>
POST	| /usuarios	| Create user<br>
POST	| /auth/login	| Authentication<br>
GET	| /usuarios	| List users (protected)<br><br>

⚙️ <b>How to Run the Project</b><br>
Prerequisites:<br>
Java 17+ | Maven<br><br>

<b>Steps:</b>
<br><br>

Clone the repository<br>
git clone https://github.com/IsaiasRaff/authservice
<br><br>

Navigate to the project folder<br>
cd your-repo
<br><br>

Run the application<br>
mvn spring-boot:run
<br><br>

The application will be available at:<br>
http://localhost:8080
<br><br>

🧪 <b>Testing</b><br>
To run tests:<br>
Postman<br>
PostgreSQL<br>
Maven: mvn test <br><br>

📄 <b>Best Practices Applied</b><br>
Layered architecture (Controller, Service, Repository)<br>
Use of DTOs for external communication<br>
Global exception handling<br>
Clean and organized code (Clean Code)<br>
Dependency injection with Spring<br><br>

<b>📌 Future Improvements</b><br>
Full JWT implementation<br>
API documentation with Swagger/OpenAPI<br>
More robust automated tests<br>
Cloud deployment (AWS, Heroku, etc.)
