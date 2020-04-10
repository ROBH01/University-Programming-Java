
public class ComputeWeeklyHours3 {

	public static void main(String[] args) {
		int[] mondayhrs = {2, 7, 3, 9, 3, 3, 3, 6};
		int[] tuesdayhrs = {4, 3, 3, 3, 5, 4, 7, 3};
		int[] wednesdayhrs = {3, 4, 4, 4, 4, 4, 4, 5};
		int[] thursdayhrs = {4, 3, 3, 7, 3, 6, 8, 9};
		int[] fridayhrs = {5, 3, 3, 3, 6, 3, 3, 2};
		int[] saturdayhrs = {8, 4, 2, 4, 3, 4, 8, 7};
		int[] sundayhrs = {8, 4, 2, 1, 8, 4, 4, 9};
		System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun\tTotal hours");

		for (int i = 0; i < mondayhrs.length; i++) {
			System.out.println("Employee" + (i + 1) + 
					"\t " + mondayhrs[i] + 
					"\t " + tuesdayhrs[i] + 
					"\t " + wednesdayhrs[i] + 
					"\t " + thursdayhrs[i] + 
					"\t " + fridayhrs[i] + 
					"\t " + saturdayhrs[i] + 
					"\t " + sundayhrs[i] + 
					"\t    " + (mondayhrs[i] + tuesdayhrs[i] + wednesdayhrs[i] + thursdayhrs[i] + fridayhrs[i] + saturdayhrs[i] + sundayhrs[i]));
		}
	}
}
