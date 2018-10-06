package g_exception;

/**
 * throws Exception
 * 예외 던지기
 * @author pc02
 *
 */
public class Exception04 {
	public static void main(String[] args) {
		method1();
		
		
		
	}
	
	static void method1(){ //오류 발생되는 곳에서 try-catch 실행
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void method2() throws Exception{ //Exception이 여러개면 ,로 더 던질 수 있음
		throw new Exception("메서드 2번에서 발생");
		
	}

	
	
}

