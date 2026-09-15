# 🚀 API RESTful de Gerenciamento de Usuários

[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue?style=for-the-badge&logo=postgresql)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-Container-blue?style=for-the-badge&logo=docker)](https://www.docker.com/)

API RESTful desenvolvida em **Java 21** e **Spring Boot** para o gerenciamento e cadastro de usuários, utilizando **PostgreSQL** containerizado via **Docker Compose** e persitência de dados com **Spring Data JPA**.

---

## 📌 Sumário
- [Recursos da Aplicação](#-recursos-da-aplicação)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Arquitetura e Estrutura](#-arquitetura-e-estrutura)
- [Como Executar o Projeto](#-como-executar-o-projeto)
- [Endpoints da API](#-endpoints-da-api)
- [Autor](#-autor)

---

## ⚙️ Recursos da Aplicação
- Cadastro de novos usuários.
- Listagem completa de usuários cadastrados no banco de dados.
- Mapeamento de entidade relacional utilizando ORM (Hibernate / Spring Data JPA).
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

## 📐 Arquitetura e Estrutura

O projeto segue a arquitetura em camadas tradicional do ecossistema Spring:
