package example04;

public class Example04 {
    public static void main(String[] args) {
//    int num[] = new int [5]; // vetor que armazena numeros inteiros cujo tamanho é 5
//    int num [];
//    int a = 5;
//    num = new int [a];
//
//      for(int i = 0; i < 5; i++){ // i = index
//          num[i] = i;
//          System.out.print(num[i] + " ");
//	  }

        final int TAMANHO = 5;
        int num[] = new int[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) { // i = index
            num[i] = i;
            System.out.print(num[i] + " ");

        }
    }
}