import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println("Welcome TomFactorial calculator");
        Factorial();
    }

    public static void Factorial(){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=sc.nextInt();
        int i=1;
        int res=1;
        while(i<=num){
            res*=i;
            i++;
        }
        System.out.println("Factorial Of "+num+" is "+res);

    }
}
