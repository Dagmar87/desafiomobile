# Aplicativo de Notas

Esse projeto Spring Boot foi desenvolvido por José Dagmar Florentino da Silva Sobrinho para o Desafio Técnico do Armazém Paraíba. O projeto consiste na criação de uma implementação de aplicativo de notas,   utilizando como serviços de APIs, as operações CRUD (Create, Read, Update e Delete) para funcionamento do aplicativo.

As tecnologias usadas nesse projeto foram:

- Linguagem Java (Versão 8)
- Banco de Dados MySQL
- Spring Boot
- Spring Data JPA
- Maven
- Hibernate
- Lombok
- Validation
- RESTful
- Apache Tomcat
- IDE Eclipse
- Insomnia

### Estrutura do Projeto

O projeto do DesafioMobile possui a seguinte estrutura de pacotes e de classes:

DesafioMobile (Projeto)

- DesafioMobileApplication (Classe)
- Controller (Pacote)
  - NotaController (Classe)
- Model (Pacote)
  - Nota (Classe)
- Repository (Pacote)
  - NotaRepository (Classe)

Esse projeto é dividido, como qualquer outro projeto SpringBoot, em 3 pacotes: Controller, Model e Repository.

Nesses pacotes contém uma única classe para sua respectiva operação: Nota.

### Banco de Dados

Para esse projeto, foi criado uma única tabela no banco de dados MySQL chamada Nota. E essa tabela possui os seguintes atributos:

- Id - LONG - PK (Chave Primaria da Tabela) - O numero da id da nota;
- Titulo - STRING - O titulo da nota;
- Texto - STRING - A descrição da nota;

Esses atributos dessa tabela serão espelhados nos atributos da classe, com mesmo nome, do pacote Model do projeto.

### Operações CRUD do Projeto

Nesse projeto foi realizado uma única operação CRUD, sendo essa é referente a tabela de Nota. Essas operações CRUD foram testadas no programa de API Client chamada Insomnia.

#### Nota

- FindAll => Essa operação irá consultar uma lista de todas notas cadastradas.

URL deste método: http://localhost:8080/nota

- FindById => Essa operação irá consultar uma determinada nota cadastrada partir do id desta

URL deste método: http://localhost:8080/nota/{id}

- Create => Essa operação irá criar um novo cadastro de uma nota.

URL deste método: http://localhost:8080/nota

- Update => Essa operação irá atualizar os dados de uma nota cadastrada.

URL deste método: http://localhost:8080/nota/{id}

- Delete => Essa operação irá apagar os dados da nota cadastrada.

URL deste método: http://localhost:8080/nota/{id}

#### Resultados das Operações no MySQL

Após realização das operações CRUD, os dados serão enviados e guardados no banco de dados MySQL na tabela Nota, como vemos na imagem abaixo:

##### Nota

​													Resultado das Operações CRUD do campo Nota no MySQL