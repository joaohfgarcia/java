BUILDER
Vantagens:
• Permite variar a representação interna do objeto que ele cria; 
• Oculta os detalhes de como o produto é montado; 
• O Builder específico é independente do resto do programa; 
• Maior controle sobre o produto final. 
Desvantagens:
• Código de maior complexidade;
• Múltiplas classes novas;

FACTORY METHOD
Sempre que houver muitas diferentes classes a serem instanciadas;
Vantagens:
• Instanciação indireta;
• Fácil adição de novas classes;
• Desacoplamento;
Desvantagens:
• Uma classe concreta criadora para cada item produzido;
• Nem sempre o desacoplamento é garantido;
• Factory Method com aninhamento de ifs ou um switch gigante

FACADE
Vantagens:
• Um ponto de entrada;
• Fácil saber quais são e onde estão as funcionalidades;
• Se a funcionalidade do subsistema mudar, apenas uma classe muda;
Desvantagens:
• Facade é altamente acoplado ao subsistema;
• Facade deve ser completo e sem defeitos;

STRATEGY
Vantagens:
• Simples;
• Alto desacoplamento;
• Intercâmbio de Algoritmos;
Desvantagens:
• Precisa construir um objeto de uma classe concreta;
• Nem sempre é a solução para tudo