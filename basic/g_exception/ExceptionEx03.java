package g_exception;

/**
 * throw, try-catch
 * @author pc02
 *
 */
public class ExceptionEx03 {
	public static void main(String[] args) {
		
		Exception e = new Exception("나만의 Exception 만들기/ 이곳에 오류 이유 작성");
		
		try {
			throw e;
		} catch (Exception e1) {
//			System.out.println("예외 발생됨.");
//			e1.printStackTrace();	//오류 이유 알림
			System.out.println(e1.getMessage()); //내가 작성한 오류 이유 알림. String type 반환
		}
		
		try{
			throw new RuntimeException();
		}catch(RuntimeException e1){
			e1.printStackTrace();
		}
		System.out.println();

		//컴파일러가 예외처리를 강제하지 않는 경우
		//1. RuntimeException클래스들
		//2. Error와 그 자손(ex. user가 내는 에러)
		//   이런 것들은 'unChecked예외'라 부른다.
		
		
	}

}
