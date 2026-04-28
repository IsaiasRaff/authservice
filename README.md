Este projeto é uma aplicação desenvolvida utilizando o ecossistema Spring, com foco em construção de APIs REST seguras, organizadas e escaláveis. A aplicação segue boas práticas de arquitetura em camadas e utiliza autenticação e autorização com Spring Security.
<br><br>
🛠️ Tecnologias Utilizadas
☕ Java 17+
🌱 Spring Boot
🌐 Spring Web
🔐 Spring Security
🗄️ Spring Data JPA
🐘 Banco de Dados (PostgreSQL)
📦 Maven
🔄 Lombok
   Postman
<br><br>
🏗️ Arquitetura<br>
O projeto segue o padrão de arquitetura em camadas, promovendo separação de responsabilidades:<br><br>

📦 src/main/java<br>
 ┣ 📂 controller       → Camada de entrada (API REST)<br>
 ┣ 📂 service          → Regras de negócio<br>
 ┣ 📂 repository       → Acesso a dados (JPA)<br>
 ┣ 📂 dto              → Objetos de transferência de dados<br>
 ┣ 📂 entity           → Entidades do banco de dados<br>
 ┣ 📂 config           → Configurações (Security, Beans, etc)<br>
 ┗ 📂 exception        → Tratamento de exceções<br><br>
 
🔁 Fluxo da aplicação:<br>
Controller → Service → Repository → Banco de Dados<br><br>

🔐 Segurança (Spring Security)<br>
A aplicação utiliza o Spring Security para controle de autenticação e autorização.<br><br>

Funcionalidades implementadas:<br>
Autenticação baseada em login e senha<br>
Criptografia de senha<br>
Proteção de endpoints<br>
Uso de JWT para autenticação<br><br>

📡 Endpoints<br>
Método	Endpoint	Descrição<br>
POST	/usuarios	Cadastrar usuário<br>
POST	/auth/login	Autenticação<br>
GET	/usuarios	Listar usuários (protegido)<br><br>

⚙️ Como executar o projeto<br>
Pré-requisitos:<br>
Java 17+<br>
Maven<br><br>

Passos:<br>
# Clonar repositório<br>
git clone https://github.com/IsaiasRaff/aprendendospring<br><br>

# Entrar na pasta<br>
cd seu-repo<br><br>

# Rodar aplicação<br>
mvn spring-boot:run<br><br>

A aplicação estará disponível em:<br>
http://localhost:8080<br><br>

🧪 Testes<br>
Para rodar os testes:<br>
Postman<br>
mvn test<br><br>

📄 Boas práticas aplicadas<br>
Separação por camadas (Controller, Service, Repository)<br>
Uso de DTO para comunicação externa<br>
Tratamento global de exceções<br>
Código limpo e organizado (Clean Code)<br>
Injeção de dependências com Spring<br><br>

📌 Melhorias futuras<br>
Implementação completa de JWT<br>
Documentação com Swagger/OpenAPI<br>
Testes automatizados mais robustos<br>
Deploy em ambiente cloud (AWS, Heroku, etc)
