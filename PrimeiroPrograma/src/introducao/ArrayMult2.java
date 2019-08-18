package introducao;

public class ArrayMult2 {
    public static void main(String[] args){
        int[][] dias = new int[3][];

        dias[0] = new int[]{1,2,3,4};
        dias[1] = new int[]{2,4,6,8};
        dias[2] = new int[]{10,20,30,40};


        for(int[] valor: dias){
            System.out.println(valor);
            for(int ref: valor){
                System.out.println(ref);

            }
        }
    }
}
