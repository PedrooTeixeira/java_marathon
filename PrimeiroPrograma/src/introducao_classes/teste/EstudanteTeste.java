package introducao_classes.teste;

import introducao_classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args){
        Estudante estudante = new Estudante();

        estudante.nome = "Pedro";
        estudante.matricula =  "21805080";
        estudante.idade = 21;

        System.out.println(estudante.nome);
        System.out.println(estudante.matricula);
        System.out.println(estudante.idade);
    }
}
