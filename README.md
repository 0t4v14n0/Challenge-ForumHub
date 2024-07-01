<h1> Forum HUB </h1>

<h2>Descrição</h2>
<p>Forum-Hub é uma API para um fórum de discussão, desenvolvida com Spring Boot e utilizando MySQL para armazenamento de dados. Esta API permite a criação, gerenciamento e interação com tópicos de discussão. A segurança é garantida pelo Spring Security, assegurando que apenas usuários autenticados possam acessar determinados endpoints.</p>

<h2>Sumario</h2>
<ul>
  <li><a href="#diagrama">Diagrama do Banco de Dados</a></li>
  <li><a href="#config">Configuração do Ambiente de Desenvolvimento</a></li>
  <li>
      <a href="#endpoint">ENDPOINTS</a>
      <ul>
          <li><a href="#cadastro">POST /cadastro</a></li>
          <li><a href="#login">POST /login</a></li>
          <li><a href="#ptopico">POST /topico</a></li>
          <li><a href="#gtopico">GET &nbsp&nbsp/topico</a></li>
          <li><a href="#putopico">PUT &nbsp&nbsp/topico</a></li>
          <li><a href="#dtopico">DELETE &nbsp&nbsp/topico</a></li>
          <li><a href="#presposta">POST /resposta</a></li>
          <li><a href="#pcurso">POST /curso</a></li>
          <li><a href="#gcurso">GET &nbsp&nbsp/curso</a></li>
      </ul>
  </li>
  <li><a href="#tecnologia">Tecnologias Usadas</a></li>
</ul>

<img id = "diagrama" src="imagens/diagramaBD.png" alt="Diagrama do Banco de Dados" width="800" height="600">

<h1 id = "config">Configuração do Ambiente de Desenvolvimento </h1>

Para executar o projeto em seu ambiente local, siga os passos abaixo:

<h2>1- Clonar o Repositório:</h2>

  ```shell
  git clone https://github.com/0t4v14n0/Challenge-ForumHub.git
  ```

<h2>2- Configurar o Banco de Dados:</h2>
<p>Crie um banco de dados PostgreSQL chamado `forum_hub`.</p>
<p>Configure as credenciais do banco no arquivo `application.properties`.</p>

<h2>3- Executar o Projeto:**
<p>Execute o projeto Spring Boot usando sua IDE preferida (como Eclipse ou IntelliJ IDEA) ou através do Maven:</p>

  ```shell
  mvn spring-boot:run
  ```

<h2>4- Acessar as Funcionalidades:</h2>
<p>Uma vez que o aplicativo estiver em execução, você pode acessar a documentação da API através do Swagger UI em http://localhost:8080/swagger-ui/index.html, ou através de uma interface de usuário (front-end) desenvolvida.</p>

<h1 id = "endpoint">ENDPOINTS</h1>
<img src="imagens/endpoints.png" alt="End Points" width="800" height="600">

<h1 id = "cadastro">Cadastro POST /cadastro</h1>
<p>Entrada:</p>
<img src="imagens/cadastro1.png" alt="End Points" width="150" height="100">

<p>Saida:</p>
<img src="imagens/cadastro2.png" alt="End Points" width="150" height="100">

<h1 id = "login">Login POST /login</h1>
<p>Entrada:</p>
<img src="imagens/login.png" alt="End Points" width="150" height="100">
<p>Saida:</p>

  ```
  "Token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqb2FvQGV4YW1wbGUuY29tIiwiaXNzIjoiQVBJIGZvcnVtX2h1YiIsImlkIjozLCJleHAiOjE3MTk4MjA0OTN9.LHaeTw-Wm8dJzN2ScctocW_17ezaxpFA7bSz43Rz86k"
  ```
   
<h1 id ="ptopico">Novo Topico POST /topico</h1>
<p>Entrada:</p>
<img src="imagens/cadastroTopico1.PNG" alt="End Points" width="150" height="100">
<p>Saida:</p>
<img src="imagens/cadastroTopico2.PNG" alt="End Points" width="400" height="500">

<h1 id = "gtopico">Lista Topico GET /topico</h1>
<p>Saida:</p>
<img src="imagens/getTopico.png" alt="End Points" width="400" height="500">

<h1 id = "putopico">Atualiza Topico PUT /topico</h1>
<p>Saida:</p>
<img src="imagens/putTopico1.png" alt="End Points" width="259" height="250">

<h1 id = "dtopico">Coloca o topico como "Resolvido" DELETE /topico</h1>
<p>Entrada:</p>
<p>{id} enviado pela URL</p>
<p>Saida:</p>
<img src="imagens/getTopico.png" alt="End Points" width="400" height="500">


<h1 id = "presposta">Resposta POST /resposta</h1>
<p>Entrada:</p>
<img src="imagens/resposta1.png" alt="End Points" width="160" height="100">

<h1 id = "pcurso">Curso POST /curso</h1>
<p>Entrada:</p>
<img src="imagens/curso1.png" alt="End Points" width="160" height="100">

<p>Saida:</p>
<img src="imagens/curso2.png" alt="End Points" width="160" height="100">

<h1 id = "gcurso">Curso GET /curso</h1>
<p>Saida:</p>
<img src="imagens/curso2.png" alt="End Points" width="160" height="100">

<h1 id = "tecnologia">Tecnologias Utilizadas</h1>

<img align="center" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
<img align="center" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
<img align="center" src="https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white" />
<img align="center" src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
<img align="center" src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white" />
<img align="center" src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white" />
