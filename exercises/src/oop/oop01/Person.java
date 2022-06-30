package oop.oop01;

    public class Person {
        private String name;
        private String id;
        private int age;
        private double weight;
        private double height;

        public Person() {
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public Person(String name, String id, int age, double weight, double height) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        @Override
        public String toString() {
            return  "Name= " + name +
                    ", Id= " + id +
                    ", Age= " + age +
                    ", Weight= " + weight +
                    ", Height= " + height;
        }

    public int BMI(Person person){
            double bmi = person.getWeight()/(Math.pow(person.getHeight(), 2));
            if(bmi < 20){
                return -1;
            }else if(bmi > 20 && bmi < 25){
                return 0;
            }else{
                return 1;
            }
    }

    public boolean isOfAge(Person person){
            if(person.getAge() > 18){
                return true;
            }else{
                return false;
            }
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }

//        Exercício 1
//
//        Crie uma classe Pessoa que terá os seguintes atributos: nome, idade, ID (neste caso vamos
//        representá-la como uma string de caracteres), peso e altura. Que tipo de dado você atribuiria
//        às variáveis de instância? Como seria a estrutura básica da sua classe?
//
//        Exercício 2
//
//        Vamos criar diferentes construtores na classe Pessoa, um sem parâmetros, e o outro deve
//        receber nome, idade e ID como parâmetros; e por fim criaremos um terceiro construtor que
//        recebe como parâmetro todos os atributos da classe.
//
//        Exercício 3
//
//        Crie uma nova classe chamada Main, onde você irá chamar o método main como ensinamos
//        anteriormente. Isso nos permitirá executar o nosso programa.
//
//        Exercício 4
//
//        Na classe Main que acabamos de criar, dentro do método main() pedimos para você criar um
//        objeto do tipo Pessoa para cada construtor que definimos na classe, lembre-se de colocar um
//        nome significativo para as variáveis para atribuir cada objeto. A seguir, vamos criar outro
//        objeto do tipo Pessoa e vamos construí-lo passando apenas um valor para o nome e outro
//        para a idade no construtor. Isto é possivel? O que acontece se tentarmos fazer isso?
//
//        Exercício 5
//
//        Na classe Pessoa vamos implementar os seguintes métodos: calcularIMC(), a fórmula para
//        calculá-lo é: peso/(altura^2) - (peso expresso em kg e altura em metros). Se este cálculo
//        retornar um valor menor que 20, a função deve retornar -1, se retornar um número entre 20 e
//        25, o método deve retornar 0, por fim, se retornar um número maior que 25 deve retornar 1.
//        Uma vez que o método anterior foi criado, vamos adicionar o método ehMaiorIdade() que
//        deve retornar um valor booleano, levando em consideração que a maioridade será
//        considerada, a partir de 18 anos. Por fim, adicione um método toString() que retornará todas
//        as informações da pessoa.
//        Lembre-se, você pode usar os métodos da classe java.lang.Math para calcular a potência.
//
//        Exercício 6
//        A partir da classe Main vamos calcular o IMC da última pessoa que criamos (aquela que
//        criamos corretamente através do construtor que recebe todos os atributos como parâmetro).
//        Também descobriremos se a pessoa é maior de idade ou não; Observe que em ambos os
//        casos, dependendo dos resultados retornados pelos métodos, você deve imprimir uma
//        mensagem correspondente ao usuário. Finalmente, queremos mostrar todos os dados dessa
//        pessoa imprimindo essas informações pelo console. O formato em que você vai exibir os
//        dados e as mensagens fica a seu critério, mas deve ser legível e descritivo para quem vê a
//        saída do programa.
//        Referências:
//
//        Índice de massa corporal (IMC) Nivel de peso
//        Menor que 20 Abaixo do peso
//        Entre 20 e 25 Peso Saudável
//        Maior que 25 Sobrepeso