package introducao_classes.teste;

import introducao_classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Pedro";
        prof.rg = "3223.456";
        prof.cpf = "012.654.253-54";

        Professor prof2 = new Professor();

        prof2.nome = "Paulo";
        prof2.rg = "3223.434";
        prof2.cpf = "045.623.567-34";

        prof = prof2;

        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
        System.out.println(prof2.cpf);
        System.out.println("-------------------------");
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);
    }
}
