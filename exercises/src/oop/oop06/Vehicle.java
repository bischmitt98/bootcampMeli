package oop.oop06;

public abstract class Vehicle {

    private double velocity, acceleration, turningAngle, weight;
    private int wheels;
    private String licensePlate;
}


//        1. Crie a classe Veículo que possui os seguintes atributos:
//        ● Velocidade
//        ● Aceleração
//        ● Ângulo de giro
//        ● Placa
//        ● Peso
//        ● Rodas
//        2. Modele a classe Corrida que possui os seguintes atributos:
//        ● Distância
//        ● Prêmio em Dólares
//        ● Nome
//        ● Número de veículos permitidos
//
//        ● Lista de veículos
//
//        3. Você deseja adicionar duas novas categorias de Veículos:
//        ● Carros
//        ● Motocicletas.
//
//        Os carros pesam 1.000 quilos e as motocicletas 300 quilos, os carros têm 4
//        rodas e as motocicletas 2.
//
//        4. Uma corrida também tem um conjunto de veículos que participarão dela. Então
//        agora a corrida vai ter a responsabilidade de poder adicionar um veículo,
//        então precisamos definir os seguintes métodos:
//
//public void addCarro(velocidade,aceleracao,anguloGiro,placa);
//public void addMoto(velocidade,aceleracao,anguloGiro,placa);
//
//        Ambos os métodos adicionam um veículo enquanto houver espaço.
//
//        5. Teremos também a possibilidade de eliminar um veículo através de dois
//        métodos:
//public void deleteVeiculo(veiculo);
//public void deleteVeiculoComPlaca(String placa);
//
//        6. Queremos poder definir o vencedor de uma corrida:
//        O vencedor será aquele com o maior valor determinado pela seguinte fórmula:
//        Velocidade * 1⁄2 Aceleração / (anguloRotacao* (peso - quantidadeRodas *
//        100)
//
//        7. As corridas contam ainda com viaturas de salva-vidas que, em caso de
//        emergência, vão e reparam um veículo. Como os carros são muito diferentes
//
//        das motocicletas, existem duas classes diferentes de veículos de resgate. Um
//        desses só sabe ajudar carros e outro só sabe ajudar motos.
//        ● Adicione as aulas
//        ○ Salva-vidas Auto
//        ○ Salva-vidasMoto
//
//        ● Adicione os métodos:
//        ○ SocorristaCarro → public void socorrer(Auto umAuto)
//        ○ SocorristaMoto → public void socorrer(Moto umaMoto)
//
//        Quando um socorrista se aproxima de um carro, ele imprime na tela "Socorro
//        carro" e o número da placa, quando resgata uma motocicleta ele imprime
//        "Socorro moto" e o número da placa na tela.
//        A. Adicione um salva-vidas de carro e um salva-vidas de motocicleta à
//        classe Corrida.
//        B. Acrescente à corrida a responsabilidade de resgatar uma motocicleta e
//        um carro:
//public void socorrerAuto(String placa);
//public void socorrerMoto(String placa);