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

//        Exerc??cio 1
//
//        Crie uma classe Pessoa que ter?? os seguintes atributos: nome, idade, ID (neste caso vamos
//        represent??-la como uma string de caracteres), peso e altura. Que tipo de dado voc?? atribuiria
//        ??s vari??veis de inst??ncia? Como seria a estrutura b??sica da sua classe?
//
//        Exerc??cio 2
//
//        Vamos criar diferentes construtores na classe Pessoa, um sem par??metros, e o outro deve
//        receber nome, idade e ID como par??metros; e por fim criaremos um terceiro construtor que
//        recebe como par??metro todos os atributos da classe.
//
//        Exerc??cio 3
//
//        Crie uma nova classe chamada Main, onde voc?? ir?? chamar o m??todo main como ensinamos
//        anteriormente. Isso nos permitir?? executar o nosso programa.
//
//        Exerc??cio 4
//
//        Na classe Main que acabamos de criar, dentro do m??todo main() pedimos para voc?? criar um
//        objeto do tipo Pessoa para cada construtor que definimos na classe, lembre-se de colocar um
//        nome significativo para as vari??veis para atribuir cada objeto. A seguir, vamos criar outro
//        objeto do tipo Pessoa e vamos constru??-lo passando apenas um valor para o nome e outro
//        para a idade no construtor. Isto ?? possivel? O que acontece se tentarmos fazer isso?
//
//        Exerc??cio 5
//
//        Na classe Pessoa vamos implementar os seguintes m??todos: calcularIMC(), a f??rmula para
//        calcul??-lo ??: peso/(altura^2) - (peso expresso em kg e altura em metros). Se este c??lculo
//        retornar um valor menor que 20, a fun????o deve retornar -1, se retornar um n??mero entre 20 e
//        25, o m??todo deve retornar 0, por fim, se retornar um n??mero maior que 25 deve retornar 1.
//        Uma vez que o m??todo anterior foi criado, vamos adicionar o m??todo ehMaiorIdade() que
//        deve retornar um valor booleano, levando em considera????o que a maioridade ser??
//        considerada, a partir de 18 anos. Por fim, adicione um m??todo toString() que retornar?? todas
//        as informa????es da pessoa.
//        Lembre-se, voc?? pode usar os m??todos da classe java.lang.Math para calcular a pot??ncia.
//
//        Exerc??cio 6
//        A partir da classe Main vamos calcular o IMC da ??ltima pessoa que criamos (aquela que
//        criamos corretamente atrav??s do construtor que recebe todos os atributos como par??metro).
//        Tamb??m descobriremos se a pessoa ?? maior de idade ou n??o; Observe que em ambos os
//        casos, dependendo dos resultados retornados pelos m??todos, voc?? deve imprimir uma
//        mensagem correspondente ao usu??rio. Finalmente, queremos mostrar todos os dados dessa
//        pessoa imprimindo essas informa????es pelo console. O formato em que voc?? vai exibir os
//        dados e as mensagens fica a seu crit??rio, mas deve ser leg??vel e descritivo para quem v?? a
//        sa??da do programa.
//        Refer??ncias:
//
//        ??ndice de massa corporal (IMC) Nivel de peso
//        Menor que 20 Abaixo do peso
//        Entre 20 e 25 Peso Saud??vel
//        Maior que 25 Sobrepeso