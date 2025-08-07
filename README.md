# Aula 30/07

# Abstração
softwares tem o objetivo de abstrair a complexidade de problemas reais em partes menores para assim criar soluções para estes mesmos problemas, para isso o software utiliza diversos tipos de classes sendo elas: Entidades, repositórios, serviços, controladores, etc.. dividimos o código nestes pedaços justamente para dividir a responsabilidade e facilitar a manutenção do sistema.

# complexidade
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

Principio da Segregação de Interfaces se eu quero ouvir o click de um botão eu tenho uma interface pra isso, se eu quero capturar o movimento do mouse eu tenho outra inteface para iso

SETA FECHADA E CHEIA VIRA VARIAVEL
SETA VAZIA E CHEIA VIRA HERANÇA
SETA VAZIA PONTILHADA VIRA INTERFACE

DESIGN PARTTERNS são soluções facieies