import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Integer Number: ");
        int num=sc.nextInt();
        int rem,sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum Of All The Digits IS: "+sum);
    }
}
