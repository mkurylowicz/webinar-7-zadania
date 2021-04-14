package ForLoopExamples;

public class LoopExamples {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        for(int i=0; i<10; i+=3){
            System.out.println(i);
        }

        int[] numbers = new int[7];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = i+1;
        }
        System.out.println(numbers[3]);
    }

    }

