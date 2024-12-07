import java.util.*;
public class AddAllEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=sc.nextInt();
        int i=1;
        int sum =0;
        while(i<=num){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("The Eve Number Sum Is= "+sum);
    }
}
