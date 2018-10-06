package f_oop2;

/**
 * 내부클래스
 * @author soso
 *
 */
public class InnerEx01 {
	
	static class StaticInner{
		int iv = 20;
		static int cv = 50;
		static final int CONST = 200;
	}
	
	class InstanceInner{ //InnerEx01가 인스턴스화 되었을 때 이 클래스가 heap에 올라가야하니까 static은 사용 불가
		int iv = 50;
//		static int cv = 60;			// 클래스 변수 사용 불가능
		static final int CONST = 200;	//예외: 상수는 가능 (상수는 어디든 다 사용 가능. static이기 전에 final이기 때문에
		
	}
	
	void method(){
		
		class LocalClass{//지역클래스
			int iv = 50;
//			static int cv = 60;	인스턴스친구들만 사용 가능
		}
	}

}
