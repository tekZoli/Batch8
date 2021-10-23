package HomeWorkPractice;

public class PrimeN {
    public static void main(String[] args) {


        int num = 69;

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            // condition for non prime number
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }


    }


}
