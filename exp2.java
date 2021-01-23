import java.util.Scanner;
public class km {
    public static void main(String[] args) {
    float dist;
    System.out.println("Enter distance in km");
    Scanner sc = new Scanner(System.in);
   dist = sc.nextFloat();
    System.out.println("value you entered is "+dist+" km = "+dist*1000+" m ="+dist*10000+"  cm");}}
