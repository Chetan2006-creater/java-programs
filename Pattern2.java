import java.util.Scanner;
class Pattern2 {
public static void main(String[] args){
Scanner read = new Scanner(System.in);
System.out.print("Enter the number ");
int n = read.nextInt();
for(int i = 1;  i <=n ; i++ ){
	for(int k =1; k < i ; k++){
		System.out.print("  ");
	}
	for(int j= 0; j<= n - i ; j++){
		System.out.print(" #");
	}
System.out.println();
}
}
}
