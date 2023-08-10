package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int input=8;
		int firstNumber = 0, secondNumber = 1, sum;
		
		System.out.print(firstNumber+", "+secondNumber+", ");
		for (int i = 1; i <= input; i++) {
			sum = firstNumber + secondNumber;
			System.out.print(sum+", ");
			firstNumber=secondNumber;
			secondNumber=sum;

	}
	}
}
