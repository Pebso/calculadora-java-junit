package poo;


import java.util.HashMap;
import java.util.Scanner;
// * Hashmap possibilita trabalhar com mapeamento de objetos no esquema chave/valor, ou seja, informada a chave, resgato o valor



public class Calculadora {
    
    
    public  static void main(String[] args) {
        Calculos n = new Calculos();
boolean continua = true;

Scanner input= new Scanner(System.in);

while(continua){
    double x=0;
    double y=0;
    int operacao=0;
    System.out.println("digite a operação que deseja:"
    +                 "\n1 para soma "
    +                 "\n2 para ssubtração "
    +                 "\n3 para multiplicação "
    +                 "\n4 para divisãao "
    +                 "\n5 para potencialização "
    +                 "\n ou 0 para finalizar "
    );
operacao = input.nextInt();

if(operacao == 0){
    continua = false;
    System.out.println("Aplicação finalizada ");
    return; 
    
}
System.out.println("informe o valor do primeiro numero");
x = input.nextDouble();
System.out.println("informe o valor do segundo numero");
y = input.nextDouble();

switch (operacao) {
    case 1:
        imprimeCalculadora(operacao, n.soma(x, y), x, y);
        break;
  case 2:
        imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
        break;
  case 3:
        imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
        break;
  case 4:
        imprimeCalculadora(operacao, n.divisao(x, y), x, y);
        break;
  case 5:
        imprimeCalculadora(operacao, n.potencia(x, y), x, y);
        break;

    
}
input.close(); //retirar para rodar todas as operaações.
}



    }
    static void imprimeCalculadora(int operacao, double resultado, double x, double y){
        HashMap <Integer, String> mapeiaOperacao = new HashMap<>();
        mapeiaOperacao.put(1, " somando ");
        mapeiaOperacao.put(2, " subtraido ");
        mapeiaOperacao.put(3, " multiplicado ");
        mapeiaOperacao.put(4, " dividido ");
        mapeiaOperacao.put(5, " potenciado ");

        System.out.println("\n O resultado de " + x + mapeiaOperacao.get(operacao) +" por " + y +" é igual a " + resultado + "\n");

    }
    
}
