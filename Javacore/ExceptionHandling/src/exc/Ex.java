package exc;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[0]);
		int r = a/b;
		System.out.println("ans = " +r);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Wrong data");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Missing  data");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid operation ");
		}
		catch(Exception e)
		{
			System.out.println("other error");
		}
		
		

	}

}
