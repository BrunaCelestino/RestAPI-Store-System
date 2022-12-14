Utilizar o Java JDK 11 Gerenciador de Dependências: Maven Base de Dados: Postgres Versionamento base de dados: Flyway

Requisitos e Funcionalidades Esperadas
[x] Iniciar uma nova aplicação utilizando o Spring Initializr (https://start.spring.io/)
[ ] Construir APIs REST (API na maturidade Richard) para os serviços de backend que foram desenvolvidos no Desafio do Módulo 1.
[ ] Alterar o backend para que os dados sejam armazenados em banco de dados, Postgres.
[ ] Integrar a camada de linha de comando (Desafio Módulo 1) com as APIs Rest do backend.
[ ] Construir as interfaces para os serviços REST de inclusão, edição, exclusão, listar e importação do arquivo de mostruário da fábrica (todas as colunas).
[ ] Construir imagem docker para o backend. Publicar essas imagem no Docker Hub
[ ] Disponibilizar um Docker Compose com: Banco de dados.
[ ] Documentação das APIs com Open API
[ ] Utilizar o Spring-data
[ ] Criar um README.md contendo as orientações para rodar a aplicação e suas dependências pela linha de comando.
[ ] Criar arquivo Json para importar as APIs no Postman.
[ ] Testes Unitários com o Mockito.
[x] Versionar o Projeto, criar 2 branches "DEV" e "MAIN". (Desenvolver utilizando Branch-Features)
Bonus extra
[ ] Utilizar protocolo OAuth2 para proteger a API com token de autenticação JWT.
[ ] Utilizar Spring Security
[ ] Versionar as APIs.
[ ] Listagem eficiente.
[ ] Utilizar Libs Faker ou Podman para os testes.
Material de Apoio
DBeaver
Instruções para Realização do Desafio
Faça um fork desse repositório para a sua conta
Implemente a sua solução conforme solicitado
Compartilhe o link do projeto com o seu mentor em um repositório público, se utilizar o GITHUB.
Critérios de Avaliação
A aplicação está funcionando?
A aplicação atende os requisitos solicitados?
Os serviços REST foram construídos?
Os verbos HTTP foram utilizados corretamente?
É possível incluir um novo produto pela API?
É possível editar os dados de um produto pela API?
É possível excluir um produto pela API?
É possível listar os produtos pela API?
A importação de arquivo .csv funciona corretamente pela API?
Os dados são armazenados corretamente no Postgres?
Pode ser claramente entendido o que o código faz?
O Código é fácil de entender?
A estrutura do código é modular o suficiente?
A solução escolhida atende aos requisitos?
Como está o desempenho? Existe algum código que afeterá a performance?
O código funciona como esperado?
As classes e pacotes estão segregados por responsabilidade ou funcionalidade?
Os métodos ou contrutores estão recebendo muitos argumentos por parâmetros?
O código da aplicação está com nomes intuitivos de funções, variáveis ou classes?
O escopo das variáveis de classes estão sendo utilizados de forma adequada?
Existe cobertura de teste unitários de cenário feliz e cenário de erros para as funcionalidades desenvolvidas?
A aplicação apresenta bugs?
Existe um correto tratamento de erros e exceções?
A aplicação possui logs úteis?
Existe um readme contendo instruções de como rodar a aplicação?
A nomenclatura das APIs está intuitiva?
Os status HTTP para casos de falha ou sucesso estão sendo utilizando adequadamente?
A API possui versionamento?