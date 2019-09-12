# Documento de Arquitetura
| Data | Versão | Autor(a) | Descrição |
| - | - | - | - |
| 05/09/2019 | 0.1 | João Gabriel | Criação do índice e adição da introdução|
| 05/09/2019 | 0.2 | Gabriel | Adição da visão lógica e desempenho|
| 06/09/2019 | 0.3 | Isabella | Adição de Restrições do projeto|
| 06/09/2019 | 0.4 | Isabella e João Gabriel | Adição de Qualidade|
| 06/09/2019 | 0.5 | Luiza | Adição de Visão de Casos de Uso|
| 09/09/2019 | 0.6 | Erick | Adição de Representação da Arquitetura e correção de índice|
| 11/09/2019 | 0.7 | Luiza | Refatoração da Visão de Casos de Uso|

# Índice
* [1. Introdução](#1.-Introdução)
     * [1.1 Objetivos](1.1.-Objetivos)
     * [1.2. Escopo](1.2.-Escopo-do-documento)

* [2. Representação da Arquitetura](#2.-Representação-da-Arquitetura)

* [3. Restrições e Metas Arquiteturais](#3.-Restrições-e-Metas-Arquiteturais)

* [4. Visão de Casos de Uso](#4.-Visão-de-Casos-de-Uso)

* [5. Visão Lógica](#5.-Visão-Lógica)
     * [5.1. Visão Geral](5.1.-Visão-Geral)

* [6. Restrições](#6.-Restrições)

* [7. Desempenho](#7.-Desempenho)

* [8. Qualidade](#8.-Qualidade)


# 1. Introdução

## 1.1. Objetivos

Tem se por objetivo deste documento detalhar a arquitetura e tecnologias usadas na criação da funcionalidade de "cheque especial" que deverá ser implementada na versão mobile do sistema do banco europeu N26 ,no Brasil.

A nescessidade deste detalhamento se da para o melhor entendimento daqueles responsaveis pelo desenvolvimento, sobre o que foi definido e o que foi produzido de que forma.

##  1.2. Escopo do documento

Conforme dito em Objetivos (1.1.), este documento conterá detalhes sobre a arquitetura escolhida para o sistema,as lógicas por trás das implementações, as linguagens/tecnologias usadas, os padrões estabelecidos pela equipe ,informaçoes referentes a bancos de dados, diagramas de classe  e de caso de uso.

# 2. Representação da Arquitetura

A arquitetura irá seguir o modelo cliente-servidor, onde existe uma aplicação que realiza de fato as tarefas e serviços, o servidor, e outra que faz requisições desses servições e tarefas, o cliente.

Este tipo de arquitetura fornece alta escalabilidade e tem uma grande vantagem quando se trata de manutenção, ponto crítico no caso desde projeto.

Visando manter a escalabilidade da aplicação foi escolhido o Node.js como plataforma de desenvolvimento, além disso com o Express.js, framework de aplicação web, a criação de APIs deve se torna um processo mais simples. Ambas as tecnologias seriam utilizadas no back-end.

Para o front-end será utilizada a linguagem de programação Kotlin visando manter o padrão do sistema da N26.

# 3. Restrições e Metas Arquiteturais

A aplicação do Sistema de Oferta de Crédito terá como base de sua arquitetura o framework Express, que é baseado na linguagem de programação Node.js. O Express permite a criação de APIs de maneira robusta, rápida e fácil e conta com recursos para aplicativos mobile, necessários para o projeto. Ele conta também com um sistema de Views Intuitivo (MVC).

Uma vantagem da utilização do framework é a sua escalabilidade, sendo um requisito necessário para sistemas com diversas conexões concorrentes, além disso o framework é minimalista e flexível, o Express conta com bibliotecas para trabalhar com cookies, sessões, login de usuário e diversas outras funcionalidades.

# 4. Visão de Casos de Uso

## UC01 - Realizar Login

| - | - |
| Descrição | Esta funcionalidade é responsável por realizar login no aplicativo |
| Atores | Usuário |
| Pré-condições | Usuário deve estar conectado à internet |
| Pós-condições | Usuário estará logado na aplicação
Usuário terá acesso às funcionalidades da aplicação|
| Fluxo principal | [FP01] Este fluxo se inicia quando o usuário deseja realizar login na aplicação:
1. Usuário deve inserir o seu e-mail
2. Usuário deve inserir sua senha
3. Usuário deve clicar “Entrar” [FE01] |
| Fluxo de exceção | [FE01] Verificação de conexão à internet
No passo 3 do fluxo principal a aplicação verificará se o usuário está conectado a internet, se não, o sistema não permitirá o login |

## UC02 - Cadastrar

| - | - |
| Descrição | Esta funcionalidade é responsável por realizar cadastro. |
| Atores | Usuário |
| Pré-condições | Usuário deve estar conectado à internet |
| Pós-condições | Aplicação permitirá que o usuário possua um cadastro na aplicação
A aplicação dará como resposta de sucesso no cadastro ao usuário o acesso às funcionalidades |
| Fluxo principal | [FP01] Este fluxo se inicia quando o usuário deseja realizar cadastro na aplicação:
1. Usuário insere seu e-mail ou telefone
2. Usuário insere seu nome completo
3. Usuário insere seu nome de usuário (username)
4. Usuário insere sua senha
5. Usuário clica “Cadastre-se”"[FE01] |
| Fluxo de exceção | [FE01] Verificação de conexão à internet
No passo 5 do fluxo principal a aplicação verifica se o usuário está conectado a internet, se não, o sistema não permitirá o cadastro na aplicação |

## UC03 - Solicitar Crédito

| - | - |
| Descrição | Esta função solicita a liberação da funcionalidade de crédito para o sistema |
| Atores | Usuário |
| Pré-condições | O usuário deverá estar logado no aplicativo |
| Pós-condições | A solicitação deverá ter sido enviada para o sistema para análise |
| Fluxo principal | [FP01] Este fluxo se inicia quando o usuário deseja solicitar o acesso à funcionalidade de crédito:
1. O usuário clica em "Solicitar Crédito"
2. O usuário lê os termos de uso da funcionalidade [UC04]
3. O usuário clica em "Aceitar Termos de Uso" [FE01]
4. O usuário clica em "Confirmar Solicitação" [FE02]
| Fluxo de exceção | [FE01] Se o usuário prosseguir para o passo 4 antes de realizar o passo 3 o sistema retornará uma mensagem de erro
[FE02] O usuário poderá decidir não realizar a solicitação e clicar em "Cancelar" |

## UC04 - Visualizar Regras de Contratação de Crédito

| - | - |
| Descrição | A aplicação mostra ao usuário uma tela com as regras de contratação de crédito|
| Atores | Usuário |
| Pré-condições | O usuário deverá ter clicado em "Solicitar Crédito" |
| Pós-condições | Deverá ter sido aberta uma tela com as regras de contratação de crédito |
| Fluxo principal | Este fluxo se inicia quando o usuário clica no botão de "Solicitar Crédito" [UC01]:
[FP01] O usuário lê as regras de contratação e decide aceitar ou não os termos de uso, podendo ir para o passo 3 em [UC03] ou para [FE02] em [UC03] |

## UC05 - Fornecer Feedback da Solicitação de Crédito

| - | - |
| Descrição | O sistema fornece ao usuário o retorno sobre sua solicitação de crédito [UC03] |
| Atores | Sistema |
| Pré-condições | O usuário deverá ter solicitado a funcionalidade de crédito
O sistema deverá ter analisado o perfil do usuário [UC06] |
| Pós-condições | O usuário deverá ter recebido o retorno de sua solicitação |
| Fluxo principal | [FP01] O sistema envia ao usuário a mensagem sinalizando a aprovação do crédito|
| Fluxo alternativo | [FA01] O sistema envia ao usuário a mensagem sinalizando que seu crédito não foi aprovado e a lista de possíveis motivos para o retorno negativo |

## UC06 - Analisar Perfil do Usuário

| - | - |
| Descrição | O sistema envia a solicitação para que o servidor do banco analise o perfil do usuário com base nos dados que tem disponível |
| Atores | Sistema |
| Pré-condições | O usuário deverá ter solicitado a funcionalidade de crédito [UC03] |
| Pós-condições | O sistema deverá aprovar ou recusar o crédito |
| Fluxo principal | [FP01] O sistema envia a solicitação de análise para o servidor com os dados do usuário [FE01] |
| Fluxo de exceção | Verificação de conexão à internet
A aplicação verifica se o usuário está conectado a internet, se não, o sistema não enviará a solicitação de análise para o servidor |

## UC07 - Ativar Limite de Crédito

| - | - |
| Descrição | Essa funcionalidade permite que o usuário ative o crédito que deseja usar |
| Atores | Usuário |
| Pré-condições | O usuário deverá ter acesso a funcionalidade de crédito |
| Pós-condições | O crédito deverá estar disponível para o uso pelo usuário |
| Fluxo principal | [FP01] Esse fluxo occore quando o usuário deseja ativar o crédito:
1. O usuário seleciona o valor que deseja ativar em [UC08] [FA01]
2. O usário clica em ativar crédito
3. Aparecem as regras e condições de uso
4. O usuário clica em "Confirmar Operação" [FE01] |
| Fluxo alternativo | [FA01] O usuário necessita de um valor de crédito maior do que ele tem disponível no sistema e clica em "Solicitar Aumento de Limite" [UC10] |
| Fluxo de exceção | [FE01] O usuário decide não realizar a operação e clica em "Cancelar" |

## UC08 - Ajustar Limite 

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC09 - Acompanhar Limite

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC10 - Solicitar Aumento de Limite

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC11 - Fornecer Feedback da Solicitação de Aumento

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC12 - Visualizar Saldo da Conta

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC13 - Visualizar Extrato da Conta

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC14 - Pesquisar uma Transação

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC15 - Visualizar Detalhamento da Dívida

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

## UC16 - Solicitar Parcelamento da Dívida

| - | - |
| Descrição | |
| Atores | |
| Pré-condições | |
| Pós-condições | |
| Fluxo principal | |
| Fluxo alternativo | |
| Fluxo de exceção | |

# 5. Visão Lógica

## 5.1. Visão Geral

 A arquitetura utilizada no projeto é a arquitetura Cliente/Servidor, que se baseia na relação de dois módulos, o cliente e o servidor. O servidor será responsável pela manutenção e processamento dos dados, enquanto ao cliente será encarregada a função de fornecer os dados.

O cliente solicitará uma função do aplicativo, por exemplo um pedido de crédito, que será enviada para o servidor, para análise dos dados. Caso a solicitação seja válida, o sistema efetuará o pedido e disponibilizará o crédito para o usuário.

# 6. Restrições
O sistema será desenvolvido para ser utilizado em smartphones com sistema Android. 
Para alcançar tal finalidade será feito usando Node.js com express para o backend da aplicação e o frontend da mesma será utilizado o kotlin.
O modelo pretendido é cliente-servidor, priorizando a experiência do cliente com o sistema.

# 7. Desempenho

A funcionalidade integrada ao aplicativo utilizará um banco de dados, contendo uma grande quantidade de informações dos clientes, devendo realizar múltiplos processos em tempo real, sendo modificações ou adições, para uso sem interrupções do cliente. Esse desempenho também dependerá das especificações do sistema do usuário, no caso seu celular, e a qualidade da internet utilizada.

# 8. Qualidade
Como objetivo de qualidade a aplicação deseja ter um bom sistema de segurança, visto que existem importantes informações de usuários que serão acessadas pela aplicação e que não podem ser visualizados por todos.
O código deverá ser bem estruturado, seguindo as normas de boas práticas para que terceiros, responsáveis por suas eventuais manutenções, consigam trabalhar sem a necessidade consultar os desenvolvedores originais.
