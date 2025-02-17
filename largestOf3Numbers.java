import java.util.Scanner;
class largestOf3Numbers {
public static void main(String[] args) {
Scanner read = new Scanner(System.in);
System.out.print("Enter the 1st number");
int n1 = read.nextInt();
System.out.print("Enter the 2nd number");
int n2 = read.nextInt();
System.out.print("Enter the 3rd number");
int n3 = read.nextInt();
int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
System.out.println("Largest Number of 3 numbers is" + largest);
}
}