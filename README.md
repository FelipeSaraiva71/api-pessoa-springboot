👤 API de Cadastro de Pessoas - Spring Boot
API REST desenvolvida com Spring Boot para gerenciar registros de pessoas, permitindo operações básicas de criação, consulta, atualização e exclusão. Ideal para praticar os fundamentos de Java, Spring Web, JPA e boas práticas de arquitetura em projetos backend.

✅ Funcionalidades
- Cadastro de pessoas
Registra pessoas com os seguintes atributos: nome e sobrenome, com validação personalizada.
- Consulta de pessoas
Lista todas as pessoas cadastradas ou busca por ID.
- Atualização de pessoas
Permite editar os dados de uma pessoa existente.
- Remoção de pessoas
Exclui registros do sistema de forma segura.

📦 Tecnologias utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (para testes)
- Maven

📜 Estrutura do Código
- Pessoa.java → Entidade principal com os atributos: nome e sobrenome, incluindo validação via classe Util.
- PessoaRepository.java → Interface que estende JpaRepository para operações no banco.
- PessoaService.java → Camada de serviço que encapsula a lógica de negócio.
- PessoaController.java → Endpoints REST para manipulação dos dados de pessoa.
- Util.java → Classe utilitária para validação de nomes.
- application.properties → Configuração do banco H2 e comportamento da aplicação.
- SpringbootCadastroPessoaApplication.java → Classe principal que inicia a aplicação.

🔗 Endpoints da API
|  |  |  | 
| GET | /pessoas |  | 
| GET | /pessoas/{id} |  | 
| POST | /pessoas |  | 
| PUT | /pessoas/{id} |  | 
| DELETE | /pessoas/{id} |  | 

🔮 Melhorias Futuras
- 🧾 Validação de campos com mensagens personalizadas
- 🗃️ Integração com banco de dados relacional (MySQL ou PostgreSQL)
- 🔐 Autenticação básica para proteger os endpoints
- 📊 Paginação e ordenação de resultados
- 🧪 Testes unitários e de integração com JUnit
- 🌐 Documentação da API com Swagger
- 🎨 Interface web para visualização e cadastro de pessoas
- 📋 Registro de logs e auditoria de operações

✨ Autor
Desenvolvido por Felipe Saraiva



