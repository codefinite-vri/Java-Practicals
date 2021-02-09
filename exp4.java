import java.util.Scanner;
public class greatest {
 public static void main(String [] args)  
 {
     int a,b,c;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a,b,c");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     if((a>b) && (a>c))
     {System.out.println("largest number is"+ a);}
     
     if((b>c) && (b>a))
     {System.out.println("largest number is"+ b);}
     
     if((c>b) && (c>a))
     {System.out.println("largest number is"+ c);}}}
