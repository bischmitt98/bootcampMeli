package oop.oop02;

public class NonPerishable extends Product{
    String type;

    public NonPerishable(String name, Double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return "NonPerishable: " +
                super.toString() +
                "type= " + type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

//        C. Crie a classe NaoPereciveis, ela terá um atributo chamado tipo que será uma
//        String. Crie os setters, getters, construtor e método toString(); nesta classe o
//        método calcular() fará exatamente o mesmo que na classe Produto.