package introductiontoJAVA;

public class TASHK4 {

	public static void main(String[] args) 

{
		// 1. Comparing sums of variables
        int a = 10;
        int b = 20;
        int c = 5;
        int d = 15;

        if (a + b > c + d) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        }

        // 2. Checking for even number
        int num = 25; // You can change this value
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }


        // 3. Printing characters A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); // Add a newline for better formatting

        // 4. Swapping two numbers
        int num1 = 5;
        int num2 = 10;
        int temp;

        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);


        // 5. Checking for prime number
        int numberToCheck = 17; // You can change this value
        boolean isPrime = true;

        if (numberToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) { // Optimized check
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }

        // 6. Printing factorial
        int n = 5; // You can change this value
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);

        // 7. Printing string length
        String msg = "Guvi Geek";
        int stringLength = msg.length();
        System.out.println("Length of the string \"" + msg + "\" is " + stringLength);

        // 8. Printing "Welcome to Guvi" 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome to Guvi");
        }

        // 9. Checking for senior citizen (age >= 60)
        int age = 65; // You can change this value

        if (age >= 60) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }

        // 10. Counting digits in an integer
        int integerNumber = 12345; // You can change this value
        int digitCount = 0;
        int tempNumber = integerNumber; // Store a copy to avoid modifying the original

        if(integerNumber == 0){
            digitCount = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                digitCount++;
            }
        }

        System.out.println("Number of digits in " + integerNumber + " is " + digitCount);
    }
}
