package example03;

public class Exemple03 {
    public static void main(String[] args) {
        int cont;


        cont = 0;// 1.inicialização

        while (cont < 5) { // 2.condição
            System.out.println("Contagem");
            // cont = cont + 1;
            // cont += 1;
            cont++; // 3. passo
        }

        for(cont = 0; cont < 5; cont++){
            System.out.println("Contagem");
        }

        for(int i = 10, a = 0; i < 5; i--){
            System.out.println("Contagem");
        }

        for(int i = 10; i < 5; i--){
            System.out.println("Contagem");
        }
    }
}