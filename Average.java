package Week10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Average {
	static Scanner userinput = new Scanner(System.in);
	
	static double calculateAverage(List<Double> list, int length_of_list) {
		//calculate the average of the numbers provided
		double total = 0;
		for (int j=0; j<length_of_list; j++) {
			total += list.get(j);
		}
		double answer = total / length_of_list;
		return answer;
	}
	public static void main(String[] args) {
		//create a list for the values
		List<Double> values = new ArrayList<>();
		System.out.println("Welcome to the Average Calculator (which is not your average calculator)");
		System.out.print("\nHow many values will you enter: ");
		int number_of_values = userinput.nextInt();
		userinput.nextLine();
		
		//add entered values to the list
		for (int i=0; i<number_of_values; i++) {
			System.out.print("Enter a value: ");
			values.add(userinput.nextDouble());
			userinput.nextLine();
		}
		
		//use the method above to calculate the average
		System.out.println("The average of those values is " + calculateAverage(values, number_of_values));
		
		System.out.println("\nThanks for using the Average Calculator");
	}
}
