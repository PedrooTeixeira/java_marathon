package introducao_metodos;

public class Calculadora {

    public void soma() {
        System.out.println(5 + 5);
    }

    public void subtracao() {
        System.out.println(5 - 3);
    }

    public void multiplica(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divisao(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        }
        return 0;
    }

    public void altera(int n1, int n2){
        n1 = 30;
        n1 = 40;
        System.out.println("n1 "+n1);
        System.out.println("n2 "+n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
