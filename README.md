# SpringBoot API Rest - Java 

![Component 1(1)](https://user-images.githubusercontent.com/87834766/229373562-11bf62c8-e8d4-4876-9243-0b6a33089db1.png)

 #### Resumo
 Projeto em Spring Boot para o desenvolvimento de uma API Rest com funcionalidades de CRUD, validações, paginação e ordenação. São utilizadas tecnologias como Java 17, Lombok, MySQL/Flyway, JPA/Hibernate, Maven e Insomnia. A estrutura do projeto é criada a partir do Spring Initializr e a IDE utilizada é o IntelliJ. O projeto tem como objetivo a implementação de funcionalidades de cadastro, listagem, atualização e exclusão de médicos e pacientes, além de agendamento e cancelamento de consultas.
 
![badge](https://img.shields.io/badge/-Java-yellow)
![badge1](https://img.shields.io/badge/-Spring%20Boot-yellow)
![badge2](https://img.shields.io/badge/Status-Em%20Desenvolvimento-red)
![badge3](https://img.shields.io/badge/-Alura-purple)
![badge4](https://img.shields.io/badge/-API%20Rest-pink)

## Objetivos
✾ Desenvolvimento de uma API Rest <br />
✾ CRUD <br />
✾ Validações <br />
✾ Paginação e Ordenacação <br />

## Tecnologias 
✾ Spring Boot **3** <br />
✾ Java 17 - LTS <br />
✾ Lombok <br />
✾ MySQL/Flyway <br />
✾ JPA/Hibernate <br />
✾ Maven <br />
✾ Insomnia <br/>

## Spring Initializr
[Acesso o Spring Initializer](https://start.spring.io/)
### Project
Maven Project
### Language
Java
### Spring Boot - Version
3.0.5
### Project Metadata
✾ **Group:** med.voll <br />
✾ **Artifact:** api <br />
✾ **Name:** api <br />
✾ **Description:** API Rest da aplicação Voll.med <br />
✾ **Package name:** med.voll.api <br />
✾ **Packaging:** Jar <br />
✾ **Java:** 17 <br />
### Dependencies
✾ Spring Boot DevTools <br />
✾ Lombok <br />
✾ Spring Web <br/>

### IDE Utilizada
IntelliJ

## Estrutura Inicial
![image](https://user-images.githubusercontent.com/87834766/229374553-d124a4f0-8712-4053-83d0-e4ff02c42be3.png) 
<sub>Estrutura de diretório inicial do IntelliJ. Projeto que utiliza Maven, logo possui a estrutura de diretórios do **Maven**. </sub>

# Adicionando Novas Dependências
<sub>Amplificando a funcionalidade do projeto</sub>
> 1. [start.spring](https://start.spring.io/)
> 2. "Add Dependencies" - Adicionar dependências
> 3. "Explore" - Arquivo pom.xml <sub>**verifique se está selecionado a opção "Maven"**</sub>
> 4. Procure as dependências, dentro do código, selecione e copie e cole no arquivo "pom.xml" do projeto, logo abaixo da última dependência.
>> Dependências adicionadas: <i>Validation</i>, <i>MySql Driver</i>, <i>Spring Data JPA</i> e <i>Flyway Migrations</i>.
> 
> Reload All Maven Projects, para que as dependências sejam carregadas.
## Configurar <i>DataSource</i>
> src > resources > **application.properties**
>
add 3 propriedades: URL de conexão com o banco de dados, login, senha.
~~~
spring.datasource.url=jdbc:mysql:://localhost/vollmed_api
spring.datasource.usernamento=seu_username_aqui
spring.datasource.password=sua_senha_aqui
~~~
acesse o mysql pela Command Line Client 
~~~sql
create database vollmed_api
~~~

# Testando a listagem 
- Insomnia para testar a API
## Criar uma nova requisição
“+ > Http Request”.  - O verbo será o padrão, “GET”. A URL da requisição será o mesmo endereço do cadastro: “http://localhost8080/medicos” -- medicos/pacientes
> O verbo da requisição Cadastro e Listagem são diferentes, portanto não haverá conflito.
>
O body da requisição irá vazio.

#  Paginação 
Para controlar o número de registros a serem exibidos, a URL é passada com o parâmetro `?size`.
>  o Spring devolve 20 registros por padrão.
>
Para trazermos a página,é passado outro parâmetro na URL, após usar um & -- `page`.
> Com os parâmetros *page* e *size*, controlamos a paginação.
> 
## Check-List de Funcionalidades a **Desenvolver**
- [x] Cadastro de Médicos 
- [x] Listagem de Médicos
- [x] Atualização de Médicos
- [x] Exclusão de Médicos
- [x] Cadastro de Pacientes
- [x] Listagem de Pacientes 
- [x] Atualização de Pacientes 
- [x] Exclusão de Pacientes  
- [ ] Agendamento de Consultas  ![progresso](https://img.shields.io/badge/-...em%20desenvolvimento-blue)
- [ ] Cancelamento de Consultas  ![progresso](https://img.shields.io/badge/-...em%20desenvolvimento-blue)
- [ ] Finish  :tada:


