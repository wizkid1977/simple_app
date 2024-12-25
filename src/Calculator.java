public class Calculator {

    /**
     * This method adds two numbers and prints the result
     * @param a first number
     * @param b second number
     */
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);

    }


    /**
     * This method adds all adjacent numbers in a given array
     * @param numbers the array of numbers
     */
    public static void addLotsOfNumbers(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            addNumbers(numbers[i], numbers[i+1]);
            System.out.println("bla");
        }
    }

    public static void divideNumbers(int a, int b) {
        System.out.println("Division: " + (a/b));
    }

    public static void main(String[] args) {

    }
}
