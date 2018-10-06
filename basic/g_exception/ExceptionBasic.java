package g_exception;

public class ExceptionBasic {
	public static void main(String[] args) {
		/*
		1. 프로그램 오류
			- 프로그램이 실행중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우
			- 컴파일 에러: 컴파일 할 때 발생하는 에러
			- 런타임 에러: 실행시에 발생하는 에러
			- 에러는 프로그램 코드에 의해서 수습할 수 없는 심각한 오류(ex. 접속자가 너무 많아 실행이 안되거나 느려지는 일)
			   예외는 프로그램 코드에 의해서 수습될 수 있는 경미한 오류
		
		2. RuntimeException클래스와 그외 클래스들
			- 모든 예외의 최고조상은 Exception이다.
			- RuntimeException클래스들은 주로 프로그래머의 실수에 의해 발생할 수 있는 예외
				ex. IndexOutOfBoundsException, nullpointException...
			- Exception클래스들은 주로 외부의 영향으로 발생할 수 있는 것들
				ex. FileNotFoundException, ClassNotFoundException...
				
					Exception
					/		\
		RuntimeException  그외 Exception
		(개발자 작성오류)
		
		3. 예외처리(try-catch)
			- 프로그램 실행시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것.
			- 작성방법
			  try{
			  		예외가 발생할 가능성이 있는 문장
			  } catch(Exception e){
			  		예외가 발생하였을 때 처리하기 위한 문장
			  } catch(Exception e){
			  		예외가 발생하였을 때 처리하기 위한 문장
			  }
		
		4. 예외 발생시키기
			- 예외를 발생시킬 클래스의 객체를 만든다.
			  Exception e = new Exception();
			- 키워드 throw를 이용해서 에외를 발생시킨다.
			  throw e;
			  
			  throw new Exception();
		
		5. throws Exception(예외를 던지는 것. 개발자가 처리하도록 만드는)
			- 메서드 예외 선언하기
			  : 메서드의 선언부에 키워드 'throws'를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.
		
		6. finally
			- try-catch블럭의 예외발생에 상관없이 실행되어야할 코드를 포함한다.
			
			  try{
			  		예외가 발생할 수 있는 문장
			  }catch(Exception e){
			  		예외 처리를 위한 문장.
			  }finally{
			  		예외 발생에 상관없이 수행될 문장.
			  }
			  
			실행 순서
			try => finally
			try => catch => finally
		
		
		
		
		 */
		
		
	}
}
