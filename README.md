# 🚀 API RESTful de Gerenciamento de Usuários

![Java 21](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot 3](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![PostgreSQL 16](https://img.shields.io/badge/PostgreSQL-16-blue?style=for-the-badge&logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-Container-blue?style=for-the-badge&logo=docker)

API RESTful desenvolvida em **Java 21** e **Spring Boot** para gerenciamento e cadastro de usuários, utilizando **PostgreSQL** rodando via **Docker Compose** e persistência de dados com **Spring Data JPA**.

---

## ⚙️ Recursos da Aplicação
- Cadastro de novos usuários.
- Listagem completa de usuários cadastrados no banco de dados.
- Mapeamento de entidade relacional com ORM (Hibernate / Spring Data JPA).
- Containerização de banco de dados PostgreSQL isolado para ambiente de desenvolvimento.

---

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 21
- **Framework:** Spring Boot 3.x
- **Persistência de Dados:** Spring Data JPA / Hibernate
- **Banco de Dados:** PostgreSQL 16
- **Infraestrutura:** Docker & Docker Compose
- **Gerenciador de Dependências:** Maven
- **Utilitários:** Lombok

---

## 📐 Estrutura do Código

    src/main/java/com/exemplo/projeto/
    ├── controller/     # Rotas e Endpoints REST
    ├── model/          # Entidades do banco de dados
    └── repository/     # Comunicação com o banco (JPA)

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- [Git](https://git-scm.com)
- [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)

### Passo a Passo

1. Suba o banco de dados via Docker:

    docker compose up -d

2. Execute a aplicação Spring Boot:

    ./mvnw spring-boot:run

A aplicação estará disponível em http://localhost:8080.

---

## 🔌 Endpoints da API

| Método | Endpoint    | Descrição                     |
| :---   | :---        | :---                          |
| GET  | /usuarios | Lista todos os usuários       |
| POST | /usuarios | Cadastra um novo usuário      |

### Exemplo de JSON para Cadastro (POST /usuarios)

    {
      "nome": "Desenvolvedor Backend",
      "email": "dev@email.com"
    }

---

## 👤 Autor

Desenvolvido por mim como projeto de fixação prática em Engenharia de Software.
