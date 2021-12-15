package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args){
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(5, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(3, 5);
        Calculadora.divisao(20, 3);


        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(0);

        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 5);
    }
}
