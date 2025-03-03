public class Myclass{
static int count = 0;
final double pi = 3.1415;
Myclass(){
count++;
}
public void display(){
System.out.println("value of the count is "+count );
System.out.println("Value of the pi is "+pi+'\n');
}
public static void main(String[] args){
Myclass object1 = new Myclass();
object1.display();
Myclass object2 = new Myclass();
object2.display();
Myclass object3 = new Myclass();
object3.display();
}
}