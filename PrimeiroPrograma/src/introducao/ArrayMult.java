package introducao;

public class ArrayMult {
    public static void main(String[] args){
        int[][] dias = new int[2][2];

        dias[0][0] = 10;
        dias[0][1] = 20;

        dias[1][0] = 30;
        dias[1][1] = 40;

        for(int i = 0; i<dias.length; i++){
            System.out.println(dias[i]);
            for(int x = 0;x<dias[1].length; x++){
                System.out.println(dias[i][x]);
            }
        }
        System.out.println("-----------------------------------");
        //ForEach
        for(int[] valor: dias){
            for(int dia: valor){
                System.out.println(dia);

            }
        }

    }
}
