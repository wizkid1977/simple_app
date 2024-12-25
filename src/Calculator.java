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
     * Bla bla bla
     * @param numbers is the numbers array
     */
    public static void addLotsOfNumbers(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            addNumbers(numbers[i], numbers[i+1]);
        }
    }

    public static void divideNumbers(int a, int b) {
        System.out.println("Division: " + (a/b));
    }

    public static void main(String[] args) {

    }
}
