package introducao;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int dia = t.nextInt();
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }

        switch (dia){
            case 1:
            case 6:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
