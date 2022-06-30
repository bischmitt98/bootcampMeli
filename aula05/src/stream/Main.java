package stream;

import stream.Dados;
import stream.Pessoa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Dados.getPessoas();

        //Lista todas as pessoas
        pessoas.stream().forEach(System.out::println);

        //Lista as 10 primeiras pessoas
        pessoas.stream().limit(10).forEach(System.out::println);

        //Lista Pessoas do Brazil
        //List<Pessoa> x = pessoas.stream().filter(pessoa -> pessoa.getPais().equals("Brazil")).toList();
        pessoas.stream().filter(pessoa -> pessoa.getPais().equals("Brazil")).forEach(System.out::println);

        //Filtrar por pais e retornar nome UpperCase
        pessoas.stream()
                .filter(pessoa -> pessoa.getPais().equals("Brazil"))
                .map(pessoa -> pessoa.getNome().toUpperCase())
                .forEach(System.out::println);

        //Retorna Lista Ordem Alfabética com nome e idade de pessoas do Brazil;
        pessoas.stream()
                .filter(pessoa -> pessoa.getPais().equals("Brazil"))
                .sorted((pessoa1, pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()))
                .forEach(pessoa -> System.out.println(pessoa.getNome() + ", " + pessoa.getIdade()));

        //Retorna Lista Ordenada por idade utilizando método na classe Pessoa;
        pessoas.stream()
                .filter(pessoa -> pessoa.getPais().equals("Brazil"))
                .sorted()
                .forEach(pessoa -> System.out.println(pessoa.getNome() + ", " + pessoa.getIdade()));

        //Imprime a media de idade to double
        System.out.println(pessoas.stream().mapToDouble(pessoa -> pessoa.getIdade()).average().orElse(0.0));

    }
}

