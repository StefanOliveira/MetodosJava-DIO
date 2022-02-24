package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(15, 20);
        Calculadora.multiplicacao(25, 30);
        Calculadora.subtracao(100, 50);
        Calculadora.divisao(15,3);

        // Mensagem
        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        // Emprestimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}
