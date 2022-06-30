package oop.oop03.models;

    public abstract class Animal {

        public abstract void emitSound();
    }

//        Exercício 3
//        Solicita-se a criação de uma classe abstrata chamada Animal, da qual derivam 3
//        animais: Cachorro, Gato e Vaca. Os 3 animais são capazes de “emitir sons”, para isso
//        será necessário implementar um método que permita visualizar no console o som
//        que cada animal emite. Por exemplo, no caso do cachorro “Auau”, do gato “miau” e
//        da vaca “mu”.
//        A partir disso, levando em consideração os gostos alimentares de cada animal (gato e
//        cachorro são considerados carnívoros e a vaca herbívora), incluir as interfaces
//        necessárias para contemplar os métodos comerCarne ou comerPasto.
//        Feito isso, realize a criação de diferentes animais e a invocação de suas respectivas
//        implementações de métodos no Main.
//        Como proposta extra, sugere-se criar um método para comerAnimal onde, a partir da
//        passagem de um objeto de qualquer tipo de animal como parâmetro, chama o
//        método comer de acordo com o referido animal.