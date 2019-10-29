<br><br>
 
 ### Sobre o projeto

<p align="justify"> &emsp;&emsp;
  O Over26 consiste em um Mínimo Produto viável (MVP) para o teste de uma nova experiência de crédito por meio do cheque especial em uma conta de pagamento. O objetivo deste produto consiste em estabelecer um melhor resultado em termos de experiência de usuário e usabilidade para a oferta do serviço no Brasil.
</p>

### Principais funcionalidades

<p align="justify"> 
  Considerando o objetivo do produto, existe um conjunto de funcionalidades de maior importância, são elas:
  
  * Contratação do serviço de Cheque Especial;
  * Ativação do cheque especial;
  * Aumento do limite máximo de crédito;
  * Escolha do limite de crédito a ser utilizado; 
  * Parcelamento da dívida no vigésimo sétimo dia; 
  * Acompanhamento das dívidas;
</p>

<<<<<<< HEAD
### Licença

Para visualizar a licença, acesse [Licence](https://github.com/fga-eps-mds/2019.2-Grupo2/blob/master/LICENSE)

### Começando

O projeto Over26 utiliza o docker para isolar os ambientes de desenvolvimento e produção, sendo o primeiro deles utilizado também para o teste de novas features ou correção de bugs. Assim, em conjunto com o docker compose os ambientes poderão ser utilizados mais facilmente e em poucos comandos no terminal, desde que você possua o docker e o docker compose instalados na sua máquina.

### Configuração usando Docker

**O docker ainda não está configurado para o frontend da aplicação**

* Install Docker

  - [Download docker](https://docs.docker.com/engine/installation/)

* Install Docker Compose

  - [Download docker-compose](https://docs.docker.com/compose/install/)

* Construir a imagem do conteiner 

  * Ambiente de Desenvolvimento
        
        $ docker-compose build 

  * Ambiente de Produção (Não está disponível)
        
        $ docker-compose -f docker-compose-prod.yml build

* Rodar o conteiner

  * Ambiente de Desenvolvimento
        
        $ docker-compose up 
    
  * Ambiente de Produção
  
        $ docker-compose up 

* Após subir o ambiente, abra http://localhost:3000/ no browser

### Rodando os testes

### Usando a aplicação
=======


#### [Frontend](https://github.com/fga-eps-mds/2019.2-Over26)

[![Test Coverage](https://api.codeclimate.com/v1/badges/c851dcabaf95d246afd4/test_coverage)](https://codeclimate.com/github/fga-eps-mds/2019.2-Grupo2/test_coverage)  [![Maintainability](https://api.codeclimate.com/v1/badges/c851dcabaf95d246afd4/maintainability)](https://codeclimate.com/github/fga-eps-mds/2019.2-Grupo2/maintainability) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

#### [Backend](https://github.com/fga-eps-mds/2019.2-Over26-Backend)

[![TesTest Coveragets](https://codecov.io/gh/fga-eps-mds/2019.2-Over26-Backend/branch/master/graph/badge.svg)](https://codecov.io/gh/fga-eps-mds/2019.2-Over26-Backend/branch/master/) [![Maintainability](https://api.codeclimate.com/v1/badges/c851dcabaf95d246afd4/maintainability)](https://codeclimate.com/github/fga-eps-mds/2019.2-Grupo2-Backend/maintainability) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

### Licença

Para visualizar a licença, acesse [Licence](https://github.com/fga-eps-mds/2019.2-Grupo2/blob/master/LICENSE)

Caso queira contribuir, visualize o nosso [contributing](https://github.com/fga-eps-mds/2019.2-Over26/blob/master/.github/CONTRIBUTING.md)
>>>>>>> 3e79b6eb774371d06846ee909d24bd7c68160482
