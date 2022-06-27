package ineheritance;

    public class Product {
        String name;
        Double price;

        public Product(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product: " +
                    "name= " + name +
                    ", price= " + price ;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public double calculate(int quantProducts){
            return this.price * quantProducts;
        }
    }

//  Exercício 2
//
//        Temos que entregar um trabalho para um distribuidor de produtos, então vamos gerar
//        um programa que faça diferentes operações. Teremos duas categorias de produtos
//        diferentes: Perecíveis e Não Perecíveis.
//        A. Crie uma classe Produto que possua os seguintes atributos: String nome e
//        double preco, ela deve definir os métodos getters e setters para seus
//        atributos, um construtor que recebe todos os seus atributos como parâmetro e
//        o método toString(). Crie o método calcular() para o qual vamos passar um
//        parâmetro do tipo int chamado quantidadeDeProdutos; este método tem que
//        multiplicar o preço pela quantidade de produtos passados.


