public class Ex5 {
    //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8
    public static void main(String[] args){
        System.out.println("Multiplication table of 8");
        int sum=0;
        for (int n=1; n<=8; ++n){
            int multiple = n*8;
            sum += multiple;
            System.out.println(sum);


        }
    }
}
