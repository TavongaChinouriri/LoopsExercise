public class Ex1 {
    public static void main(String[] args) {
       //Write a program to sum first n even numbers using a while loop.
        int number=0;
        int sum = 0;
        while (number != 10) {
            if (number % 2 == 0) {
                sum += number;
                System.out.println(sum);
                number++;
            } else {
                number++;
            }
        }
    }
}