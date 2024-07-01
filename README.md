<h1> Forum HUB </h1>

<p>Forum-Hub é uma API para um fórum de discussão, desenvolvida com Spring Boot e utilizando MySQL para armazenamento de dados. Esta API permite a criação, gerenciamento e interação com tópicos de discussão. A segurança é garantida pelo Spring Security, assegurando que apenas usuários autenticados possam acessar determinados endpoints.</p>

<img src="imagens/diagramaBD.png" alt="Diagrama do Banco de Dados" width="600" height="400">

## Configuração do Ambiente de Desenvolvimento

Para executar o projeto em seu ambiente local, siga os passos abaixo:

1. **Clonar o Repositório:**

  ```shell
  git clone https://github.com/0t4v14n0/Challenge-ForumHub.git
  ```

2. **Configurar o Banco de Dados:**
- Crie um banco de dados PostgreSQL chamado `forum_hub`.
- Configure as credenciais do banco no arquivo `application.properties`.

3. **Executar o Projeto:**
- Execute o projeto Spring Boot usando sua IDE preferida (como Eclipse ou IntelliJ IDEA) ou através do Maven:
  ```
  mvn spring-boot:run
  ```

4. **Acessar as Funcionalidades:**
- Após iniciar o servidor, acesse as funcionalidades através de um cliente HTTP ou através de uma interface de usuário (front-end) desenvolvida.

<h1>EndPoints</h1>
<img src="imagens/points.png" alt="End Points" width="600" height="500">

<h1>Cadastro POST /cadastro</h1>
<p>Entrada:</p>
<img src="imagens/cadastro1.png" alt="End Points" width="150" height="100">

<p>Saida:</p>
<img src="imagens/cadastro2.png" alt="End Points" width="150" height="100">

<h1>Login POST /login</h1>
<p>Entrada:</p>
<img src="imagens/login.png" alt="End Points" width="150" height="100">
<p>Saida:</p>

  ```
  "Token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqb2FvQGV4YW1wbGUuY29tIiwiaXNzIjoiQVBJIGZvcnVtX2h1YiIsImlkIjozLCJleHAiOjE3MTk4MjA0OTN9.LHaeTw-Wm8dJzN2ScctocW_17ezaxpFA7bSz43Rz86k"
  ```

<h1>Tecnologias Utilizadas</h1>
	<ul>
		<li>Java</li>
		<li>Spring Boot</li>
		<li>Spring Security</li>
		<li>MySQL</li>
		<li>JPA / Hibernate</li>
	</ul>

