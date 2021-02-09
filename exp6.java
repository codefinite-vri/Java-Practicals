import java.util.Scanner;
public class reverse {
    public static void main(String[] args)
    {
    int a,temp=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        while(a>0)
        {temp=temp*10+a%10;
        a=a/10;}
    System.out.println("reverse is"+ temp);}}
