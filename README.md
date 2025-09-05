# 👤 API de Cadastro de Pessoas - Spring Boot

API REST desenvolvida com **Spring Boot** para gerenciar registros de pessoas, permitindo operações básicas de criação, consulta, atualização e exclusão. Ideal para praticar os fundamentos de Java, Spring Web, JPA e boas práticas de arquitetura em projetos backend.

---

## ✅ Funcionalidades

- Cadastro de pessoas com nome e sobrenome, incluindo validação personalizada  
- Consulta de todas as pessoas ou busca por ID  
- Atualização de dados de uma pessoa existente  
- Remoção segura de registros

---

## 📦 Tecnologias utilizadas

- Java 17+  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database (para testes)  
- Maven

---

## 📜 Estrutura do Código

- `Pessoa.java` → Entidade principal com atributos nome e sobrenome, usando validação via `Util`  
- `PessoaRepository.java` → Interface que estende `JpaRepository`  
- `PessoaService.java` → Camada de serviço com lógica de negócio  
- `PessoaController.java` → Endpoints REST da API  
- `Util.java` → Classe utilitária para validação de nomes  
- `application.properties` → Configuração do banco H2  
- `SpringbootCadastroPessoaApplication.java` → Classe principal da aplicação

---

## 🔗 Endpoints da API

| Método   | Endpoint             | Descrição                          |
|----------|----------------------|------------------------------------|
| `GET`    | `/pessoas`           | Lista todas as pessoas             |
| `GET`    | `/pessoas/{id}`      | Busca pessoa por ID                |
| `POST`   | `/pessoas`           | Cadastra uma nova pessoa           |
| `PUT`    | `/pessoas/{id}`      | Atualiza uma pessoa existente      |
| `DELETE` | `/pessoas/{id}`      | Remove uma pessoa do sistema       |

---

## 🔮 Melhorias Futuras

- 🧾 Validação de campos com mensagens personalizadas  
- 🗃️ Integração com banco de dados relacional (MySQL ou PostgreSQL)  
- 🔐 Autenticação básica para proteger os endpoints  
- 📊 Paginação e ordenação de resultados  
- 🧪 Testes unitários e de integração com JUnit  
- 🌐 Documentação da API com Swagger  
- 🎨 Interface web para visualização e cadastro de pessoas  
- 📋 Registro de logs e auditoria de operações

---

✨ Autor  
Desenvolvido por Felipe Saraiva
