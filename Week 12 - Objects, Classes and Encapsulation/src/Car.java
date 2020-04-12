
class Car {
	private String make, model;
	private int yearOfTheCar;
	
	Car() {  }
	
	Car(String make, String model, int yearOfTheCar) {
		this.make = make;
		this.model = model;
		this.yearOfTheCar = yearOfTheCar;
	}
	
	String getMake() {
		return make;
	}
	
	void setMake(String make) {
		this.make = make;
	}
	
	String getModel() {
		return model;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	int getYearOfTheCar() {
		return yearOfTheCar;
	}
	
	void setYearOfTheCar(int yearOfTheCar) {
		this.yearOfTheCar = yearOfTheCar;
	}
	
	String ToString() {
		return "Make: (" + make + ") " + "Model: (" + model + ") " + "Year of the car: (" + yearOfTheCar + ")"; 
	}
}
