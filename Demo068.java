public class Demo068 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {  
                evenCount++;  
            }
        }

        
        System.out.println("Count of even numbers in the array: " + evenCount);
    }
}
