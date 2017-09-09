package instructions;


public class demo {
	public static void main(String[] args){
		int input = 5; 
		int finalResult = summation(input);
		System.out.print("x=" + finalResult);
	}
	
	public static int summation(int n){
		int result = (n * (n+1)) / 2;
		return result;
		
	}

}
