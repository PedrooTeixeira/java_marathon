package introducao_metodos.teste;

import introducao_metodos.Estudante;

public class EstudanteTeste {
    public static void main(String[] args){
        Estudante aluno1 = new Estudante();

        aluno1.nome = "Pedro";
        aluno1.idade = 21;
//        aluno1.notas = new double[]{8,5,6};
        aluno1.imprime();
        aluno1.media();
    }
}
