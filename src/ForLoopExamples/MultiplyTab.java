package ForLoopExamples;

public class MultiplyTab {
    public static void main(String[] args) {
        multiplyTab();
    }

    public static void multiplyTab(){
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.printf(i*j + " ");
            }
            System.out.printf("\n");
        }

        }

}
