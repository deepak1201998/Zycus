package exc;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main... ");
		method1();

		System.out.println("main ends...");
	}

	static void method1() {

		System.out.println("method1()");
		int a, b;

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a : ");
			a = scanner.nextInt();
	
			System.out.print("Enter b : ");
			b = scanner.nextInt();

			method2(a, b);
		}catch(InputMismatchException e) {
			System.out.println("invalid input...");
		}

	}

	static void method2(int a, int b) {
		
		try {
			System.out.println("method2");
			int result = a / b;
			System.out.println("result = " + result);
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("cannot divide a number by 0");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("someting went wrong");
		}
		


	}


}
