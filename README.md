# Getulio Vargas Zoo
 implementar um sistema para gerenciar o zoo Getulio Vargas em Salvador/BA, utilizando os conceitos de programação orientada a objetos, incluindo polimorfismo, interfaces, classes abstratas e herança múltipla. O objetivo é criar uma estrutura que permita a adição de diferentes tipos de animais, cada um com suas características e comportamentos. 

Requisitos:
1. Classe Abstrata Animal: Crie uma classe abstrata chamada Animal que contenha
as seguintes propriedades e métodos:
o Propriedade nome (string)
o Propriedade idade (int)
o Método abstrato fazerSom(), que deverá ser implementado por todas as
subclasses.


3. Interface ComportamentoAlimentar: Defina uma interface chamada
ComportamentoAlimentar que deve conter o método alimentar(). Este método será
responsável por definir como cada animal se alimenta.


5. Classes Concretas:
o Crie pelo menos duas classes concretas que herdem da classe Animal,
como Leão e Elefante, implementando o método fazerSom() de forma
específica para cada animal. Ambas as classes devem implementar a
interface ComportamentoAlimentar.

o Além disso, crie uma classe Ave que também herde da classe Animal e
implemente o método fazerSom(). Esta classe deve ter uma herança
múltipla, ou seja, deve implementar outra interface chamada
ComportamentoVoo, que possui o método voar().


4. Polimorfismo:
o Implemente uma função que receba uma lista de Animal e invoque o método
fazerSom() de cada um. Demonstre como o polimorfismo permite que o
método correto seja chamado, dependendo do tipo específico de cada
animal.

5. Teste e Demonstração:
Crie uma classe Zoo que contenha uma lista de animais. Adicione diversos
animais à lista e imprima os sons que eles fazem, bem como como se
alimentam. Mostre que a classe Ave também pode voar se apropriado.

Entrega: A entrega deve incluir o código-fonte da implementação. Você também deve
incluir exemplos de saída do programa que demonstrem o funcionamento correto do
sistema.
 Critérios de Avaliação:
 Correta implementação dos conceitos de POO (polimorfismo, interfaces, classes
abstratas e herança múltipla).
 Clareza e organização do código.
 Documentação explicativa que descreva a lógica implementada.
 Funcionalidade e saída do programa que atenda aos requisitos especificados. 


