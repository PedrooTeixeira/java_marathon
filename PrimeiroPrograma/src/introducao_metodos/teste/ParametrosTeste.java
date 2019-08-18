package introducao_metodos.teste;

import introducao_metodos.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int n1 = 10;
        int n2 = 20;
        calculadora.altera(n1, n2);
        System.out.println("dentro do teste");
        System.out.println("n1 "+n1);
        System.out.println("n2 "+n2);
    }
}
