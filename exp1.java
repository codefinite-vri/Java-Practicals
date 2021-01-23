import java.util.Scanner;
public class Vedsin {
        int a,b;
        
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter a");
       a=sc.nextInt();
       System.out.println("enter b");
       b=sc.nextInt();
       System.out.println("a="+a+"b="+b);
       a=a+b;
      
       b=a-b;
       a=a-b;
       System.out.println("a="+a+ "b="+b);}}
