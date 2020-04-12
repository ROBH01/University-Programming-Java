
public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Car golf = new Car("VW", "Golf", 1998);
		
		car.setMake("Audi");
		car.setModel("S5");
		car.setYearOfTheCar(2016);
		
		System.out.println(car.getMake()); 
		System.out.println(car.getModel());
		System.out.println(car.getYearOfTheCar());
		
		System.out.println(car.ToString()); // gets all values in one string
		System.out.println(golf.ToString());
	}
}
