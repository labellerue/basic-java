package z_exam;

public class CardTest {
	public static void main(String[] args) {
		//카드의 너비를 출력하세요
		System.out.println(Card.width);
		//카드의 높이를 출력하세요
		System.out.println(Card.height);
		
		//Card 클래스를 인스턴스화 하세요 c1
		Card c1 = new Card();
		
		// kind에 Heart 값을 저장하세요
		c1.kind = "Heart";
		
		//number에 7 값을 저장하세요
		c1.number = 7;
		
		//Card 클래스의 인스턴스를 하나 더 만드세요 c2
		Card c2 = new Card();
		
		//kind에 Spade 값을 저장하세요
		c2.kind = "Spade";
		
		//number에 4 값을 저장하세요
		c2.number = 4;
		
		//출력하세요
		//c1은 *kind* , *number* 이며, 크기는 ( width , height )
		//c2는 *kind* , *number* 이며, 크기는 ( width , height )
		System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width +","+ c1.height + ")");
		System.out.println("c2는 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width +","+ c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		//c1카드의 너비와 높이를 각각 50, 80으로 변경한다
		c1.width = 50;
		c1.height = 80;
		
		//출력하세요
		//c1은 *kind* , *number* 이며, 크기는 ( width , height )
		//c2는 *kind* , *number* 이며, 크기는 ( width , height )
		System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width +","+ c1.height + ")");
		System.out.println("c2는 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width +","+ c2.height + ")");
		
	}

}


//Card 클래스를 생성하세요
class Card{
	//카드 종류 변수를 선언하세요 kind
	String kind;
	
	//카드의 숫자를 담는 변수를 선언하세요 number
	int number;
	
	//카드의 너비 변수를 선언 및 초기화 하세요 width / 100
	static int width = 100;
	
	//카드의 높이 변수를 선언 및 초기화 하세요 height / 250
	static int height = 250;
	
}