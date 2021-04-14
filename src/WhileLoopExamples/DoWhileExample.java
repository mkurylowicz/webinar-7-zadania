package WhileLoopExamples;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 5;

        do{
            System.out.println("Twój numer to " + i);
            i++;
        } while(i<5);

        int j = 4;
        while(i<5){
            System.out.println("WHILE - Twój numer to " +j );
            j++;
        }
    }
}
