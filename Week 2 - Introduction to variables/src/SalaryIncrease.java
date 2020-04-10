/**
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [05/10/2017]
 * Week 12
 * 
 * This program increases the current salary by 20%
 */

public class SalaryIncrease{

	public static void main(String[] args){
		double currentSalary = 50000;
		double increasePercentage = 1.2;
		double salaryIncrease = currentSalary * increasePercentage;
		System.out.println("The current salary is: £" + String.format("%,.2f", currentSalary));
		System.out.println("The increased salary is: £" + String.format("%,.2f", salaryIncrease));
	}
}