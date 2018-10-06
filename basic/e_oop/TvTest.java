package e_oop;

public class TvTest {
	public static void main(String[] args) {
		System.out.println(Tv.color);
		Tv.color = "red";
		System.out.println(Tv.color);
		Tv.changeColor();
		System.out.println(Tv.color);
		
		//인스턴스화
		Tv t = new Tv();	//Tv 타입의 참조 변수 선언, main 메서드의 지역변수
							//instance화 될 때 기본값으로 초기화
		t.channel = 100;
		t.channelUp();
		System.out.println(t.channel);
		System.out.println(t.power);
		
		//Tv2의 c변수의 값을 30으로 변경해주세요
		Tv2.c = 30;
		//Tv2의 a의 값을 10으로 변경해주세요
		Tv2 t2= new Tv2();
		t2.a = "10";
		//Tv2의 method()를 호출해주세요
		Tv2.method();
		
		
	}

}

class Tv{

//전역변수(자동 초기화)
	//class 변수
	static String color;		//Tv의 색을 저장	
	//instance 변수
	boolean power;				//전원 상태를 저장
	int channel;				//채널을 저장	
	
	//class 메서드
	/**
	 * 메서드의 설명
	 */
	static void changeColor(){
		color = "yellow";
		//지역변수
		int a =10;
	}
	
	//instance 메서드
	void channelUp(){
		channel++;
	}	
}

class Tv2{
	String a;
	static int c;
	
	static void method(){
		
	}
	
	void method2(){
		
	}
	
}








