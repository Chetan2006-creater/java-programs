// perimeter using interface concept
interface Shape {
	void getPerimeter()
}
class Rectangle implements Shape{
	int length ;
	int width ;
	Rectangle(int length , int width){
	this.length = length ;
	this.width = width ;
	}
	public void getPerimeter(){
		System.out.println("Perimeter of the rectangle = "+ 2(length + width));
	}
}
class Circle implements Shape{
	int Radius ;
	Rectangle(int Radius){
	this.Radius = Radius ;
	}
	public void getPerimeter(){
		System.out.println("Perimeter of the Circle = "+ 2*3.14*Radius);
	}
}
class Triangle implements Shape{
	int a ;
	int b ;
	int c ;
	Rectangle(int a, int b , int c){
	this.a = a  ;
	this.b = b  ;
	this.c = c  ;
	}
	public void getPerimeter(){
		System.out.println("Perimeter of the Triangle = "+ (a+b+c));
	}
}
class main{
	public static void main(String[] args){
	Rectangle r = new Rectangle(5,10);
	}
}
