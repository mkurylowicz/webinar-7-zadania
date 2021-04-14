package HomeWork;

public class Multiplication {
    public static void main(String[] args)
    {

        int[][] result = new int[10][10] ;

        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                result[j][i]= (i+1) * (j+1);
                System.out.print(" " + result[j][i] + " ");
            }
            System.out.println();
        }
    }
}
