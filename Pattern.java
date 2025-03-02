import java.util.Scanner;
class Pattern {
public static void main(String[] args){
Scanner read = new Scanner(System.in);
System.out.print("Enter the number ");
int n = read.nextInt();
for(int i = n-1; i>=0; i-- ){
for(int j= 0; j<=i; j++){
System.out.print(" # ");
}
System.out.println();
}
}
}