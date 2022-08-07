# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles:
- Singleton
- Strategy/Repository
- Facade

## O Projeto
O usuário vai passar um nome e um numero de cep, e o sistema vai preencher automaticamente endereço deste cep.

### Tecnologias utilizadas
- Java
- Spring boot
- Banco de dados H2
- Swagger UI
- API Via Cep: [Link do site da API](https://viacep.com.br/)

### Arquitetura Do Projeto


### Utilização e Documentação
1. Clone Repositório 
2. Aguarde mave baixar as dependências
3. [opcional] Troque a porta padrão no aquirvo application.properties adicione esta linha: **server.port=${port:3001}**
4.  Rode o projeto e entre no endereço: http://localhost:3001/swagger-ui/index.html
### Documentação
Pagina principal com os metodos Get, Post, Put, Delete.<br>
![](/src/main/java/fotos/readme1.png)

Adicinado um novo usuario e endereço.<br>
![](/src/main/java/fotos/POST.png)<br>

Mostrando usuário Cadastrado busca feita por id, Nome e endereço.<br>
![](/src/main/java/fotos/GET-id.png)<br>
Atualizar endereços.<br>
![](/src/main/java/fotos/PUT.png)<br>
Deletetar Usuário endereços.<br>
![](/src/main/java/fotos/DELETE.png)<br>
### Próximas atualizações 
customizar tratamentos de exceções.