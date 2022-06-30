package oop.oop08;

public class Clothing {
}

//    SaveTheClothes S.A é uma empresa que pretende implementar um sistema
//        informático de guarda-volumes a nível mundial. O sistema permite que uma pessoa
//        guarde seus pertences no guarda-volumes e depois os retire facilmente, bastando
//        apresentar o número de identificação que recebe quando são guardados.
//        Os pertences são representados no sistema por algo abstrato chamado de Vestuário,
//        que possui marca e modelo, de modo que, caso a pessoa perca o número de
//        identificação, também possa em algum momento retirar seus itens com essa
//        informação. No entanto, a reclamação será modelada em outro momento.
//
//        1. Crie a classe Vestuario que contém as variáveis de marca e modelo, ambas do
//        tipo String.
//        2. Crie a classe GuardaVolume que contém um dicionário como variável e um
//        contador que será usado como identificador. As chaves do dicionário serão
//        Integer e como valor uma lista de peças de vestuário.
//        3. Crie o método público Integer guardarRoupa(List<Vestuario> listaDeVestuario),
//        na classe GuardaVolume, que recebe uma lista de roupas e retorna o número
//        de identificação onde as roupas foram atribuídas, ou seja, a chave do
//        dicionário onde guardamos as roupas.
//        4. Crie o método public void mostrarRoupas(), na classe GuardaVolume que
//        imprime na tela todas as roupas que permanecem no guarda-volume junto
//        com o número que corresponde a elas.
//        5. Crie o método público List<Vestuario> getRoupas(Integer numero) na classe
//        GuardaVolume que retorna a lista de roupas armazenadas sob esse número.
//
//        6. Crie um cenário na classe Main em que alguém salva duas roupas, recebe o
//        código e depois retira suas roupas.