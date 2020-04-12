
public class TestInterface {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Lion lion = new Lion();
		Employee emp = new Employee();

		Talkative[] talkative = new Talkative[4];
		talkative[0] = dog;
		talkative[1] = cat;
		talkative[2] = lion;
		talkative[3] = emp;

		for (Talkative e : talkative) {
			e.talk();
		}
	}
}
