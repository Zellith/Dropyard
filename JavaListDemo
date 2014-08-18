import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo {

	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args){

		//fields
		int input, iterator=0;
		int pos, rtrn = 0;

		char choice;
		boolean flag = true, decs = true;
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		//Ask the user to input 10 values
		for(int j=0; j<=9; j++) {
			System.out.println("Input the value you want to add into the list: ");
			input = console.nextInt();

			arrlist.add(input);
		}
		System.out.println(arrlist);

		System.out.println("What would you like to do? \n D - elete \n I - nsert \n "
				+ "P - eek at a index \n F - ind Value \n Q - uit Program");
		choice = console.next().charAt(0);

		while(decs) {
			
			iterator = 0;	//re-initiates the values to their original states
			flag = true;	//sets flag to true
			
			/*checks if return is valid
			 if valid asks user(s) again to input their choice*/
			if(rtrn == -1){
			System.out.println("\nWhat would you like to do? \n D - elete \n I - nsert \n "
					+ "P - eek at a index \n F - ind Value \n Q - uit Program");
			choice = console.next().charAt(0);
			}
			switch(choice) {

			case 'D' :
			case 'd' :
				System.out.println("Input the value you want to delete: ");
				input = console.nextInt();

				/*loops through the list to find the inputed value
				 * if found it will delete the value, if not it'll
				 * display an error message.
				 */
				while(flag) {

					if(arrlist.get(iterator) == input) {
						arrlist.remove(iterator);
						flag = false;
					}
					else if(iterator == arrlist.size()) {
						System.out.println("Value was not found in the list.");
						flag = false;
					}
					iterator++;
				}

				System.out.println(arrlist);
				rtrn = -1;
				break;

			case 'I' :
			case 'i' :
				System.out.println("Input the value you want to add: ");
				input = console.nextInt();

				System.out.println("Input the index position you want to insert the value in: ");
				pos = console.nextInt();

				arrlist.add(pos, input);

				System.out.println(arrlist);
				rtrn = -1;
				break;
				
			case 'P' :
			case 'p' :
				System.out.println("Input a index value to find out the value \nwithin that index: ");
				input = console.nextInt();

				if(input<=arrlist.size()) {
					System.out.println("The value in Index["+input+"] is: "+arrlist.get(input));
				}
				if(input>arrlist.size())
					System.out.println("OUT OF BOUNDS!");
				rtrn = -1;
				break;
				
			case 'F' :
			case 'f' :
				System.out.println("Input a value and find where it's index is located: ");
				input = console.nextInt();

				/*loops through the list to find out if the value is in it or not and displays the 
		 iterator value if found. */
				while(flag) {

					if(arrlist.get(iterator) == input) {
						System.out.println("The value was found at index : "+iterator);
						flag = false;
					}
					if(iterator == arrlist.size()-1) {
						System.out.println("Value was not found in the list.");
						flag = false;
					}
					iterator++;
				}
				rtrn = -1;
				break;
				
			case 'Q' :
			case 'q' :
				decs = false;
				System.out.println("Closing Program...");
				break;
			}
		}
	}
}
