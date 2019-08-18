package introducao_metodos.teste;

import introducao_metodos.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.nome = "Pedro";
        prof.rg = "1223.123";
        prof.cpf = "090.090.090-32";
        prof.matricula = "21805080";

        Professor prof2 = new Professor();

        prof2.nome = "Paulo";
        prof2.rg = "1223.123";
        prof2.cpf = "23.450.757-66";
        prof2.matricula = "24252435";

        prof.imprime();
        System.out.println("---------------------");
        prof2.imprime();


    }
}
