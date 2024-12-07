import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Hello Krishna");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=sc.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num+" * "+i+"= "+num*i);
            i++;
        }
    }

}