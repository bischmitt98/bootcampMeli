package oop.oop02;

public class Distributor {
    public static void main(String[] args) {
        Product products[] = {
                new Perishable("Meat", 38.5, 2),
                new Perishable("Cheese", 35, 1),
                new NonPerishable("Sponge", 0.90, "Cleaning"  ),
                new NonPerishable("Laptop", 2500.00, "Electronics")

        };

        for (int i = 0; i < products.length; i++){
            double result = products[i].calculate(5);
            System.out.println("Products: " + products[i].getName() + ", final price: " + result);
        }
    }
}

//        D. Crie uma classe executável chamada Distribuidora onde você vai criar um
//        array de produtos, imprimir o preço total ao vender 5 produtos de cada tipo.
//        Crie os elementos do array com os dados que você desejar.