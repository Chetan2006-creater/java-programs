import java.util.Scanner;
class area{
public static void main(String[] args){
System.out.println("Enter the length of the area :");
Scanner read = new Scanner(System.in);
int l = read.nextInt();
System.out.println("Enter the width of the area :");
int b = read.nextInt();
int area = l*b;
System.out.println("Area of the rectangle is "+area);
}
}