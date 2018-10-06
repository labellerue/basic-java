package e_oop;
//JVM 만들어오기
public class RecursiveCall {
	public static void main(String[] args) {
		RecursiveCall rc = new RecursiveCall();
		int result = rc.factorial(0);
		System.out.println(result);
		
		
	}
	
	int factorial(int number){		//재귀함수
		int result = 0;
		if(number==1){
			result = 1;
		}else if(number==0){
			System.out.println("0!은 0이 아니라 아랫값이랍니다.");
			result = 1;
		}else{
			result = number*factorial(number-1);
		}
		return result;
	}

}
