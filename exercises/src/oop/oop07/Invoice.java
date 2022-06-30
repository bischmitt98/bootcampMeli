package oop.oop07;

public class Invoice {
}

//Supermercado “O econômico”
//        Um supermercado pretende implementar um sistema que lhe permita armazenar os
//        dados dos seus clientes e as diferentes faturas das compras que eles efetuam. Para
//        isso, necessita poder efetuar operações de criação, consulta, eliminação ou
//        atualização de dados de todos os clientes e respectivas faturas associadas.
//        Para cada cliente, são registrados: ID, nome e sobrenome. Por outro lado, as faturas
//        geradas quando um cliente faz uma compra contêm um cliente, uma lista de itens e
//        o total da compra. O código, nome, quantidade comprada e custo unitário são salvos
//        para cada item ou produto.
//        Dada a complexidade do sistema, o Gerente de Projeto decidiu realizá-lo em duas
//        sprints, onde cada uma delas terá como objetivo a entrega final de uma série de
//        requisitos.
//
//        Parte I
//        Precisa-se:
//        ● Crie as classes do programa, que são: Cliente, Item, Fatura.
//        ● Crie 3 clientes e salve-os em uma coleção.
//        ● Percorra a coleção de clientes e exiba os dados de cada um deles na
//        tela.
//        ● Exclua um dos clientes da lista e volte para consultar e imprimir todos
//        os clientes restantes.
//        ● Solicite o número de identificação de um cliente pelo teclado para
//        procurá-lo. Se o cliente estiver na lista, mostre seus dados, caso
//        contrário, mostre uma mensagem informando a situação.
//
//        Após a primeira entrega bem-sucedida, o Gerente de Projeto junto com um analista
//        funcional coletou novos requisitos para realizar uma segunda parte do
//        desenvolvimento em um novo sprint. Estes são citados abaixo:
//
//        Parte II
//        ● Crie uma nova fatura.
//        ● Antes de querer adicionar uma fatura a uma coleção de faturas, tenha
//        em mente que:
//        ○ Será necessário validar se o cliente associado à fatura está
//        cadastrado na cobrança do cliente. Se não, ele deve ser criado.
//        ○ Será necessário criar uma lista de itens e associá-la à fatura
//        criada.
//        ○ O campo total da fatura é um campo calculado, portanto, para
//        atribuir esse valor devemos percorrer a lista de itens e realizar as
//        operações matemáticas necessárias para obter o total.
//
//        Bônus
//        ● Para otimizar o código, é necessário criar uma interface "CRUD" que
//        seja capaz de conter, por meio de genéricos, todos os métodos
//        necessários para realizar adições, exclusões, modificações e consultas.
//        ● Crie ou use as classes correspondentes que sejam capazes de
//        implementar os métodos da interface criada no ponto anterior.
//        ● Modifique o método main para que, em vez de fazer todo o código
//        sequencialmente, ele possa ser modularizado chamando métodos.