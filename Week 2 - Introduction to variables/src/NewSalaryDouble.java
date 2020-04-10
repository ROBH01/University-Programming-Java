/**
 * This program calculates the new salary value by adding a 
 * bonus on to the stored salary
 * Date: [02/10/2017]
 * @author: [Robert Giurgiulescu 4820793]
 * Week 12
 */

public class NewSalaryDouble{

	public static void main(String[] args){
		double currentSalary = 18000.31;
		double newSalary;
		double salaryBonus = 250.50;
		newSalary = currentSalary + salaryBonus;
		System.out.println("Current salary: £" + currentSalary);
		System.out.println("Bonus: £" + salaryBonus);
		System.out.println("New salary: £" + newSalary);
	}
}