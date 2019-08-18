package introducao_metodos.teste;

import introducao_metodos.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        calculadora.subtracao();
        calculadora.multiplica(2, 6);
        double resultado = calculadora.divisao(20, 0);
        System.out.println(resultado);


        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        //VarArgs
        calculadora.somaVarArgs(1,2,3,4,5);

    }
}
