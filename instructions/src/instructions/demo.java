package instructions;


public class demo {
	public static void main(String[] args){
		int input = 5; 
		int finalResult = summation(input);
		System.out.println("x=" + finalResult);
		System.out.println("==================");
	}
	
	public static int summation(int n){
		int result = (n * (n+1)) / 2;
		return result;
		
	}

}
