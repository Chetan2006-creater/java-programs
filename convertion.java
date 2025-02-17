// converting the temperature form celcius to fahrenheat 
import java.util.Scanner;
class convertion{
public static void main(String[] args){
Scanner read = new Scanner(System.in);
System.out.print("Enter the temperature in the Celsius:");
float c = read.nextFloat();
float f = (9/5)*c + 32 ;
System.out.print("Temperature in fahrenheat is"+f);
}
}