Padroes de Projeto

1) Criacionais -> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
2) Estruturais -> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.
3) Comportamentais -> Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

* Comportamentais

10.Visitor

O que é:
O Visitor é um padrão de projeto comportamental que permite adicionar novos comportamentos à hierarquia de classes existente sem alterar nenhum código existente.

Aplicabilidade:
Utilize o Visitor quando você precisa fazer uma operação em todos os elementos de uma estrutura de objetos complexa (por exemplo, uma árvore de objetos).
Utilize o Visitor para limpar a lógica de negócio de comportamentos auxiliares.
Utilize o padrão quando um comportamento faz sentido apenas dentro de algumas classes de uma uma hierarquia de classe, mas não em outras.


Exempos de utilizacao:
javax.lang.model.element.AnnotationValue e AnnotationValueVisitor
javax.lang.model.element.Element e ElementVisitor
javax.lang.model.type.TypeMirror e TypeVisitor