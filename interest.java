import java.util.Scanner;
class interest{
public static void main(String[] args){
System.out.println("Finding the simple interest. ");
System.out.println("Enter the principle amount :");
Scanner read = new Scanner(System.in);
int p = read.nextInt();
System.out.println("Enter the time in years:");
int t = read.nextInt();
System.out.println("Enter the rate of interest:");
int r = read.nextInt();
double interest = p*t*r/100 ;
System.out.println("Simple interest is"+interest);
}
}