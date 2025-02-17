import java.util.Scanner;
public class area {
public static void main(String[] args) {
Scanner read = new Scanner(System.in);
System.out.print("Enter the length of the rectangle: ");
int length = read.nextInt();
System.out.print("Enter the width of the rectangle: ");
int width = read.nextInt();
int area = length * width;
if(area>0){
System.out.println("The area of the rectangle is: " + area);
}
else{
System.out.println("Measurements should be negative . Invalid Input");
}
}
}
