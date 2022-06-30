package oop.oop02;

public class Perishable extends Product {
    int expirationTime;

    public Perishable(String name, double price, int expirationTime) {
        super(name, price);
        this.expirationTime = expirationTime;
    }

    @Override
    public String toString() {
        return "Perishable: " +
                super.toString() +
                "expirationTime=" + expirationTime;
    }


    @Override
    public double calculate(int quantProducts) {
        double finalPrice = super.calculate(quantProducts);
        if(expirationTime >= 1){
            return finalPrice / 4;
        }else if(expirationTime == 2){
            return finalPrice / 3;
        }else{
            return finalPrice / 2;
        }
    }

    public int getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(int expirationTime) {
        this.expirationTime = expirationTime;
    }
}

//        B. Crie a classe Pereciveis, que terá um atributo chamado diasParaVencer do tipo
//        int, igual a classe produto, defina setters, getters, um construtor que recebe
//        todos os atributos por parâmetro e o método toString(). Essa classe deve
//        herdar da classe Produto e sobrescrever o método calcular(), que deve fazer o
//        mesmo que a classe Produto (multiplicar o preço pelo número de produtos) e,
//        adicionalmente, reduzir o preço de acordo com o diasParaVencer:
//        a. Se faltar um (1) dia para expirar, o preço final será reduzido em 4 vezes.
//
//        b. Se faltarem dois (2) dias para expirar, o preço final será reduzido em 3
//        vezes.
//        c. Se faltarem 3 dias (3) para expirar, metade do seu preço final será
//        reduzido.
