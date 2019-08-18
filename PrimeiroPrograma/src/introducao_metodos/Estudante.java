package introducao_metodos;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if(notas == null){
            return;
        }
        for(double nota: notas){
            System.out.println("Notas: "+nota);
        }
    }

    public void media(){
        if(notas == null){
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for(double nota: notas){
            media += nota;
        }
        media = media / notas.length;
        if(media > 6){
            System.out.println("A média é "+media+" e voce foi aprovado");
        }else{
            System.out.println("A média é "+media+" e voce foi reprovado");
        }
    }

}
