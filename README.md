# Aula 30/07

# Abstração
softwares tem o objetivo de abstrair a complexidade de problemas reais em partes menores para assim criar soluções para estes mesmos problemas, para isso o software utiliza diversos tipos de classes sendo elas: Entidades, repositórios, serviços, controladores, etc.. dividimos o código nestes pedaços justamente para dividir a responsabilidade e facilitar a manutenção do sistema.

# Complexidade
Usamos complexidade neste caso realmente como o maior obstáculo na criação de softwares ela pode trazer consigo:

dificuldades no entendimento da solução desejada;
potenciais bugs pela quantidade de coisas que devem ser levadas em consideração na criação do software;
Desorganização do código do projeto;
Objetos
Para a resolução destes problemas, deve-se pensar em todas as partes deste sistema em objetos seja seus dados(entidade), sua Logica(service), o banco de dados(repository), a interface(controller) e as telas(interface).

# identação
E importante aprender também como escrever seus códigos de forma que fique legível tanto para os outros quanto para você mesmo caso queira refatorar ou realizar a manutenção de seus códigos algumas técnicas utilizadas no java são: cobra e camelo

# Frameworks
Aprender ao menos um framework pode acabar sendo importante para quem deseja trabalhar com desenvolvimento de softwares, pelas facilidades que estas ferramentas pode te trazer futuramente seja na criação de seus próprios projetos quanto na adaptabilidade de frameworks utilizados pelas empresas.

# Aula 06/08

# estrutura de dados
Assim como entender as partes das classes é importante também é importante entender como estas variáveis objetos são guardadas e manuseadas Como em filas, pilhas, arvores, grafos, métodos, laços, etc... 

# flexibilidade de código
Cada código que um desenvolvedor escreve deve trazer consigo a possibilidade de ser modificado e adaptado facilmente sem que o código inteiro quebre. Por exemplo: Separar estas classes utilizando classes de interface que não carregam a logica do sistema consigo mas que podem ser substituídas no código.

getter e setter = encapsulamento =  proteger a informação;

# Coesão
Coesão é um atributo/caracteristca que a gente busca enquanto programa.
Toda classe/metódo deve ser responsável por uma unica funcionalidade, cumprir apenas seu proposito, faz algo decente e bem feito aquilo que foi designado.

# 07/08/2025

entity < dados
repository < JPA spring data
services < lógica(use cases)
controller < api rest

SOLID = programar orientado a objetos do jeito certo

Single Responsbility Principle
Open/Closed Principle
Liskov Substitutiom Principle
Interface Segregation Principle
Dependency Inversion Principle

Principo da responsabilidade unica esse principio é uma aplicação direta da ideia de coesâo, deve existir um único motivo para modificar qualquer classe em um sistema, ou seja, possui um objetivo concreto inalteravel.

Principio da Segregação de Interfaces se eu quero ouvir o click de um botão eu tenho uma interface pra isso, se eu quero capturar o movimento do mouse eu tenho outra inteface para isso

SETA FECHADA E CHEIA VIRA VARIAVEL
SETA VAZIA E CHEIA VIRA HERANÇA
SETA VAZIA PONTILHADA VIRA INTERFACE

DESIGN PARTTERNS são soluções facieies

# 11/08/2025

Principio de inversão de dependencias ao inves de depender de uma classe concreta você depende da interface - uma interface é uma dependecia com abstração - classe cliente é um controlador - serviceimpl implementações concretas  
Controlador > ClienteServ < ClientServiceIMPL
              save(c)
              delete(c)
              
Herança não é solução para todos os problemas

Demeter -> um método pode chamar APENAS os seguintes outros métodos:
          - da sua própria classe
          - de objetos passados como parâmetros (o famoso "()")
          - de objetos criados pelo próprio método
          - de atributos (variáveis) da classe do método

Padrão Aberto/Fechado -> a classe deve estar aberta para extensões e fechada para modificações. Tem como objetivo a construção de classes flexíveis e extensíveis, capazes de se adaptarem a diversos cenários de uso, sem modificar seu código fonte.
Interface não tem código, é um contrato que diz o código que deve ter

# 18/08/2025 Continuar

SOLID - Princiipio de Liskov substituir um filho por outro sem ter percas
static - é carregado primeiro na memória

- DESIGN PATTERNS: São soluções que foram criadas e documentadas em linguagem orientada a objetos para resolver problemas comuns durante o desenvolvimento de sistemas
- Singleton: É uma variável única e global dentro do sistema, nunca poderá ter dois dele. É considerado um anti-pattern. Obs: eviter usar pois pode gerar débito técnico no futuro.

