import java.util.Scanner;

class factorial{
public static void main(String[] args){
Scanner read = new Scanner(System.in);
System.out.print("Enter the positive number ");
int n = read.nextInt();
int fac = 1;
for(int i=n;i>=1;i--){
fac = fac*i ;
}
System.out.print("factorial of the numberis = "+fac);
}
}