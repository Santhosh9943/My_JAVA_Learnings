
package methodDoc;

/*
 * 
 * 
 * Java Methods:
 * 
 * >> A method is a block of code that performs a specific task.
 * 
 * 
 */

class Calculations {

	int a = 5;
	int b = 4;
	

	public int AddNumber(int a,int b) {
		
		int sum = a + b;

		return sum;

	}

}

public class MethodNotes {

	public static void main(String[] args) {

		Calculations add = new Calculations();
		int sum1 = add.AddNumber(add.a,3); // Method calling
		System.out.println(sum1);
	}

}
