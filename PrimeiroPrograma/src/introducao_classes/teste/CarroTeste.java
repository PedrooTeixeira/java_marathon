package introducao_classes.teste;

import introducao_classes.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.modelo = "Uno";
        carro.placa = "PAI-8304";
        carro.velocidadeMaxima = 200f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
