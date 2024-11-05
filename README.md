# Aplicação de Frases Aleatórias de Filmes e Séries

Uma aplicação para gerar frases aleatórias de filmes e séries, que serão consumidas por uma aplicação front-end.

## 🚀 Descrição do Projeto

- Implementação de uma **API REST** que disponibiliza dados através do endpoint: `http://localhost:8080/series/frases`.
- Criação das classes **Controller**, **Service** e **Repository** para gerenciar as requisições e operações de busca no banco de dados.
- Definição da classe **Model** chamada `Frase` com os atributos:
  - `id`
  - `titulo`
  - `frase`
  - `personagem`
  - `poster`
- Criação da classe `SerieDTO` para representar os dados que serão enviados à aplicação front-end.
- Estruturação do projeto utilizando o [Spring Initializr](https://start.spring.io/), com as dependências **Spring Web**, **Spring Data JPA**, **PostgreSQL** e **DevTools**.
- Configuração do banco de dados diretamente via **pgAdmin**.

## 🔨 Objetivos do Projeto

- Consolidar conhecimentos adquiridos em **Spring**, **Streams**, **JPA** e desenvolvimento de aplicações Web.
- Desenvolver o projeto do zero, modelando as classes, testando o acesso ao banco de dados e corrigindo eventuais erros na recuperação de dados pelo front-end.
- Configurar corretamente o controlador, mapeando a rota que será consumida pela aplicação front-end.
- Compreender e resolver problemas relacionados ao **CORS**.
- Proporcionar uma experiência full-stack, compreendendo o fluxo completo da aplicação ponta a ponta.

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **pgAdmin**
- **DevTools**

## 📂 Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── seuPacote/
│   │           ├── controller/
│   │           ├── service/
│   │           ├── repository/
│   │           ├── model/
│   │           └── dto/
│   └── resources/
│       └── application.properties
