package g_exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;

		try{
			//1.수행될 문장을 작성한다.
			System.out.println(a);

			//2.예외가 발생한다
			System.out.println(a/b);//문제의 문장에서 try-catch로 넘어감

			//3.수행될 문장을 적는다.
			System.out.println(b);

		}catch(ArithmeticException e){			//catch 하나만 수행
			System.out.println("0으로 나누지마");
		}catch(Exception e){
			System.out.println("Exception 대빵");
		}
		
		//수행될 문장을 적는다.
		System.out.println();
		
		
		
	}



}