# 21/08/2025 Continuar

Tudo que é estatico é carregado na memória primeiro

# 28/08/2025

- Características da Arquitetura: São os requisitos não funcionais da Engenharia de Software (Disponibilidade, Segurança, Desempenho, Escalabilidade,etc...). É impossível escrever um programa que tenha todas as características arquiteturais, 100% certo, porém é de extrema importância hoje em dia priorizar Segurança do que os outros.

- Decisões da Arquitetura: É o arquiteto que toma as decisões de qual modelo de arquitetura o software vai utilizar, qual linguagem de programação, qual framework, etc...

- Princípios do Design: São as regras básicas para manter a arquitetura funcionando, são os conjuntos de boas práticas. É o SOLID, encapsulamento, baixo acoplamento, coesão e etc...

Quando o arquiteto concluí esses 3 pilares, a estrutura base do software fica completa e pronta.

# 01/09/2025

Espectativas de um arquiteto

Diferença de engnheiro de software para arquiteto, engenheiro de software pode ser qualquer coisa, geralmente o arquiteto tem muita experiencia, é o cara que toma as decisões dificies, ele tem que assegurar conformidade nas decisões, o arquiteto precisa ter noções de negócio, entender lidar com politicas, habilidades interpessoais.

Tomar decisões: Orientar a tecnologia "qual framework usar?" "qual linguagem?" "qual tecnologia?" serve para evitar erros comuns.
Analisar continuamente a arquitetura: O trabalho do arquiteto e atualizar continuamente para não acomular, as linguagens atualmente evoluem muito mais rapido que antigamente, é um trade-off toda vez que se associa com uma bliblioteca você se casa com ela pois é muito dificil alterar qualquer coisa posteriormente.
Manter-se atualizado as ultimas tendendias: O arquiteto precisa se manter atualizado
Assegurar a conformidade das decisões que tomou: Ele precisa ter formas de garantir que o sistema vai ser desenvolvido da forma que ele definiu. (Ex. Analise estática de código) ferramentas que rodam em cima do código que procuram por quebra de padrão.
DevOps: Objetivo de devops é entregar valor mais rapido para o cliente final. Muitas empresas transformam devops em uma cultura, todas as equipes tem que saber as etapas.
       > Planejar
       > Programar
       > Publicar
       > Ferramentas de teste / integração continua
       > Publicar
       > Manter
       > Feedbacks 
       Ciclo infinito de devops.       

# 04/09/2025

Arquiteto vs Desenvolvedor: Um arquiteto é responsavel pela definição do sistema que será usado, padrões e estilos que serão utilizados, linguagem, etc. Ja um desenvolvedor cuidará da parte interna depois da estruturação do projeto, os seus componentes que foram definidos. Nem sempre o que um arquiteto planejar vai funcionar da melhor forma na parte de desenvolvimento e nem sempre as aplicações que utilizarem no desenvolvimento vão estar dentro da definição inicial da arquitetura, para que a arquitetura e desenvolvimento funcionem da melhor forma o ideal é fazer com que a relação entre eles seja bidirecional com comunicação constante para as duas partes se adequem em um consenso.

Arquitetura vs Design: Arquitetura é responsavel pelas caracteristicas do sistema, tanto como o estilo do sistema e as estruturas dos componentes. Design envolve a modeluação das classes utilizadas no sistema, assim como interface do usuario e contato direto com alterações no código-fonte.

Como é a formação do conhecimento de um arquiteto modelo T: Um arquiteto de software deve ter uma boa amplitude técnica, ou seja, conhecer diversas áreas da programação. Porém ao mesmo tempo ele deve ter uma boa profundidade técnica, ou seja, conhecer bem cada área da programação de forma individual. Então, um bom arquiteto de software deve equilibrar seu conhecimento, saber muito e saber bem de cada coisa.

# 08/09/2025

Trade-offs = compensação
Como funcina um mecanismo de tópico: grupo da familia que você e seus parentes estão dentro por uma questão de educação, tem aquela tia as 4 horas da manhã ela manda mensagem de bom dia = isso é um tópico
mensagem no whatsap, notificações no celular todos contem um broker 
Fila: é um mecanismo de comunicação

