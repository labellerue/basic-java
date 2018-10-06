package e_oop;

public class CardTest {
	public static void main(String[] args) {
		//1. Card클래스의 width를 출력하세요
		System.out.println(Card.width);
		//2. Card클래스의 height를 출력하세요
		System.out.println(Card.height);
		//3. Card클래스의 객체를 만드세요. 변수명은 cd1
		Card cd1 = new Card();
		//4. Card클래스의 객체를 만드세요. 변수명은 cd2
		Card cd2 = new Card();
		//5. cd1의 kind의 값을 SPADE로 변경하세요
		cd1.kind = "SPADE";
		//6. cd1의 number의 값을 7로 변경하세요
		cd1.number = 7;
		//7. cd2의 kind의 값을 HEART로 변경하세요
		cd2.kind = "HEART";
		//8. cd2의 number의 값을 9로 변경하세요
		cd2.number = 9;
		//9.  아래와 같이 출력하세요
		// cd1의 모양은 SPADE이고 숫자는 7이다.
		// cd1의 너비는 100이고 높이1는 250이다.
		// cd2의 모양은 HEART이고 숫자는 9이다.
		// cd1의 너비는 100이고 높이는 250이다.
		System.out.println("cd1의 모양은 "+ cd1.kind +"이고 숫자는 "+cd1.number+"이다.");
		System.out.println("cd1의 너비는 "+ cd1.width +"이고 높이는 "+cd1.height+"이다.");
		System.out.println("cd2의 모양은 "+ cd2.kind +"이고 숫자는 "+cd2.number+"이다.");
		System.out.println("cd2의 너비는 "+ cd2.width +"이고 높이는 "+cd2.height+"이다.");
		
		//10. cd1의 너비를 50으로, 높이를 80으로 변경하세요
		cd1.width = 50;
		cd1.height = 80;
		
		//11. 9번에서 만든 출력문장을 복붙하세요
		System.out.println("cd1의 모양은 "+ cd1.kind +"이고 숫자는 "+cd1.number+"이다.");
		System.out.println("cd1의 너비는 "+ cd1.width +"이고 높이는 "+cd1.height+"이다.");
		System.out.println("cd2의 모양은 "+ cd2.kind +"이고 숫자는 "+cd2.number+"이다.");
		System.out.println("cd2의 너비는 "+ cd2.width +"이고 높이는 "+cd2.height+"이다.");
		
	}

}

class Card{
	//전역변수
	//클래스변수
	static int width = 100;
	static int height = 250;
	//인스턴스변수
		
	String kind;
	int number;
	
	//인스턴스메서드
	void method(){
		//지역변수
		int v = 60;
	}
	//클래스메서드
	static void method2(){
		
	}
	
	
	
	
	
	
	
	
	
	
}
