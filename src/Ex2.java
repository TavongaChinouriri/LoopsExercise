import java.util.Scanner;
public class Ex2 {
    //Write a program to print the multiplication table of a given number n.
    public static void main(String[] args){
        System.out.print("Enter number ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        System.out.println(". Multiplication table of ");

        int n;
        for (n=0; n<11; n++){
            int multiple = n*m;
            System.out.println(multiple);

        }
    }
}
