public class car{
	public String car_colour;
	public String car_brand;
	public String fuel_type;
	public String milage;
	car(String car_colour,String car_brand,String fuel_type,String milage){
		this.car_colour = car_colour;
		this.car_brand = car_brand;
		this.fuel_type = fuel_type;
		this.milage = milage;
}
	public void start(){
		System.out.println("car is started");
	}
	public void stop() {
        	System.out.println("car is stopped");
    	}
    	public void service() {
        	System.out.println("car is for service");
    	}

}
class main{
	 public static void main(String[] args) {
System.out.println("----------------WELCOME------------------");
		car car1 = new car("black","TaTa","petrol","90");
		car1.start();
		car1.stop();
		car1.service();
		System.out.println("Our first car is "+car1.car_brand);
		System.out.println("Colour is "+car1.car_colour);
		System.out.println("Its fuel type is "+car1.fuel_type);
		System.out.println("Its milage is "+car1.milage);
}
}