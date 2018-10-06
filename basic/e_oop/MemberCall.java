package e_oop;

public class MemberCall {
	
	int iv = 20;
	static int cv = 30;
	
	int iv2 = cv;
//	static int cv2 = iv;
	
	static void staticMethod(){
		System.out.println(cv);		//클래스 메서드 내에서 클래스 변수를 사용할 수 있다.
//		System.out.println(iv);		//클래스 메서드 내에서 인스턴스 변수를 사용할 수 없다.
	}
	
	void instanceMethod(){
		System.out.println(cv);
		System.out.println(iv);		//같은 클래스 내에서는 인스턴스화가 되었을 때 모든 인스턴스 변수와 메서드가 호출되었기 때문에
									//iv를 따로 인스턴스 할 필요 없다.
	}
	
}
