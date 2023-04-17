# calculadora-java-junit
Bom, na classe Calculos eu usei os metodos get e set, para me retornar o resultado dos calculos pedidos, esta classe esta funcionando como se fosse um "controller".

Já a classe Calculadora ficou como uma "view" para interação com o usuario. Usei o metodo main, fiz uma instancia de numero 'n', usei o metodo boolean para controlar meu laço de repetiçao while, que ai enquanto boolean continua for true ele segue executando, fiz uma "gambiarra" dando um .close so pra eu fazer uns testes se ele ia executar 1 por 1 e fechar, retirando o .close ele segue no while.

Usei tambem a estrutura de dados hashmap, que me possibilita a partir de uma chave me buscar um resultado, e assim fazendo com que meu comando switch case funcione, nele eu chamo meu imprimeCalculadora, passo operacao e chamo um dos metodos da classe Calculos.

Na classe CalculosTeste, é onde eu testo todos os calculos através do framework Junit 5, todos os testes aprovados.


