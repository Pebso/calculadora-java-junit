package poo;



import org.junit.Test;

public class CalculosTeste {
    @Test
    public void testeSoma(){
       Calculos numeros = new Calculos();
       double soma = numeros.soma(10, 15);
       System.out.println(soma);
    }
    @Test
    public void testeSubtracao(){
        Calculos numeros = new Calculos();
        double subtracao = numeros.subtracao(10, 5);
        System.out.println(subtracao);
        
    }
    @Test
    public void testemultiplicacao(){
        Calculos numeros = new Calculos();
        double multiplicacao = numeros.multiplicacao(2, 5);
        System.out.println(multiplicacao);
    }
    @Test
    public void testeDivisao(){
        Calculos numeros = new Calculos();
        double divisao = numeros.divisao(10, 2);
        System.out.println(divisao);
        
    }
    @Test
    public void testePotencia(){
        Calculos numeros = new Calculos();
        double potencia = numeros.potencia(10, 2);
        System.out.println(potencia);
    }

    
}
