public class Ex4 {
//Write a program to find the factorial of a given number using for loops.
//    Repeat the problem using a while loop.
    public static void main(String[] args){
        int num = 1;
        int number =5;
        System.out.print("factorial of "+number+" is ");
        for (int i=1; i<=number; i++){
            num=num*i;

        }
        System.out.println(num);
        int j =1;
        int num2=1;
        while (j<=number) {
            num2 = j * num2;
            j++;
        }
        System.out.println("factorial of "+number+" using while loop is "+num2);

    }
}
