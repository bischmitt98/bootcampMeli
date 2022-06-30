package oop.oop02;

public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int sum = b / a;
        }catch (ArithmeticException ex){
            throw new IllegalArgumentException("There was a problem");
        }finally {
            System.out.println("End of program");
        }
    }

}
//Exercício 1
//
//        A. Crie uma classe PraticaExcecoes e defina os atributos a = 0 e b = 300 do tipo
//        int. Calcule a razão de b/a. Controle a exceção lançada indicando a mensagem
//        “Ocorreu um erro”. No final do programa deve sempre indicar a mensagem
//        “Programa finalizado”.
//        B. Modifique o programa acima para que, quando ocorrer o erro, em vez de
//        imprimir a mensagem “Ocorreu um erro” no console, ele a lance como uma
//        exceção IllegalArgumentException com a mensagem “Não pode ser dividido
//        por zero”.