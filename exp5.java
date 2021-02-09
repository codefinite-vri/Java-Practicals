import java.util.Scanner;
public class sum {
    public static void main(String[]args)
    {
        int a,temp=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        while(a>0)
        {temp=temp+a%10;
        a=a/10;
     } System.out.println("sum is"+ temp);}}
Output:
enter a number
345
sum is 12
