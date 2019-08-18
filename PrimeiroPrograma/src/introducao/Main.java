package introducao;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("didgite o tamanho do vetor: ");
        int valor = teclado.nextInt();

        int[] vetor = new int[valor];

        int a = 0;
        for(int c = 0; c<vetor.length; c++){
            System.out.println("Digite o valor do vetor na posição "+ a);
            vetor[c] = teclado.nextInt();
            a++;
        }

        for(int x: vetor){
            System.out.println(x);
        }

    }
}
