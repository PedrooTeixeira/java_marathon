package introducao;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {

        double salario = 3.500;
        double totalImposto = 0;
        if(salario < 1000){
            totalImposto = salario * 0.05;
        }else if(salario >=2000 && salario <2000){
            totalImposto = salario * 0.10;
        }

    }
}
