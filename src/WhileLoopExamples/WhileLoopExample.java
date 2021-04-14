package WhileLoopExamples;

public class WhileLoopExample {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println(i + 1);
            i += 2;

            int[] numbers = {20, 8, 6, 5};
            printTableElements(numbers);
        }
    }
        public static void printTableElements (int[] tab){
            int i = 0;
            while (i<tab.length){
                System.out.println(tab[i]);
                i++;
            }
        }
    }