# Trade-offs
- Pensar como arquiteto é ver os trade-offs em toda solução, técnica ou outra, e analisá-las para determinar qual é a melhor solução
# Tópico
- Um publisher envia uma mensagem para o Tópico (Broker) e todos os subscribers recebem a mesma mensagem. Ou seja, toda vez que alguém publica uma mensagem no tópico, todo mundo que está inscrito, todos os computadores ou sistemas recebem a mesma mensagem.
# Fila
- Um publisher (sender) envia uma mensagem para a Fila (caixinha de correio) e cada subscriber (receivers) deve ir até a Fila para receber a mensagem. A Fila armazena a mensagem e fica disponível para regaste o tempo todo.

# 11/09/2025
Implementação de tópicos

# 15/09/2025
Continuação implementação de tópicos, publisher e subscriber. Design Pattern Builder é a ideia de simplificar a construção de uma objeto que é muito complicado, a gente cria uma classe chamado construtor de casas e nessa classe nós criamos métodos que construem a partes da casa.

# 18/09/2025
Toda função lambda é uma função escrita em poucas linhas, saindo da programação procedural e entrando na programação funcional.

# 02/10/2025
Finalização do Design patterns

# 06/10/2025
# Definição das Características da Arquitetura de Software

As caracteristicas da arquitetura de software são praticamente os requisitos não funcionais de um sistema, mas não recebendo esse nome explicitamente por ter pequenas diferenciações que poderiam impactar a compreenção clara do termo caracteristicas. Seguindo três importates critérios para entrar na definição de Caracteristicas da Arquitetura de Software, sendo eles: é essencialmente considerado fora de dominio do sofware, exige decisões especiais na hora de projetar o sistema, essas características são fundamentais para que o sistema tenha sucesso.

Além disso, as características da arquitetura podem ser:
- Implícitas: São necessárias, mas não aparecem claramente nos requisitos. Exemplos incluem disponibilidade e segurança. Embora muitas vezes não sejam explicitamente mencionadas, são fundamentais para o funcionamento do sistema.
- Explícitas: São características que estão claramente descritas nos requisitos, como a escalabilidade ou desempenho de uma aplicação.

Tipos de Características da Arquitetura:
Operacionais: Relacionadas ao funcionamento do sistema, como:
- Disponibilidade
- Desempenho
- Segurança
- Escalabilidade
Estruturais: Envolvem a organização do código e sua manutenção, como:
- Modularidade
- Reutilização
- Portabilidade
Transversais: Características que afetam diferentes áreas do sistema, como:
- Acessibilidade
- Autenticação
- Privacidade

09/10/2025
Circuit Breaker Pattern
O Circuit Breaker é tipo um “disjuntor” que a gente coloca quando um serviço externo tá dando muito problema. Ele evita que o sistema fique tentando chamar um serviço que já tá falhando sem parar, porque isso gasta um monte de recurso e pode derrubar tudo.
Ele tem 3 estados:

- Closed (fechado): Tudo normal, deixa passar as requisições. toda vez que dá erro ele conta. se passar do limite de erros em pouco tempo, ele “desarma” e vira Open.
- Open (aberto): Ele bloqueia tudo na hora e já joga uma exceção pra aplicação, nem tenta chamar o serviço. fica assim por um tempo (timeout).
- Half-Open (meio aberto): Depois do timeout ele deixa passar só umas poucas requisições de teste. se der certo, volta pro Closed e zera o contador. se der errado, volta pro Open e começa o timeout de novo.


# Outros conceitos importantes:
- Arquitetura MVC - Model, View, Control
- API - Application Programming Interface
- POO (básico) - Objetos contem informações (variáveis/atributos). Contem as ações = funções (métodos). Um objeto pode conter outros objetos (ManyToOne/OneToMany e etc). Em - POO é possível representar qualquer coisa do mundo real
- Desacoplamento - Quando o código é mais fácil de trocar/substituir.
- Classe - guardam o estado (variáveis que guardam informações (nome,email,telefone,etc)), e o comportamento (métodos e funções)
- Getter e Setter - serve para encapsular uma informação e consequentemente protegê-la
- entity < dados
- repository < JPA spring data
- services < lógica(user cases)
- controller < api rest
- SETA FECHADA E LINHA CHEIA VIRA VARIAVEL
- SETA VAZIA E LINHA CHEIA VIRA HERANÇA
- SETA VAZIA E LINHA PONTILHADA VIRA INTERFACE
- Interface não tem código, é um contrato que diz o código que deve ter.
- Static - É carregado por primeiro, antes de todas as outras coisa na memória.


