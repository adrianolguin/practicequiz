import javax.swing.JOptionPane;

public class Practice_1 {
	public static void main(String[] args) {
		//0. Create an integer variable and set it equal to 0.
		int x = 0;
		//1. Make a for loop that runs 10 times and put steps 2, 3, 4 inside of it.
		for(int k = 0; k < 10; k++) {	
			//2. Ask the user for a number
		String input1 = JOptionPane.showInputDialog(null, "pick a number, any number");
			//3. Convert their input to an integer
		int input1int = Integer.parseInt(input1);
			//4. Add the number to the integer created in step 0.
		x = x + input1int;
		}
		//5. Display the value of the integer created in step 0.
		System.out.println(x);
		
	}
}
